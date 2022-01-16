namespace DIO.CopaNordeste
{
    public class Equipe : EntidadeBase
    {
        // Atributos
		private Estado Estado { get; set; }
		private string Nome { get; set; }
		private string Estadio { get; set; }
		private string CidadeEstadio { get; set; }
        private bool Excluido {get; set;}

        // Métodos 

        public Equipe(int id, Estado estado, string nome, string estadio, string cidadeEstadio)
        {
            this.Id = id;
            this.Estado = estado;
            this.Nome = nome;
            this.Estadio = estadio;
            this.CidadeEstadio = cidadeEstadio;
            this.Excluido = false;
        }

        public override string ToString()
        {
            // Environment.NewLine: Interpreta como o sistema operacional reconhece a nova linha.
            string retorno = "";
            retorno += "Estado: " + this.Estado + Environment.NewLine;
            retorno += "Nome do Time: " + this.Nome + Environment.NewLine;
            retorno += "Estádio: " + this.Estadio + Environment.NewLine;
            retorno += "Cidade do Estádio: " + this.CidadeEstadio + Environment.NewLine;
            retorno += "Excluído: " + this.Excluido;
            return retorno;
        }

        public string retornaNome()
        {
            return this.Nome;
        }

        public int retornaId()
        {
            return this.Id;
        }

        public bool retornaExcluido()
        {
            return this.Excluido;
        }

        public Estado retornaEstado()
        {
            return this.Estado;
        }

        public string retornaEstadio()
        {
            return this.Estadio;
        }

        public string retornaCidadeEstadio()
        {
            return this.CidadeEstadio;
        }
        public void Excluir()
        {
            this.Excluido = true;
        }
    }
}