
function verificar() {

    var hora = document.getElementById('txtHora')
    var resultado = document.getElementById('resultado')

    if (hora.value.length == 0) {
        resultado.innerHTML = 'Digite uma hora válida'
    } else if (hora.value == 1 || hora.value == '01' || hora.value == '01:01') {
        resultado.innerHTML = '<strong>01:01</strong><br>Alguém te ama.'
    } else if (hora.value == 2 || hora.value == '02' || hora.value == '02:02') {
        resultado.innerHTML = '<strong>02:02</strong><br>Um encontro amoroso está por vir.'
    } else if (hora.value == 3 || hora.value == '03' || hora.value == '03:03') {
        resultado.innerHTML = '<strong>03:03</strong><br>Seu amado(a) é feliz com você.'
    } else if (hora.value == 4 || hora.value == '04' || hora.value == '04:04') {
        resultado.innerHTML = '<strong>04:04</strong><br>Alguém distante está pensando em você.'
    } else if (hora.value == 5 || hora.value == '05' || hora.value == '05:05') {
        resultado.innerHTML = '<strong>05:05</strong><br>Em breve receberá um convite interessante.'
    } else if (hora.value == 6 || hora.value == '06' || hora.value == '06:06') {
        resultado.innerHTML = '<strong>06:06</strong><br>Fará o impossível por seu amor.'
    } else if (hora.value == 7 || hora.value == '07' || hora.value == '07:07') {
        resultado.innerHTML = '<strong>07:07</strong><br>alguém gosta muito de você.'
    } else if (hora.value == 8 || hora.value == '08' || hora.value == '08:08') {
        resultado.innerHTML = '<strong>08:08</strong><br>O dono(a) do seu coração pensou muito em você hoje.'
    } else if (hora.value == 9 || hora.value == '09' || hora.value == '09:09') {
        resultado.innerHTML = '<strong>09:09</strong><br>Seu amor te presenteará.'
    } else if (hora.value == 10 || hora.value == '10' || hora.value == '10:10') {
        resultado.innerHTML = '<strong>10:10</strong><br>Alguém se declarará para você.'
    } else if (hora.value == 11 || hora.value == '11' || hora.value == '11:11') {
        resultado.innerHTML = '<strong>11:11</strong><br>Receberá um recado em breve.'
    } else if (hora.value == 12 || hora.value == '12' || hora.value == '12:12') {
        resultado.innerHTML = '<strong>12:12</strong><br>Coisa boas vão acontecer.'
    } else if (hora.value == 13 || hora.value == '13' || hora.value == '13:13') {
        resultado.innerHTML = '<strong>13:13</strong><br>Você terá um namorado(a) lindo(a).'
    } else if (hora.value == 14 || hora.value == '14' || hora.value == '14:14') {
        resultado.innerHTML = '<strong>14:14</strong><br>Invista em alguém especial.'
    } else if (hora.value == 15 || hora.value == '15' || hora.value == '15:15') {
        resultado.innerHTML = '<strong>15:15</strong><br>Sentem sua falta.'
    } else if (hora.value == 16 || hora.value == '16' || hora.value == '16:16') {
        resultado.innerHTML = '<strong>16:16</strong><br>Uma pessoa próxima quer te beijar.'
    } else if (hora.value == 17 || hora.value == '17' || hora.value == '17:17') {
        resultado.innerHTML = '<strong>17:17</strong><br>O dono dos seus pensamentos, possui um sentimento recíproco por você.'
    } else if (hora.value == 18 || hora.value == '18' || hora.value == '18:18') {
        resultado.innerHTML = '<strong>18:18</strong><br>Alguém que te ama está com saudades.'
    } else if (hora.value == 19 || hora.value == '19' || hora.value == '19:19') {
        resultado.innerHTML = '<strong>19:19</strong><br>Consquistará seu amado(a) o mais rápido do que imagina.'
    } else if (hora.value == 20 || hora.value == '20' || hora.value == '20:20') {
        resultado.innerHTML = '<strong>20:20</strong><br>Terá união no amor.'
    } else if (hora.value == 21 || hora.value == '21' || hora.value == '21:21') {
        resultado.innerHTML = '<strong>21:21</strong><br>Em breve está com quem deseja.'
    } else if (hora.value == 22 || hora.value == '22' || hora.value == '22:22') {
        resultado.innerHTML = '<strong>22:22</strong><br>Alguém sonhou com você na noite passada.'
    } else if (hora.value == 23 || hora.value == '23' || hora.value == '23:23') {
        resultado.innerHTML = '<strong>23:24</strong><br>Jamais será traída(o).'
    } else if (hora.value == 24 || hora.value == '24' || hora.value == '24:24' || hora.value == 0 || hora.value == '00' || hora.value == '00:00') {
        resultado.innerHTML = '<strong>00:00</strong><br>Faça um pedido!.'
    }

}