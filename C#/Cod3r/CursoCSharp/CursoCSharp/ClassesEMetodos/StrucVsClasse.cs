using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    public struct SPonto
    {
        public int X;
        public int Y;
    }

    public class CPonto
    {
        public int X;
        public int Y;
    }
    internal class StrucVsClasse
    {
        public static void Executar()
        {
            SPonto pontoUm = new SPonto { X = 1, Y = 3};
            // Atribuição por valor
            SPonto copiaPontoUm = pontoUm;
            pontoUm.X = 3;

            Console.WriteLine($"Ponto um X: {pontoUm.X}");
            Console.WriteLine($"Copia ponto um X: {copiaPontoUm.X}");

            CPonto pontoDois = new CPonto { X = 2,Y = 4};
            // Atribuição por referência
            CPonto copiaPontoDois = pontoDois; 
            copiaPontoDois.X = 4;

            Console.WriteLine($"Ponto um X: {pontoDois.X}");
            Console.WriteLine($"Copia ponto um X: {copiaPontoDois.X}");
        }
    }
}
