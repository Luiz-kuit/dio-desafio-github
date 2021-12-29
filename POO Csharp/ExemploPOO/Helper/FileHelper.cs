using System.IO;
using System.Collections.Generic;

namespace ExemploPOO.Helper
{
    public class FileHelper
    {
        public void ListarDiretorios(string caminho)
        {
            //Caso queira listar todas as pastas: após caminho acrescentando: , "*", SearchOption.AllDirectories (Dará a possibilidade de buscar todas as pastas e pastas dentro dessas pastas)
            var retornoCaminho = Directory.GetDirectories(caminho, "*", SearchOption.AllDirectories); 

            foreach (var retorno in retornoCaminho)
            {
                System.Console.WriteLine(retorno);
            } 
        }

        public void ListarArquivosDiretorios(string caminho)
        {
            //Caso queira listar todos os arquivos: após caminho acrescentando: , "*", SearchOption.AllDirectories (Dará a possibilidade de buscar todos os arquivos contidos nas pastas).
            //O "*" serve para filtrar todos os arquivos, caso queira filtrar um tipo de arquivo, só colocar, por exemplo "*.txt" ou "*2.txt" ou "*2*"
            var retornoArquivos = Directory.GetFiles(caminho, "*", SearchOption.AllDirectories); 

            foreach (var retorno in retornoArquivos)
            {
                System.Console.WriteLine(retorno);
            } 

        }

        public void CriarDiretorio(string caminho)
        {
           var retorno = Directory.CreateDirectory(caminho);
           System.Console.WriteLine(retorno.FullName);
        }

        //Acrescentando boll "apagarArquivos" para confirma a exclusão do diretório + os seus arquivos.
        public void ApagarDiretorio(string caminho, bool apagarArquivos)
        {
            Directory.Delete(caminho, apagarArquivos);
        }

        public void CriarArquivoTexto(string caminho, string conteudo)
        {
            //Criar uma condição, caso não exista o arquivo dentro da pasta, criar, para que não ocorra a situação de sobrescrever.
            if (!File.Exists(caminho))
            {
                File.WriteAllText(caminho, conteudo);
            }             
        }

        //Criar arquivo stream, se torna mais recomendado quando se tem um numero maior de linhas.
        public void CriarArquivoTextoStream(string caminho, List<string> conteudo)
        {
            using (var stream = File.CreateText(caminho))
            {
                foreach (var linha in conteudo)
                {
                    stream.WriteLine(linha);
                }
            }
            
        }
        //Acrescentar novas linhas ao arquivo
        public void AdicionarTexto(string caminho, string conteudo)
        {
            File.AppendAllText(caminho, conteudo);
        }

        public void AdcionarTextoStream(string caminho, List<string> conteudo)
        {
            using (var stream = File.AppendText(caminho))
            {
                foreach (var linha in conteudo)
                {
                    stream.WriteLine(linha);
                }
            }
            
        }

        public void LerArquivo(string caminho)
        {
           var conteudo = File.ReadAllLines(caminho);

           foreach (var linha in conteudo)
           {
               System.Console.WriteLine(linha);
           }
        }

        public void LerArquivoStream(string caminho)
        {
            string linha = string.Empty;

            using (var stream = File.OpenText(caminho))
            {
                while ((linha = stream.ReadLine())!= null)
                {
                     System.Console.WriteLine(linha);
                }
            }
        }

        //bool "sobrescrever" para substituir um arquivo, caso contenha o mesmo nome.
        public void MoverArquivo (string caminho, string novoCaminho, bool sobrescrever)
        {
            File.Move(caminho, novoCaminho, sobrescrever);
        }

        public void CopiarArquivo(string caminho, string novoCaminho, bool sobrescrever)
        {
            File.Copy(caminho, novoCaminho, sobrescrever);
        }

        public void DeletarArquivo(string caminho)
        {
            File.Delete(caminho);
        }
    }   
}