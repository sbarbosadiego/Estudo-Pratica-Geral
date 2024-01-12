using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ExemploEnum
    {
        public enum Genero { Acao, Aventura, Terror, Animacao, Comedia};

        public class Filme
        {
            public string Titulo;
            public Genero GeneroDoFilme;
        }
        public static void Executar()
        {
            int id = (int)Genero.Comedia;
            Console.WriteLine(id);

            var filme = new Filme();
            filme.Titulo = "Dentro da Hilux";
            filme.GeneroDoFilme =  Genero.Acao;

            Console.WriteLine($"Titulo: {filme.Titulo}\nGenero: {filme.GeneroDoFilme}");

        }
    }
}
