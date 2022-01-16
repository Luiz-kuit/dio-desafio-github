using System;
using System.Collections.Generic;
using DIO.CopaNordeste.Interfaces;

namespace DIO.CopaNordeste
{
    public class EquipeRepositorio : IRepositorio<Equipe>
    {
        private List<Equipe> listaEquipe = new List<Equipe>();
        public void Atualiza(int id, Equipe objeto)
        {
            listaEquipe[id] = objeto;
        }

        public void Exclui(int id)
        {
            listaEquipe[id].Excluir();
        }

        public void Insere(Equipe objeto)
        {
            listaEquipe.Add(objeto);
        }

        public List<Equipe> Lista()
        {
            return listaEquipe;
        }

        public int ProximoId()
        {
            return listaEquipe.Count;
        }

        public Equipe RetornaPorId(int id)
        {
            return listaEquipe[id];
        }
    }
}