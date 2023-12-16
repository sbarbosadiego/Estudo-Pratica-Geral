using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ex08
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private async void btnSortear_Click(object sender, RoutedEventArgs e)
        {
            int inicio, fim;
            int.TryParse(txtInicio.Text, out inicio);
            int.TryParse(txtFim.Text, out fim);

            Random random = new Random();
            int numero = random.Next(inicio, fim + 1);
            lblResultado.Visibility = Visibility.Visible;
            lblResultado.Content = $"Sorteando...";
            await Task.Delay(2000);
            lblResultado.Content = $"Sorteado: {numero}";
            

        }
    }
}
