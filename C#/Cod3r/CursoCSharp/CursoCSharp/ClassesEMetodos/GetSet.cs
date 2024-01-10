using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CursoCSharp.ClassesEMetodos
{
    internal class GetSet
    {
        public class Moto
        {
            private string Marca;
            private string Modelo;
            private int Cilindrada;

            public Moto() { }

            public Moto(string marca, string modelo, int cilindrada)
            {
                this.Marca = marca;
                this.Modelo = modelo;
                this.Cilindrada = cilindrada;
            }

            public string GetMarca()
            {
                return this.Marca;
            }

            public void SetMarca(string marca)
            {
                this.Marca = marca;
            }

            public string GetModelo()
            {
                return this.Modelo;
            }

            public void SetModelo(string modelo)
            {
                this.Modelo = modelo;
            }

            public int GetCilindrada()
            {
                return this.Cilindrada;
            }

            public void SetCilindrada(int cilindrada)
            {
                if (cilindrada > 0)
                {
                    this.Cilindrada = cilindrada;
                } else if (cilindrada < 0)
                {
                    this.Cilindrada = Math.Abs(cilindrada);
                }
            }

            public void FichaMoto()
            {
                Console.WriteLine($"========= MOTO =========\n" +
                    $"Marca: {this.GetMarca()}\n" +
                    $"Modelo: {this.GetModelo()}\n" +
                    $"Cilindrada: {this.GetCilindrada()}");
            }

        }
        public static void Executar()
        {
            var moto1 = new Moto("Kawasaki","Ninja ZX-6R", 636);
            Moto moto2 = new Moto();
            
            moto2.SetMarca("Honda");
            moto2.SetModelo("CG Titan");
            moto2.SetCilindrada(-150);
            
            moto1.FichaMoto();
            moto2.FichaMoto();

        }
    }
}
