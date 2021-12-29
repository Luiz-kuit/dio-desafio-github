namespace ExemploConstrutores.Models
{
    public class Calculadora
    {
        // Delegate Criado para o "Evento"
        public delegate void DelegateCalculadora();

        // Evento
        public static event DelegateCalculadora EventoCalculadora;
        public static void Somar(int x, int y)
        {
            //Condição Criada para o evento
            if (EventoCalculadora != null)
            {
                System.Console.WriteLine($"Adição: {x + y}");
                EventoCalculadora();
            }
            else
            {
                System.Console.WriteLine("Nenhum inscrito");
            }
        }

        public static void Subtrair(int x, int y)
        {
        
            System.Console.WriteLine($"Subtração: {x - y}");
        }

    }
}