
function contar() {

    var inicio = document.querySelector('#txtInicio')
    var fim = document.querySelector('#txtFim')
    var passo = document.querySelector('#txtPasso')
    var resultado = document.querySelector('div#resultado')

    if (inicio.value.length == 0) {
        window.alert('Verifique o valor informado no campo: Início')
        resultado.innerHTML = 'Preparando a contagem...'
    } else if (fim.value.length == 0) {
        window.alert('Verifique o valor informado no campo: Fim')
        resultado.innerHTML = 'Preparando a contagem...'
    } else if (passo.value.length == 0) {
        window.alert('Verifique o valor informado no campo: Passo')
        resultado.innerHTML = 'Preparando a contagem...'
    } else {
        resultado.innerHTML = 'Contado: <br>'
        let valorInicio = Number(inicio.value)
        let valorFim = Number(fim.value)
        let valorPasso = Number(passo.value)

        if (valorPasso <= 0) {
            window.alert('Valor inválido')
            valorPasso = 1
        } else if (valorInicio < valorFim) {
            // Contagem crescente
            for (var c = valorInicio; c <= valorFim; c += valorPasso) {
                resultado.innerHTML += `${c} \u{1F449}`
            }
            resultado.innerHTML += '\u{1F3C1}'
        } else {
            // Contagem decrescente
            for (var c = valorInicio; c >= valorFim; c -= valorPasso) {
                resultado.innerHTML += `${c} \u{1F449}`
            }
            resultado.innerHTML += '\u{1F3C1}' 
        }

    }

}