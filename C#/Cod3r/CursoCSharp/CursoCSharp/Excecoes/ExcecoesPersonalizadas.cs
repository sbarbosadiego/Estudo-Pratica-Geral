﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.Excecoes
{
    public class NegativoException : Exception
    {
        public NegativoException() { }

        public NegativoException(string message) : base(message) { }

        public NegativoException(string message, Exception inner) 
            : base(message, inner) { }
    }


    public class ImparExecption : Exception
    {
        public ImparExecption(string message)  : base(message) { }
    }


    internal class ExcecoesPersonalizadas
    {
        public static int PositivoPar()
        {
            Random random = new Random();
            int valor = random.Next(-30, 30); 

            if (valor < 0 )
            {
                throw new NegativoException("Número negativo");
            }

            if (valor % 2 == 0 )
            {
                throw new NegativoException("Valor impar");
            }

            return valor;
        }
        public static void Executar()
        {
            try
            {
                Console.WriteLine(PositivoPar());
            } catch(NegativoException ex)
            {
                Console.WriteLine(ex.Message);
            } catch(ImparExecption ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
