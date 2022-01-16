using System;

namespace DIO.CopaNordeste  
{
    class Program
    {
        static EquipeRepositorio repositorio = new EquipeRepositorio();
        static void Main(string[] args)
        {
            string opcaoUsuario = ObterOpcaoUsuario();

            while (opcaoUsuario.ToUpper() != "X")
            {
                switch (opcaoUsuario)
                {
                    case "1":
                        ListarEquipes();
                        break;
                    case "2":
                        InserirEquipe();
                        break;
                    case "3":
                        AtualizarEquipe();
                        break;
                    case "4":
                        ExcluirEquipe();
                        break;
                    case "5":
                        VisualizarEquipe();
                        break;
                    case "C":
                        Console.Clear();
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();    
                }

                opcaoUsuario = ObterOpcaoUsuario();
            }

            Console.WriteLine("Obrigado por utilizar nossos serviços.");
            Console.ReadLine();
        }
        private static void VisualizarEquipe()
        {
            Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(Console.ReadLine());

            var equipe = repositorio.RetornaPorId(indiceEquipe);
           
            Console.WriteLine(equipe);
        }

        private static void ExcluirEquipe()
        {
            Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(Console.ReadLine());

            Console.Write("\r\nEquipe Excluída com Sucesso!\r\n");

            repositorio.Exclui(indiceEquipe);
        }

        private static void AtualizarEquipe()
        {
            Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(Console.ReadLine());

            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getvalues?view=netcore-3.1
			// https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getname?view=netcore-3.1
            foreach (int i in Enum.GetValues(typeof(Estado)))
            {
                Console.WriteLine("{0}-{1}", i, Enum.GetName(typeof(Estado), i));
            }
            Console.Write("Digite o Estado entre as opções acima: ");
            int entradaEstado = int.Parse(Console.ReadLine());

            Console.Write("Digite o Nome da Equipe: ");
			string entradaNome = Console.ReadLine();

			Console.Write("Digite o Nome do Estádio: ");
			string entradaEstadio = Console.ReadLine();

			Console.Write("Digite a Cidade do Estádio: ");
			string entradaCidadeEstadio = Console.ReadLine();

            Console.Write("\r\nEquipe Atualizada com Sucesso!\r\n");

            Equipe atualizaEquipe = new Equipe(id: indiceEquipe,
                                            estado: (Estado)entradaEstado,
                                            nome: entradaNome,
                                            estadio: entradaEstadio,
                                            cidadeEstadio: entradaCidadeEstadio);  

            repositorio.Atualiza(indiceEquipe, atualizaEquipe);
        }

        private static void InserirEquipe()
		{
			Console.Write("Inserir nova equipe:\r\n");
            
            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getvalues?view=netcore-3.1
			// https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getname?view=netcore-3.1
            foreach (int i in Enum.GetValues(typeof(Estado)))
            {
                Console.WriteLine("{0}-{1}", i, Enum.GetName(typeof(Estado), i));
            }
            Console.Write("Digite o Estado entre as opções acima: ");
            int entradaEstado = int.Parse(Console.ReadLine());

            Console.Write("Digite o Nome da Equipe: ");
			string entradaNome = Console.ReadLine();

			Console.Write("Digite o Nome do Estádio: ");
			string entradaEstadio = Console.ReadLine();

			Console.Write("Digite a Cidade do Estádio: ");
			string entradaCidadeEstadio = Console.ReadLine();

            Console.Write("\r\nEquipe Inserida com Sucesso!\r\n");

            Equipe novaEquipe = new Equipe(id: repositorio.ProximoId(),
                                            estado: (Estado)entradaEstado,
                                            nome: entradaNome,
                                            estadio: entradaEstadio,
                                            cidadeEstadio: entradaCidadeEstadio);  

            repositorio.Insere(novaEquipe);
        } 

        private static void ListarEquipes()
        {
            Console.WriteLine("Listar equipes");
            var lista = repositorio.Lista();

            if (lista.Count == 0)
            {
                Console.WriteLine("Nenhuma equipe cadastrada.");
                return;
            }

            foreach (var equipe in lista)
            {
                var excluido = equipe.retornaExcluido();

                Console.WriteLine("#ID {0}: - {1} {2}", equipe.retornaId(), equipe.retornaNome(), (excluido ? "*Excluído*" : ""));
            }
        }

        private static string ObterOpcaoUsuario()
        {
            Console.WriteLine();
            Console.WriteLine("Seja bem vindo ao DIO Copa do Nordeste!");
            Console.WriteLine("Informe a opção desejada:");

            Console.WriteLine("1- Listar equipes");
            Console.WriteLine("2- Inserir nova equipe");
            Console.WriteLine("3- Atualizar equipe");
            Console.WriteLine("4- Excluir equipe");
            Console.WriteLine("5- Visualizar equipe");
            Console.WriteLine("C- Limpar Tela");
            Console.WriteLine("X- Sair");
            Console.WriteLine();

            string opcaoUsuario = Console.ReadLine().ToUpper();
            Console.WriteLine();
            return opcaoUsuario;

        }   
    }    
}        
