using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class ExemploStruct
    {
        interface Ponto
        {
            void MoverNaDiagonal(int delta);
        }

        struct Coordenada: Ponto
        {
            public int X;
            public int Y;

            public Coordenada(int x, int y)
            {
                X = x;
                Y = y;
            }

            public void MoverNaDiagonal(int delta)
            {
                X += delta;
                Y += delta;
            }
        }

        public static void Executar()
        {
            Coordenada coodernadaInicial;
            coodernadaInicial.X = 2;
            coodernadaInicial.Y = 2;

            Console.WriteLine($"Coordenada Inicial:\n" +
                $"X = {coodernadaInicial.X}\n" +
                $"Y = {coodernadaInicial.Y}");

            var coordenadaFinal = new Coordenada(x: 9, y: 1);
            coordenadaFinal.MoverNaDiagonal(10);
            Console.WriteLine($"Coordenada Final:\n" +
                $"X = {coordenadaFinal.X}\n" +
                $"Y = {coordenadaFinal.Y}");

        }
    }
}
