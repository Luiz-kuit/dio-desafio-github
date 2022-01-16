using DIO.CopaNordeste.Interfaces;
using Microsoft.AspNetCore.Mvc;

namespace DIO.CopaNordeste.Web.Controllers
{
    //Criar a rota do Controller 
    [Route("[controller]")]
    public class EquipeController : Controller
    {
        
        private readonly IRepositorio<Equipe> _repositorioEquipe;

        //Injenção de dependência (desacomplando o repositório do controller)
        public EquipeController(IRepositorio<Equipe> repositorioEquipe)
        {
            _repositorioEquipe = repositorioEquipe;
        }

        /*
         * GET = Retorna algo
         * POST = Inserir algo
         * PUT = Alterar algo 
         * DELETE = Excluir algo
         */

        //Pegando a Lista do repositório "equipe"

        [HttpGet("")]
        public IActionResult Lista()
        {
            return Ok(_repositorioEquipe.Lista().Select(e => new EquipeModel(e)));
        }

        [HttpPut("{id}")]
        public IActionResult Atualiza(int id, [FromBody] EquipeModel model )
        {
            _repositorioEquipe.Atualiza(id, model.ToEquipe()); //AutoMapper: Pesquisar! 
            return NoContent();
        }

        [HttpDelete("{id}")]
        public IActionResult Exclui(int id)
        {
            _repositorioEquipe.Exclui(id);
            return NoContent();
        }

        [HttpPost("")]
        public IActionResult Insere([FromBody] EquipeModel model)
        {
            
            model.Id = _repositorioEquipe.ProximoId();
            Equipe equipe = model.ToEquipe();
                        
            _repositorioEquipe.Insere(equipe);
            return Created("", equipe);
        }

        [HttpGet("{id}")]
        public IActionResult Consulta(int id)
        {
            //Implementando manualmente 
            return Ok (new EquipeModel (_repositorioEquipe.Lista().FirstOrDefault(e => e.Id == id)));
        }

    }
}
