using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Colecoes
{
    internal class ColecoesArrayList
    {

        public static void Executar()
        {
            var arraylist = new ArrayList
            {
                "Eh mole",
                4.2,
                false,
                43.5F
            };

            arraylist.Add("ugaaa");

            foreach (var elemento in arraylist)
            {
                Console.WriteLine($"{elemento.ToString(), -8} - {elemento.GetType()}");
            }

        }
    }
}
