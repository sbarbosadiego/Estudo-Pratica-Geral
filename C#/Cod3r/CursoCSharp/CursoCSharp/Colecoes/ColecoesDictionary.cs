using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Colecoes
{
    internal class ColecoesDictionary
    {
        public static void Executar()
        {
            var filmes = new Dictionary<int, string>();

            filmes.Add(2000, "Eh mole Um");
            filmes.Add(2002, "Eh mole Dois");
            filmes.Add(2004, "Eh mole Três");
            filmes.Add(2006, "Eh mole Quatro");
            filmes.Add(2008, "Eh mole Cinco");

            if (filmes.ContainsKey(2004))
            {
                Console.WriteLine($"2004: {filmes[2004]}");
            }

            Console.WriteLine(filmes.ContainsValue("ui ui"));
            Console.WriteLine(filmes.Remove(2004));
            filmes.TryGetValue(2006, out string filme20006);
            Console.WriteLine($"Filme: {filmes[2006]}");

            foreach ( var chave in filmes.Keys ) 
            {
                Console.WriteLine(chave);   
            }

            foreach (var valor in filmes.Values)
            {
                Console.WriteLine(valor);
            }

            foreach (KeyValuePair<int, string> filme in filmes)
            {
                Console.WriteLine($"Ano: {filme.Key} - Filme: {filme.Value}");
            }

            foreach (var filme in filmes)
            {
                Console.WriteLine($"Ano: {filme.Key} - Filme: {filme.Value}");
            }

        }
    }
}
