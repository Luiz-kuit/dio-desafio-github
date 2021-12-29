using System;
using System.Collections.Generic;
using System.Linq;
using Primeiro_projeto_CSharp;
using Interface;
using Enum;

namespace Primeiro_projeto_CSharp 
{
    public class Program 
    {
        public static void Main(string[] args)
        {
            var pessoa = (Pessoas)0;
            Pessoas pessoa2 = Pessoas.Thyago;
            Pessoas pessoa3 = (Pessoas)4;

            Animal animal = new Animal();

            animal.Nome = "Nolo";
            animal.NomeDono = "Marcos";
            animal.Especie = "Dog";

            Pessoa person = new Pessoa();

            person.Nome = "Thyago";
            person.Idade = 30;
            person.Estado = "PE";

            var person2 = new Pessoa();
            person2.Nome = "Camila";
            person2.Idade = 33;
            person2.Estado = "PE";



            Console.WriteLine(pessoa2);
        }
    }
}