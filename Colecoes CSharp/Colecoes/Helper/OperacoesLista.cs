using System.Collections.Generic;

namespace Colecoes.Helper
{
    public class OperacoesLista
    {
        //Declarando e acessando uma lista (Coleções Genéricas)
        public void ImprimirListaString(List<string>lista)
        {
            for (int i = 0; i < lista.Count; i++)
            {
                System.Console.WriteLine($"Índice {i}, Valor: {lista[i]}");
            }
        }
    }
}