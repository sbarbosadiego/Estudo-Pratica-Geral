using System;
using System.Linq;
using System.Threading.Tasks;
using System.IO;

namespace CursoCSharp.API
{
    internal class PrimeiroArquivo
    {
        public static void Executar()
        {
            // @ antes da string interpreta de forma literal
            var path = @"~/primeiro_arquivo.txt";

            if (File.Exists(path))
            {
                using (StreamWriter sw = File.CreateText(path))
                {
                    sw.WriteLine("eh mole eh mole eh mole");
                    sw.WriteLine("eh mole eh mole eh mole");
                    sw.WriteLine("eh mole eh mole eh mole");
                }
            }
        }
    }
}
