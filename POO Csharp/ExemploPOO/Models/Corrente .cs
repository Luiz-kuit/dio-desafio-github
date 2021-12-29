namespace ExemploPOO.Models
{
    public class Corrente : Conta
    {
        //Inserir "override" para sobrescrever a pasta "Conta" que estar como abstract
        public override void Creditar (double valor)
        {
            this.saldo = valor;
        }
    }
}