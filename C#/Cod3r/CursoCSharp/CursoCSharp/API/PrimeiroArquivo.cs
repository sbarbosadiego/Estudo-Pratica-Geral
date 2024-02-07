using System;
using System.Linq;
using System.Threading.Tasks;
using System.IO;
using System.Runtime.InteropServices;

namespace CursoCSharp.API
{
    public static class EstensaoString
    {
        public static string ParseHome(this string path)
        {
            string home = (Environment.OSVersion.Platform == PlatformID.Unix ||
                Environment.OSVersion.Platform == PlatformID.MacOSX)
                ? Environment.GetEnvironmentVariable("HOME")
                : Environment.ExpandEnvironmentVariables("%HOMEDRIVE%%HOMEPATH%");
            return path.Replace("~", home);
        }
    }

    internal class PrimeiroArquivo
    {
        public static void Executar()
        {
            // @ antes da string interpreta de forma literal
            var path = @"~/primeiro_arquivo.txt".ParseHome();

            if (!File.Exists(path))
            {
                using (StreamWriter sw = File.CreateText(path))
                {
                    sw.WriteLine("eh mole eh mole eh mole");
                    sw.WriteLine("eh mole eh mole eh mole");
                    sw.WriteLine("eh mole eh mole eh mole");
                }
            }

            using (StreamWriter sw = File.AppendText(path)) {
                sw.WriteLine("eh duro");
                sw.WriteLine("eh duro");
                sw.WriteLine("");
            }
        }
    }
}
