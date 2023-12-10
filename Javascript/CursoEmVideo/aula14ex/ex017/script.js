
function tabuada() {

    var numero = document.getElementById('txtNumero')
    var tabuada = document.getElementById('selectTabuada')
    
    if (numero.value.length == 0) {
        window.alert('Digite um valor válido')
    } else {
        var numeroTabuada = Number(numero.value)
        tabuada.innerHTML = ''
        for (var c = 1; c <= 10; c++) {
            var linha = document.createElement('option')
            linha.text = `${numeroTabuada} X ${c} = ${numeroTabuada * c}`
            linha.value = `tabuada${c}`
            tabuada.appendChild(linha)
        }
    }

}