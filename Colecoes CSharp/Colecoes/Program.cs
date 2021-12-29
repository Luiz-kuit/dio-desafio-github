using System.Linq;
using System;
using System.Collections.Generic;
using Colecoes.Helper;

namespace Colecoes
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //Valores mínimo, máximo e médio (LINQ)
            int[] arrayNumeros = new int[10] { 100, 1, 4, 0, 8, 15, 19, 19, 4, 100};

            var minimo = arrayNumeros.Min();
            var maximo = arrayNumeros.Max();
            var medio = arrayNumeros.Average();
            //Utilizando "som" e "distinct": que retorna a uma nova coleção com valores únicos (Distintos)
            var soma = arrayNumeros.Sum();
            var arrayUnico = arrayNumeros.Distinct().ToArray(); //"ToArray" para retornar array de inteiros  

            System.Console.WriteLine($"Minimo: {minimo}");
            System.Console.WriteLine($"Maximo: {maximo}");
            System.Console.WriteLine($"Medio: {medio}");
            System.Console.WriteLine($"Soma: {soma}");
            System.Console.WriteLine($"Array original: {string.Join(", ", arrayNumeros)}");
            System.Console.WriteLine($"Array distinto: {string.Join(", ", arrayUnico)}");
            


            // //Obtendo e ordenando valores (LINQ)
            // int[] arrayNumeros = new int[5] { 1, 4, 8, 15, 19};

            // //Uma forma de realizar esse processo, parecido com o SQL 
            // var numerosParesQuery = 
            //         from num in arrayNumeros
            //         where num % 2 == 0
            //         orderby num
            //         select num;
            
            // //Outra forma de realizar o mesmo processo
            // var numerosParesMetodo = arrayNumeros.Where(x => x % 2 ==0).OrderBy(x => x).ToList();
            
            // System.Console.WriteLine("Números pares query: " + string.Join(", ", numerosParesQuery));
            // System.Console.WriteLine("Números pares método: " + string.Join(", ", numerosParesMetodo));


            
            //#Passando o tipo da chave e valor (Dicionários)

            // Dictionary<string, string> estados = new Dictionary<string, string>();

            // estados.Add("SP", "São Paulo");
            // estados.Add("PE", "Pernambuco");            
            // estados.Add("PB", "Paraiba");

            // foreach (KeyValuePair<string, string> item in estados)
            // {
            //     //Utilizando o "Key" para passar a chave de maneira direta e "Value" para passar seu respectivo valor 
            //     System.Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
            // }


            //Acessando um valor 

            //string valorProcurado = "PE";
            //System.Console.WriteLine(estados[valorProcurado]);


            //Atualizar um valor 

            // string valorProcurado = "PE";
            // System.Console.WriteLine("Valor original:");
            // System.Console.WriteLine(estados[valorProcurado]);

            // estados[valorProcurado] = "PE - teste atualização";

            // System.Console.WriteLine("Valor Atualizado:");
            // System.Console.WriteLine(estados[valorProcurado]);


            //Removendo um valor

            // foreach (KeyValuePair<string, string> item in estados)
            // {
            //     System.Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
            // }

            // string valorProcurado = "PE";
            // System.Console.WriteLine($"Removendo o valor: {valorProcurado}");
            // estados.Remove(valorProcurado);

            // foreach (KeyValuePair<string, string> item in estados)
            // {
            //     System.Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
            // }


            //Acessando uma chave de forma segura, para verificar se o valor existe no dicionário

            // foreach (KeyValuePair<string, string> item in estados)
            // {
                
            // }

            // string valorProcurado = "PE";

            //"TryGetValue" vai obter o valor e ao mesmo tempo dizer se conseguiu ou não obter o valor
            // if(estados.TryGetValue(valorProcurado, out string estadoEncontrado))
            // {
            //     System.Console.WriteLine(estadoEncontrado);            
            // }
            // else
            // {
            //     System.Console.WriteLine($"Chave {valorProcurado} não existe no dicionário");
            // }



            //#Implementando (Pilha)

            // Stack<string> pilhaLivros = new Stack<string>();

            // pilhaLivros.Push(".NET");
            // pilhaLivros.Push("DDD");
            // pilhaLivros.Push("Código limpo");

            // System.Console.WriteLine($"Livros para a leitura: {pilhaLivros.Count}");
            // while (pilhaLivros.Count > 0)
            // {
            //     System.Console.WriteLine($"Próximo livro para a leitura: {pilhaLivros.Peek()}");
            //     //Pop chama o útimo livro da pilha
            //     System.Console.WriteLine($"{pilhaLivros.Pop()} lido com sucesso");
            // }

            // System.Console.WriteLine($"Livros para a leitura: {pilhaLivros.Count}");
            
            
            //#Implementando (Fila)

            // Queue<string> fila = new Queue<string>();

            // fila.Enqueue("Thyago");
            // fila.Enqueue("Leonardo");
            // fila.Enqueue("Camila");

            // System.Console.WriteLine($"Pessoas na fila: {fila.Count}");
            // while (fila.Count > 0)
            // {   
            //     //"Peek" retorna a pessoa que está no começo da fila
            //     System.Console.WriteLine($"Vez de: {fila.Peek()}");
            //     //"Dequeue" chama a pessoa que está na fila e retorna o primeiro elemento e remove.
            //     System.Console.WriteLine($"({fila.Dequeue()} atendido");
            // }
            
            // System.Console.WriteLine($"Pessoas na fila: {fila.Count}");


            
            //Adicionando elemento por índice

            // OperacoesLista opLista = new OperacoesLista();
            // List<string> estados = new List<string> { "PE", "SP", "MG"};
            // string[] estadosArray = new string[2] { "SC", "PB" };

            // System.Console.WriteLine($"Quantidade de elementos na lista: {estados.Count} ");
            
            //Adicionando
            // estados.Insert(1, "RJ");    
            // opLista.ImprimirListaString(estados);
            
            
            //Adicionando coleções a lista 

            // OperacoesLista opLista = new OperacoesLista();
            // List<string> estados = new List<string> { "PE", "SP", "MG"};
            // string[] estadosArray = new string[2] { "SC", "PB" };

            // System.Console.WriteLine($"Quantidade de elementos na lista: {estados.Count} ");
            
            // estados.AddRange(estadosArray);
            // opLista.ImprimirListaString(estados);


            //Declarando e acessando uma lista de forma mais compacta (Coleções Genéricas)

            //OperacoesLista opLista = new OperacoesLista();
            //List<string> estados = new List<string>();
            
            //estados.Add("PE");
            //estados.Add("SP");
            //estados.Add("MG");

            //System.Console.WriteLine($"Quantidade de elementos na lista: {estados.Count} ");

            //opLista.ImprimirListaString(estados)           
           
           
            //Removendo elemento da lista 

            // System.Console.WriteLine("Removendo o elemento");
            // estados.Remove("MG");
            // opLista.ImprimirListaString(estados);

                                   
            
            //Declarando e acessando uma lista (Coleções Genéricas)

            // List<string> estados = new List<string>();
            // estados.Add("PE");
            // estados.Add("SP");
            // estados.Add("MG");

            // System.Console.WriteLine($"Quantidade de elementos na lista: {estados.Count} ");
            
            // foreach (var item in estados)
            // {
            //     System.Console.WriteLine(item);
            // }

            // for (int i = 0; i < estados.Count; i++)
            // {
            //     System.Console.WriteLine($"Índice {i}, Valor: {estados[i]}");
            // }
            


            // OperacoesArray op = new OperacoesArray();

            // int[] array = new int[5] {6, 3, 8, 1, 9};
            // int[] arrayCopia = new int[10];
            
            //Convertendo o Array para o tipo string
            //string[] arrayString = op.converterParaArrayString(array);

            // //Redimensionando Array (Aumentando a capacidade do Array, permanecendo com os mesmos elementos)
            // int valorProcurado = 8;

            // System.Console.WriteLine($"Capacidade atual do array: {array.Length} ");

            // op.RedimensionarArray(ref array, array.Length * 2);

            // System.Console.WriteLine($"Capacidade atual do array, após redimensionar: {array.Length} ");
            

            
            // //Encontrado posição (índice) do Array       

            // int valorProcurado = 8;

            // int indice = op.ObterIndice(array, valorProcurado);

            // //-1 porque 0 é uma posição no array
            // if (indice > -1)
            // {
            //     System.Console.WriteLine($"O indice do elemento {valorProcurado} é: {indice}");
            // }
            // else 
            // {
            //     System.Console.WriteLine("Valor não existente no array");
            // }
            
            
            //Econtrando um elemento dentro do Array

            // int valorProcurado = 3;

            // int valorAchado = op.ObterValor(array, valorProcurado);

            // if(valorAchado > 0)
            // {
            //     System.Console.WriteLine("Encontrei o valor");
            // }
            // else
            // {
            //     System.Console.WriteLine("Não Encontrei o valor");
            // }

            
            
            //Verificando se todos os elementos são maiores que determinado elemento

            // int valorProcurado = 5;

            // bool todosMaiorQue = op.TodosMaiorQue(array, valorProcurado);

            // if (todosMaiorQue)
            // {
            //     System.Console.WriteLine("Todos os valores são maiores que {0}", valorProcurado);
            // }
            // else
            // {
            //     System.Console.WriteLine("Existe valores que não são maiores que {0}", valorProcurado);
            // }

            
            //Verificar se determinado elemento existe no Array

            // int valorProcurado = 1;
            // bool existe = op.Existe(array, valorProcurado);

            // if (existe)
            // {
            //     System.Console.WriteLine("Encontrei o valor: {0} ", valorProcurado);
            // }
            // else
            // {
            //     System.Console.WriteLine("Não encontrei o valor: {0}", valorProcurado);
            // }

            //Ordenando Array

            //System.Console.WriteLine("Array original:");
            //op.ImprimirArray(array);

            //Ordenando através do método BubbleSort
            //op.OrdenarBubbleSort(ref array);
            
            //Ordenando através da classe Array
            //op.Ordenar(ref array);

            //System.Console.WriteLine("Array ordenado");
            //op.ImprimirArray(array);
           
            //Copiando através da classe Array e o método copy
            //Copiando Array 
            // System.Console.WriteLine("Array antes da cópia:");
            // op.ImprimirArray(arrayCopia);

            // op.Copiar(ref array, ref arrayCopia);
            // System.Console.WriteLine("Array após a cópia:");
            // op.ImprimirArray(arrayCopia);

            
            //#Percorrendo Array (Multidimensional)

            // int[,] matriz = new int[4, 2] //1 posição linha, 2 coluna 
            // {
            //     { 8, 8},
            //     { 10, 20},
            //     { 50, 100},
            //     { 90, 200}            
            // };
             
            // for (int i = 0; i < matriz.GetLength(0); i++)
            // {
            //     for (int j = 0; j < matriz.GetLength(1); j++)
            //     {
            //         System.Console.WriteLine(matriz[i, j]);
            //     }   
            // }
            
            //#Exemplo (Array)

            // int [] arrayInteiros = new int[3];

            // arrayInteiros[0] = 10;
            // arrayInteiros[1] = 20;
            // arrayInteiros[2] = int.Parse("30"); //Convertendo de int para string

            // System.Console.WriteLine("Percorrendo o array pelo For");
            // for (int i = 0; i < arrayInteiros.Length; i++)
            // {
            //     System.Console.WriteLine(arrayInteiros[i]);
            // }

            // System.Console.WriteLine("Percorrendo o array pelo ForEach");
            // foreach (int item in arrayInteiros)
            // {
            //     System.Console.WriteLine(item);
            // }

        }
    }
}