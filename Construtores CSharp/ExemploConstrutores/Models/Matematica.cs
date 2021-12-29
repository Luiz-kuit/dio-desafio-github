namespace ExemploConstrutores.Models
{
    public class Matematica
    {
        public int X { get; set; }
        public int Y { get; set; }

        public Matematica(int x, int y)
        {
            X = x;
            Y = y;

            //Trazendo a ação do evento e executando o método "EventHandler"
            Calculadora.EventoCalculadora += EventHandler;
        }

        public void Somar()
        {
            Calculadora.Somar(X, Y);
        }

        //Incluindo o método no evento
        public void EventHandler()
        {
            System.Console.WriteLine("Método executado");
        }
    }
}