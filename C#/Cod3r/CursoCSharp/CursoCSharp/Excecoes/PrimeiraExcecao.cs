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

                Saldo -= valor;
            }
        }

        public static void Executar()
        {
            Conta contaUm = new Conta(1_200.55);

            try
            {
                contaUm.Sacar(1500);
                Console.WriteLine("Saque realizado com sucesso");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("Tchau");
            }

        }
    }
}
