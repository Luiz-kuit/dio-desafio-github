namespace ExemploConstrutores.Models
{
    public class Aluno : Pessoa 
    {
        //Processo de herança do construtor Pessoa
        public Aluno (string nome, string sobrenome, string disciplina) : base(nome, sobrenome)
        {
            System.Console.WriteLine("Construtor classe aluno!");
        }
    }
}