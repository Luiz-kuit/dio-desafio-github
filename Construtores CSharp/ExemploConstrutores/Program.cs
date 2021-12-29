using System;
using ExemploConstrutores.Models;

namespace ExemploConstrutores
{
    class Program
    {
        //# Exemplo (Delegate)
        ////Definindo o delegate
        public delegate void Operacao(int x, int y);
        static void Main(string[] args)
        {
            //# Exemplo (Evento) 
            //Matematica m = new Matematica(10, 20);
            //m.Somar();        



            //# Exemplo (Multi Cast Delegate)
            //Operacao op = new Operacao(Calculadora.Somar);
            //op += Calculadora.Subtrair;
            //op.Invoke(20, 20);
            
            //# Exemplo (Delegate)
            //Outra formar de declarar: operacao op = Calculadora.Somar;
            //Operacao op = new Operacao(Calculadora.Somar);
            //Outra formar de declarar: op(20, 20);
            //op.Invoke(20, 20);
            
            
            
            //# Exemplo (Constante)
            //const double pi = 3.14;
            //Console.WriteLine(pi);


            
            //# Exemplo 2 propriedades (Get e Set)
            //Data data = new Data();
            //data.Mes = 12;
            //data.ApresentarMes();

            //# Exemplo 1 (Get e Set) 
            //Data data = new Data();
            //data.SetMes(13);
            //System.Console.WriteLine(data.Mes);
            //data.ApresentarMes();
            
            
            
            //# Exemplo (Chamando o Construtor da Herança)
            //Aluno p1 = new Aluno("Thyago", "Luiz", "Teste");
            //p1.Apresentar();


            
            //# Exemplo (Construtor Privado)
            //Log log = Log.GetInstance();

            //log.PropriedadeLog = "Teste instancia";

            //Mesma instância do log 1, ou seja, essa mesma propriedade servirá em toda a construção do código
            //Log log2 = Log.GetInstance();
            //System.Console.WriteLine(log2.PropriedadeLog);


            
            //# Exemplo de Construtor
            //Pessoa p1 = new Pessoa("Thyago", "Santos");
            //p1.Apresentar();
        }
    }
}