namespace ExemploPOO.Models
{
    public class Computador : System.Object //clica em cima de "object" e aperta "f12" para listar seus métodos.
    {
        //Sobrescrevendo "System.object" através do atalho "override" para herdar seus métodos.
        public override string ToString()
        {
            return "Sou uma classe computador";
        }
    }
}