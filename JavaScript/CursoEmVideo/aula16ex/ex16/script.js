
var numero = document.getElementById('txtNumero')
var lista = document.getElementById('flista')
var resultado = document.getElementById('resultado')
var valores = []

function isNumero(n) {
    if(Number(n) >= 1 && Number(n) <= 100) {
        return true
    } else {
        return false
    }
}

function inLista(n, l) {
    if(l.indexOf(Number(n)) != -1) {
        return true
    } else {
        return false
    }
}

function adicionar() {
    if(isNumero(numero.value) && !inLista(numero.value, valores)) {
        valores.push(Number(numero.value))
        let item = document.createElement('option')
        item.text = `Valor ${numero.value} adicionado`
        lista.appendChild(item)
        resultado.innerHTML = ''
    } else {
        window.alert('Valor inválido')
    }
    numero.value = ''
    numero.focus()
}

function finalizar() {
    if (valores.length == 0 ) {
        window.alert('Não há valores informados na lista')
    } else {
        let total = valores.length
        let valorMaior = valores[0]
        let valorMenor = valores[0]
        let somaTotal = 0
        let media = 0

        for (var posicao in valores) {
            somaTotal += valores[posicao]
            if (valores[posicao] > valorMaior) {
                valorMaior = valores[posicao]
            }
            if (valores[posicao] < valorMenor) {
                menorValor = valores[posicao]
            }
        }
        media = somaTotal / total
        resultado.innerHTML = ''
        resultado.innerHTML += `<p>Há no total ${total} números cadastrados.</p>`
        resultado.innerHTML += `<p>O maior valor informado foi ${valorMaior}</p>`
        resultado.innerHTML += `<p>O menor valor informado foi ${valorMenor}</p>`
        resultado.innerHTML += `<p>A soma total dos valores é ${somaTotal}</p>`
        resultado.innerHTML += `<p>A média dos valores é ${media.toFixed(2)}</p>`
    }
}