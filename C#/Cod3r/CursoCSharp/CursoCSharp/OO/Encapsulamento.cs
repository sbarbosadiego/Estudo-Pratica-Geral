using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Encapsulamento;

namespace CursoCSharp.OO
{
    internal class Encapsulamento
    {
        public class FilhoNaoReconhecido : SubCelebridade
        {
            public new void MeusAcessos()
            {
                Console.WriteLine("Filho não reconhecido");
                Console.WriteLine(CorDoOlho);
                Console.WriteLine(JeitoDeFalar);
                //Console.WriteLine(UsaMuitoPhotoshop);
                //Console.WriteLine(SegredoFamilia);
                //Console.WriteLine(NumeroCelular);
            }


        }

        public class AmigoDistante
        {
            public readonly SubCelebridade amiga = new SubCelebridade();

            public void MeusAcessos()
            {
                Console.WriteLine("Amigo Distante");
                Console.WriteLine(amiga.InfoPublica);
                //Console.WriteLine(amiga.CorDoOlho);
                //Console.WriteLine(amiga.JeitoDeFalar);
                //Console.WriteLine(amiga.NumeroCelular);
            }
        }

        public static void Executar()
        {
            SubCelebridade sub = new SubCelebridade();
            sub.MeusAcessos();

            new FilhoNaoReconhecido().MeusAcessos();
            new AmigoProximo().MeusAcessos();

            new FilhoNaoReconhecido().MeusAcessos();
            new AmigoDistante().MeusAcessos();

        }
    }
}
