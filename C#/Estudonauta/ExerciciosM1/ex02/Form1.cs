using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private async void button1_Click(object sender, EventArgs e)
        {
            lblMensagem.Visible = true;
            lblMensagem1.Visible = true;
            lblMensagem2.Visible = true;

            await Task.Delay(1000);
            lblMensagem.BackColor = Color.Blue;
            lblMensagem.ForeColor = Color.White;
            await Task.Delay(1000);
            lblMensagem1.BackColor = Color.Yellow;
            lblMensagem1.ForeColor = Color.Green;
            await Task.Delay(1000);
            lblMensagem2.BackColor = Color.Green;
            lblMensagem2.ForeColor = Color.Yellow;

        }

        private void lblMensagem2_Click(object sender, EventArgs e)
        {

        }
    }
}
