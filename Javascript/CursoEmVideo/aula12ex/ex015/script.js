
function verificar() {

    var data = new Date()
    var anoAtual = data.getFullYear()
    var formularioAno = document.getElementById('txtAno')
    var resultado = document.querySelector('div#resultado')

    if (formularioAno.value.length == 0 || Number(formularioAno.value) > anoAtual) {
        window.alert('Verifique a data informada')
    } else {
        var formularioSexo = document.getElementsByName('radioSexo')
        var idade = anoAtual - Number(formularioAno.value)
        var genero = ''
        var imagem = document.createElement('img')
        imagem.setAttribute('id', 'foto')
        if (formularioSexo[0].checked) {
            genero = 'um homem'
            if (idade >=0 && idade < 10){
                //criança
                imagem.setAttribute('src', 'imagens/homem-crianca.png')
            } else if (idade < 21) {
                //jovem
                imagem.setAttribute('src', 'imagens/homem-jovem.png')
            } else if (idade < 50) {
                //adulto
                imagem.setAttribute('src', 'imagens/homem-adulto.png')
            } else {
                //idoso
                imagem.setAttribute('src', 'imagens/homem-idoso.png')
            }
        } else if (formularioSexo[1].checked) {
            genero = ' uma mulher'
            if (idade >=0 && idade < 10){
                //criança
                imagem.setAttribute('src', 'imagens/mulher-crianca.png')
            } else if (idade < 21) {
                //jovem
                imagem.setAttribute('src', 'imagens/mulher-jovem.png')
            } else if (idade < 50) {
                //adulto
                imagem.setAttribute('src', 'imagens/mulher-adulta.png')
            } else {
                //idoso
                imagem.setAttribute('src', 'imagens/mulher-idosa.png')
            }
        }
        resultado.style.textAlign = 'center'
        resultado.innerHTML = `Você é ${genero} de ${idade} anos de idade.`
        resultado.appendChild(imagem)
    }

}