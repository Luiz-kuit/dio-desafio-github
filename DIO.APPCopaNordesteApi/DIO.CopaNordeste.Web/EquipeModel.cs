using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DIO.CopaNordeste.Web
{
    public class EquipeModel
    {
        public int Id { get; set; }
        public Estado Estado { get; set; }
        public string Nome { get; set; }
        public string Estadio { get; set; }
        public string CidadeEstadio { get; set; }
        public bool Excluido { get; set; }

        //Construtor em branco para ininicializar
        public EquipeModel() { }


        //Criação do construtor 
        public EquipeModel(Equipe equipe)
        {
            Id = equipe.retornaId();
            Estado = equipe.retornaEstado();
            Nome = equipe.retornaNome();
            Estadio = equipe.retornaEstadio();
            CidadeEstadio = equipe.retornaCidadeEstadio();
            Excluido = equipe.retornaExcluido();

        }

        //Contrário
        public Equipe ToEquipe()
        {
            return new Equipe(Id, Estado, Nome, Estadio, CidadeEstadio);
        }

    }
}
