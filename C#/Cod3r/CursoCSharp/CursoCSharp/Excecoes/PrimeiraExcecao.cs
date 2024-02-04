using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Excecoes
{
    internal class PrimeiraExcecao
    {
        public class Conta
        {
            double Saldo;

            public Conta(double Saldo)
            {
                Saldo = Saldo;
            }

            public void Sacar(double valor)
            {
                if (valor > Saldo)
                {
                    throw new ArgumentException("Saldo insuficiente");
                }
            }
        }

        public static void Executar()
        {

        }
    }
}
