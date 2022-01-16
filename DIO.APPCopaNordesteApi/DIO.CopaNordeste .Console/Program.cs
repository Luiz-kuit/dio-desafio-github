using System;
using DIO.CopaNordeste;

namespace DIO.CopaNordeste.Console
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
                        System.Console.Clear();
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();
                }

                opcaoUsuario = ObterOpcaoUsuario();
            }

            System.Console.WriteLine("Obrigado por utilizar nossos serviços.");
            System.Console.ReadLine();
        }
        private static void VisualizarEquipe()
        {
            System.Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(System.Console.ReadLine());

            var equipe = repositorio.RetornaPorId(indiceEquipe);

            System.Console.WriteLine(equipe);
        }

        private static void ExcluirEquipe()
        {
            System.Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(System.Console.ReadLine());

            System.Console.Write("\r\nEquipe Excluída com Sucesso!\r\n");

            repositorio.Exclui(indiceEquipe);
        }

        private static void AtualizarEquipe()
        {
            System.Console.Write("Digite o id da equipe: ");
            int indiceEquipe = int.Parse(System.Console.ReadLine());

            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getvalues?view=netcore-3.1
            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getname?view=netcore-3.1
            foreach (int i in Enum.GetValues(typeof(Estado)))
            {
                System.Console.WriteLine("{0}-{1}", i, Enum.GetName(typeof(Estado), i));
            }
            System.Console.Write("Digite o Estado entre as opções acima: ");
            int entradaEstado = int.Parse(System.Console.ReadLine());

            System.Console.Write("Digite o Nome da Equipe: ");
            string entradaNome = System.Console.ReadLine();

            System.Console.Write("Digite o Nome do Estádio: ");
            string entradaEstadio = System.Console.ReadLine();

            System.Console.Write("Digite a Cidade do Estádio: ");
            string entradaCidadeEstadio = System.Console.ReadLine();

            System.Console.Write("\r\nEquipe Atualizada com Sucesso!\r\n");

            Equipe atualizaEquipe = new Equipe(id: indiceEquipe,
                                            estado: (Estado)entradaEstado,
                                            nome: entradaNome,
                                            estadio: entradaEstadio,
                                            cidadeEstadio: entradaCidadeEstadio);

            repositorio.Atualiza(indiceEquipe, atualizaEquipe);
        }

        private static void InserirEquipe()
        {
            System.Console.Write("Inserir nova equipe:\r\n");

            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getvalues?view=netcore-3.1
            // https://docs.microsoft.com/pt-br/dotnet/api/system.enum.getname?view=netcore-3.1
            foreach (int i in Enum.GetValues(typeof(Estado)))
            {
                System.Console.WriteLine("{0}-{1}", i, Enum.GetName(typeof(Estado), i));
            }
            System.Console.Write("Digite o Estado entre as opções acima: ");
            int entradaEstado = int.Parse(System.Console.ReadLine());

            System.Console.Write("Digite o Nome da Equipe: ");
            string entradaNome = System.Console.ReadLine();

            System.Console.Write("Digite o Nome do Estádio: ");
            string entradaEstadio = System.Console.ReadLine();

            System.Console.Write("Digite a Cidade do Estádio: ");
            string entradaCidadeEstadio = System.Console.ReadLine();

            System.Console.Write("\r\nEquipe Inserida com Sucesso!\r\n");

            Equipe novaEquipe = new Equipe(id: repositorio.ProximoId(),
                                            estado: (Estado)entradaEstado,
                                            nome: entradaNome,
                                            estadio: entradaEstadio,
                                            cidadeEstadio: entradaCidadeEstadio);

            repositorio.Insere(novaEquipe);
        }

        private static void ListarEquipes()
        {
            System.Console.WriteLine("Listar equipes");
            var lista = repositorio.Lista();

            if (lista.Count == 0)
            {
                System.Console.WriteLine("Nenhuma equipe cadastrada.");
                return;
            }

            foreach (var equipe in lista)
            {
                var excluido = equipe.retornaExcluido();

                System.Console.WriteLine("#ID {0}: - {1} {2}", equipe.retornaId(), equipe.retornaNome(), (excluido ? "*Excluído*" : ""));
            }
        }

        private static string ObterOpcaoUsuario()
        {
            System.Console.WriteLine();
            System.Console.WriteLine("Seja bem vindo ao DIO Copa do Nordeste!");
            System.Console.WriteLine("Informe a opção desejada:");

            System.Console.WriteLine("1- Listar equipes");
            System.Console.WriteLine("2- Inserir nova equipe");
            System.Console.WriteLine("3- Atualizar equipe");
            System.Console.WriteLine("4- Excluir equipe");
            System.Console.WriteLine("5- Visualizar equipe");
            System.Console.WriteLine("C- Limpar Tela");
            System.Console.WriteLine("X- Sair");
            System.Console.WriteLine();

            string opcaoUsuario = System.Console.ReadLine().ToUpper();
            System.Console.WriteLine();
            return opcaoUsuario;

        }
    }
}
