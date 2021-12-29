using System;

namespace Colecoes.Helper
{
    public class OperacoesArray
    {
        public void OrdenarBubbleSort(ref int[] array)
        {
            int temp = 0;
            for (int i = 0; i < array.Length; i++)
            {
                for (int j = 0; j < array.Length - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
                   
                
            }
        }
        public void ImprimirArray(int[] array)
        {
            var linha = string.Join(", ", array);
            System.Console.WriteLine(linha);
       
        }

        //Ordenando pela classe Array
        public void Ordenar(ref int[] array)
        {
            Array.Sort(array);
        }

        //Criando uma cópia do Array
        public void Copiar(ref int[]array, ref int[] arrayDestino)
        {
            Array.Copy(array, arrayDestino, array.Length);
        }


        //Verificar se determinado elemento existe no Array, não ref o array, pois não vai precisar manipular, só saber se existe ou não.
        public bool Existe(int[] array, int valor)
        {
            return Array.Exists(array, elemento => elemento == valor);
        }

        //Verificando se todos os elementos são maiores que determinado elemento
        public bool TodosMaiorQue(int[] array, int valor)
        {
            return Array.TrueForAll(array, elemento => elemento > valor);
        }

        //Econtrando um elemento dentro do Array 
        public int ObterValor(int[] array, int valor)
        {
            return Array.Find(array, element => element == valor);
        }

        //Encontrado posição (índice) do Array
        public int ObterIndice(int[]array, int valor)
        {
            return Array.IndexOf(array, valor);
        }    

        //Redimensionando Array 
        public void RedimensionarArray(ref int[] array, int novoTamanho)
        {
            Array.Resize(ref array, novoTamanho);
        }   

        //Convertendo Array
        public string[] converterParaArrayString(int[] array)
        {
            return Array.ConvertAll(array, elemento => elemento.ToString());
        }
    }
}