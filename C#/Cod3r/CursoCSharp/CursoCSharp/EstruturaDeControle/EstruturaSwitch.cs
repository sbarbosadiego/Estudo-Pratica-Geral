using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.EstruturaDeControle
{
    internal class EstruturaSwitch
    {
        public static void Executar()
        {
            Console.Write("Avalie o atendimento: ");
            int.TryParse(Console.ReadLine(), out int nota);

            switch (nota)
            {
                case 0:
                    Console.WriteLine($"Nota: {nota} | Péssimo");
                    break;
                case 1:
                case 2:
                    Console.WriteLine($"Nota: {nota} | Ruim");
                    break;
                case 3:
                    Console.WriteLine($"Nota: {nota} | Regular");
                    break;
                case 4:
                    Console.WriteLine($"Nota: {nota} | Bom");
                    break;
                case 5:
                    Console.WriteLine($"Nota: {nota} | Ótimo");
                    break;
                default:
                    Console.WriteLine("Nota inválida");
                    break;

            }

        }
    }
}
