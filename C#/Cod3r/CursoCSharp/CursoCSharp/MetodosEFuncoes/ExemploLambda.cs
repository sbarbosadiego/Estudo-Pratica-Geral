using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.MetodosEFuncoes
{
    internal class ExemploLambda
    {
        public static void Executar()
        {
            // Void
            Action algoNoConsole = () =>
            {
                Console.WriteLine("Lambda");
            };
            algoNoConsole();

            // Não tem parâmetro e retorna apenas um int
            Func<int> jogarDado = () =>
            {
                Random random = new Random();
                return random.Next(1, 6);
            };
            Console.WriteLine(jogarDado());

            // int = parâmetro, string = retorno
            // X indica a formatação em hexadecimal
            Func<int, string> conversorHex = numero => numero.ToString("X");
            Console.WriteLine(conversorHex(2015));

            Func<int, int, int, string> formartarData = (dia, mes, ano) => String.Format($"{dia:D2}/{mes:D2}/{ano:D2}");
            Console.WriteLine(formartarData(4, 8, 2015));
        }
    }
}
