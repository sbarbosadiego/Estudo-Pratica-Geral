using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.OO
{
    sealed class SemFilho
    {
        public double ValorDaFortuna()
        {
            return 1_823_873.65;
        }
    }

    //class SouFilho : SemFilho
    //{

    //}

    class Avo
    {
        // Virtual permite a sobrescrita do método
        public virtual bool HonrarNomeFamilia()
        {
            return true;
        }
    }

    class Pai : Avo
    {
        // A classe herda, sobrescreve e trava a sobrescrita
        public override sealed bool HonrarNomeFamilia()
        {
            return true;
        }
    }
    class FilhoRebelde : Pai
    {
        // Não é possível herdar e sobresver um método sealed, poderia ser ocultado por um "new"
        //public override bool HonrarNomeFamilia()
        //{
        //    return false;
        //}
    }

    internal class Sealed
    {
        public static void Executar()
        {
            SemFilho semFiho = new SemFilho();
            Console.WriteLine(semFiho.ValorDaFortuna());

            FilhoRebelde filho = new FilhoRebelde();
            Console.WriteLine(filho.HonrarNomeFamilia());

        }
    }
}
