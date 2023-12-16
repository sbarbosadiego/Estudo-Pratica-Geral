
function verificar() {

    var hora = document.getElementById('txtHora')
    var resultado = document.getElementById('resultado')

    if (hora.value.length == 0) {
        resultado.innerHTML = 'Digite uma hora válida.'
    } else {
        switch (Number(hora.value)) {
            case 0:
                resultado.innerHTML = '<strong>00:00</strong><br>Faça um pedido!.'
                break
            case 1:
                resultado.innerHTML = '<strong>01:01</strong><br>Alguém te ama.'
                break
            case 2:
                resultado.innerHTML = '<strong>02:02</strong><br>Um encontro amoroso está por vir.'
                break
            case 3:
                resultado.innerHTML = '<strong>03:03</strong><br>Seu amado(a) é feliz com você.'
                break
            case 4:
                resultado.innerHTML = '<strong>04:04</strong><br>Alguém distante está pensando em você.'
                break
            case 5:
                resultado.innerHTML = '<strong>05:05</strong><br>Em breve receberá um convite interessante.'
                break
            case 6:
                resultado.innerHTML = '<strong>06:06</strong><br>Fará o impossível por seu amor.'
                break
            case 7:
                resultado.innerHTML = '<strong>07:07</strong><br>Alguém gosta muito de você.'
                break
            case 8:
                resultado.innerHTML = '<strong>08:08</strong><br>O dono(a) do seu coração pensou muito em você hoje.'
                break
            case 9:
                resultado.innerHTML = '<strong>09:09</strong><br>Seu amor te presenteará.'
                break
            case 10:
                resultado.innerHTML = '<strong>10:10</strong><br>Alguém se declarará para você.'
                break
            case 11:
                resultado.innerHTML = '<strong>11:11</strong><br>Receberá um recado em breve.'
                break
            case 12:
                resultado.innerHTML = '<strong>12:12</strong><br>Coisas boas vão acontecer.'
                break
            case 13:
                resultado.innerHTML = '<strong>13:13</strong><br>Você terá um namorado(a) lindo(a).'
                break
            case 14:
                resultado.innerHTML = '<strong>14:14</strong><br>Invista em alguém especial.'
                break
            case 15:
                resultado.innerHTML = '<strong>15:15</strong><br>Sentem sua falta.'
                break
            case 16:
                resultado.innerHTML = '<strong>16:16</strong><br>Uma pessoa próxima quer te beijar.'
                break
            case 17:
                resultado.innerHTML = '<strong>17:17</strong><br>O dono dos seus pensamentos, possui um sentimento recíproco por você.'
                break
            case 18:
                resultado.innerHTML = '<strong>18:18</strong><br>Alguém que te ama está com saudades.'
                break
            case 19:
                resultado.innerHTML = '<strong>19:19</strong><br>Consquistará seu amado(a) o mais rápido do que imagina.'
                break
            case 20:
                resultado.innerHTML = '<strong>20:20</strong><br>Terá união no amor.'
                break
            case 21:
                resultado.innerHTML = '<strong>21:21</strong><br>Em breve está com quem deseja.'
                break
            case 22:
                resultado.innerHTML = '<strong>22:22</strong><br>Alguém sonhou com você na noite passada.'
                break
            case 23:
                resultado.innerHTML = '<strong>23:23</strong><br>Jamais será traído(a).'
                break
            default:
                resultado.innerHTML = 'Digite um hora válida.'
        }
    }

}