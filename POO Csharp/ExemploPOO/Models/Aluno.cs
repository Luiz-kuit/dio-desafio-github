using System;

namespace ExemploPOO.Models
{
    //Herdando da classe Pessoa1
    public class Aluno : Pessoa1
    {
        public int Nota { get; set; }

        //"override" sobrescreve o método "Apresentar" da classe "pai"
        public override void Apresentar()
        {
           Console.WriteLine($"Olá, meu nome é {Nome} e sou um aluno nota {Nota}");
        }
    }
}