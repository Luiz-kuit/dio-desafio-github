namespace ExemploConstrutores.Models
{
    public class Pessoa
    {
        //Usando "readonly" (somente leitura), existem só duas situações que pode alterar o seu valor, sendo ela na sua inicialização e também dentro do construtor"
        private readonly string nome = "Thyago";
        private readonly string sobrenome;

        //Criar construtor através do atalho: ctro + tab

        // public Pessoa() //Exemplo de construtor com o parâmetro vazio (Padrão)
        // {
        //     nome = string.Empty;
        //     sobrenome = string.Empty;
        // }

        public Pessoa(string nome, string sobrenome) //Exemplo de construtor recebendo parâmetro
        {
            this.nome = nome;
            this.sobrenome = sobrenome;
            System.Console.WriteLine("Construtor classe pessoal!");
        }

        public void Apresentar()
        {
            System.Console.WriteLine($"Olá, meu nome é: {nome} {sobrenome}");
        }

    }   
}