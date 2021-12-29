using System;
using System.Collections.Generic;
using ExemploPOO.Helper;
using ExemploPOO.Interfaces;
using ExemploPOO.Models;


namespace ExemploPOO 
{
    class Program
    {
        public static void Main(string[] args)
        {
            //# Manipulando Arquivos
            //Nome da pasta de destino
            var caminho = "C:\\TrabalhandoComArquivos"; 
            var caminhoPathCombine = Path.Combine(caminho, "Pasta teste 1");
            var caminhoArquivo = Path.Combine(caminho, "arquivo-teste-stream.txt");
            var caminhoArquivoTeste = Path.Combine(caminho, "arquivo-teste.txt");
            var caminhoArquivoTesteCopia = Path.Combine(caminho, "arquivo-teste=bkp.txt");
            var novoCaminhoArquivo = Path.Combine(caminho, "Pasta Teste 2", "arquivo-teste-stream.txt");
            var listaString = new List<string> {"Linha 1", "Linha 2", "Linha 3"};
            var listaStringContinuação = new List<string> {"Linha 4", "Linha 5", "Linha 6"};
            
            FileHelper helper = new FileHelper();
            //helper.ListarDiretorios(caminho);
            //helper.ListarArquivosDiretorios(caminho);
            //helper.CriarDiretorio(caminhoPathCombine);
            //helper.ApagarDiretorio(caminhoPathCombine, true);
            //helper.CriarArquivoTexto(caminhoArquivo, "olá! Teste de escrita de arquivo");
            //helper.CriarArquivoTextoStream(caminhoArquivo, listaString);
            //helper.AdcionarTextoStream(caminhoArquivo, listaStringContinuação);
            //helper.LerArquivoStream(caminhoArquivo);
            //helper.MoverArquivo(caminhoArquivo, novoCaminhoArquivo, false);
            //helper.CopiarArquivo(caminhoArquivoTeste, caminhoArquivoTesteCopia, false);
            //helper.DeletarArquivo(caminhoArquivoTesteCopia);
            


            //# Interfaces 
            //Obs.:Calculadora implementa Icalculadora.
            //ICalculadora calc = new Calculadora();
            //Console.WriteLine(calc.Somar(10, 20));



            // # Exemplos (Classes Abstratas)

            // //Método (classe object)
            //Computador comp = new Computador();
            //Vai herdar métodos da classe "Object", conforme a pasta "Computador";
            //Console.WriteLine(comp.ToString());
            
            // //Método (selada)
            //pasta "Diretor".  

            // //Método (classe Abstrata) 
            //Corrente herda da classe Conta e sobrescrever "Creditar" por estar abstrato. 
            // Corrente c = new Corrente();
            // c.Creditar(100);
            // c.ExibirSaldo();   



            // # Exemplos (Polimorfismo)

            // //Polimorfismo em tempo de compilação 
            // Calculadora calc = new Calculadora();
            // //Chamando o método de "somar", é dado as opções de quantidade criadas na pasta "calculadora" 
            // Console.WriteLine("Resultado da primeira soma: " + calc.Somar(10, 10));
            // Console.WriteLine("Resultado da segunda soma: " + calc.Somar(10, 10, 10));
            
            // //Polimorfismo em tempo de execução
            // Professor p1 = new Professor();
            // p1.Nome = "Bob";
            // p1.Idade = 20; 
            // p1.Documento = "123456456";
            // p1.Salario = 2000;
            // //Método "Apresentar" da classe "Pessoa1.Apresentar" foi sobrescrito pela classe que herdou "Professor.Apresentar"    
            // p1.Apresentar();          
            
            // Aluno p2 = new Aluno();
            // p2.Nome = "Thyago";
            // p2.Idade = 30; 
            // p2.Documento = "123456735";
            // p2.Nota = 10;
            // //Método "Apresentar" da classe "Pessoa1.Apresentar" foi sobrescrito pela classe que herdou "Aluno.Apresentar"
            // p2.Apresentar();


            
            // # Exemplo Aluno e Professor (Herança)   

            // Professor p1 = new Professor();
            // Aluno p2 = new Aluno();

            // //Professor
            // p1.Salario = 2000;
            // p1.Nome = "Bob";
            // p1.Idade = 20; 
            // p1.Documento = "123456456";
            
            // //Aluno
            // p2.Nota = 10;
            // p2.Nome = "Thyago";
            // p2.Idade = 30;
            // p2.Documento = "123456735";
            
            // p1.Apresentar();
            // Console.WriteLine($"Meu salário é R$ {p1.Salario}");
            // Console.WriteLine($"Documento {p1.Documento}");

            // p2.Apresentar();                        
            // Console.WriteLine($"Minha nota final foi: {p2.Nota}"); 
            // Console.WriteLine($"Documento {p2.Documento}");



            // # Exemplo Retangulo (Encapsulamento)

            // Valores validos
            // Retangulo r = new Retangulo();
            // r.DefinirMedidas(30, 30);
            // Console.WriteLine($"Área: {r.ObterArea()}");
            
            // Valores invalidos
            // Retangulo r2 = new Retangulo();
            // r.DefinirMedidas(0, 0);
            // Console.WriteLine($"Área: {r2.ObterArea()}");
           
            // # Exemplo Pessoa (Abstração)

            // Pessoa1 p1 = new Pessoa1();
            // p1.Nome = "Bob";
            // p1.Idade = 20; 
            // p1.Apresentar();
            
        }
    }
}