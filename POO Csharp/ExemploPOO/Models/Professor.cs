namespace ExemploPOO.Models
{
    //Herdando da classe Pessoa1
    public class Professor : Pessoa1
    {
        public double Salario { get; set; }

        //"override" sobrescreve o método "Apresentar" da classe "pai"
        public override void Apresentar()
        {
           Console.WriteLine($"Olá, meu nome é {Nome} e sou um professor e ganho R$ {Salario}");
        }        
    }
}