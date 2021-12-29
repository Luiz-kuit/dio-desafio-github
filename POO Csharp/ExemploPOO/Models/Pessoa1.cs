using System;


namespace ExemploPOO.Models
{
    public class Pessoa1
    {
        public string? Nome { get; set; }

        public int Idade {get; set; }

        public string? Documento {get; set; }

        //"virtual" autoriza a sobrescrever o método "Apresentar"
        public virtual void Apresentar()
        {
            Console.WriteLine($"Olá, meu nome é {Nome} e tenho {Idade} anos");
        }
    }
}