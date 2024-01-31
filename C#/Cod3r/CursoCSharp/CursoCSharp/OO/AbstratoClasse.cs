using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.OO
{
    internal class AbstratoClasse
    {
        public abstract class Celular
        {
            public abstract string Assistente();
            public string Tocar()
            {
                return "uga uga uga";
            }
        }

        public class Samsung : Celular
        {
            public override string Assistente()
            {
                return "Bixby";
            }
        }
        
        public class Iphone : Celular
        {
            public override string Assistente()
            {
                return "Siri";
            }
        }

        public static void Executar()
        {
            var celulares = new List<Celular>
            {
                new Iphone(),
                new Samsung()
            };

            foreach (var celular in celulares) 
            {
                Console.WriteLine(celular.Assistente());
            }
        }
    }
}
