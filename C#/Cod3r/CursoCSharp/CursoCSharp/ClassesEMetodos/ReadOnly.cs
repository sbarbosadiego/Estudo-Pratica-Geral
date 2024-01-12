using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ReadOnly
    {
        public class Cliente
        {
            public string Nome;
            readonly DateTime Nascimento;

            public Cliente(string nome, DateTime nascimento)
            {
                Nome = nome;
                Nascimento = nascimento;
            }

            public string GetDataDeNascimento()
            {
                return String.Format($"{Nascimento.Day}/{Nascimento.Month}/{Nascimento.Year}");
            }
        }
        public static void Executar()
        {
            var cliente = new Cliente("Sam On", new DateTime(2001, 8, 4));

            Console.WriteLine(cliente.Nome);
            Console.WriteLine(cliente.GetDataDeNascimento()); 
        }
    }
}
