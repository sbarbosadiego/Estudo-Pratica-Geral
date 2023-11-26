using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M1A10
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int dia = DateTime.Now.Day;
            int mes = DateTime.Now.Month;
            int ano = DateTime.Now.Year;
            int hora = DateTime.Now.Hour;
            int minutos = DateTime.Now.Minute;

            Console.WriteLine($"Data atual: {dia}/{mes}/{ano}");
            Console.WriteLine($"Hora atual: {hora}:{minutos}");
            Console.ReadKey();

        }
    }
}
