var idade = 20

if (idade < 16) {
    console.log('Não vota')
} else if (idade < 18) {
    console.log('Voto opcional')
} else if (idade >= 18 && idade < 70) {
    console.log('Voto obrigatório')
} else {
    console.log('Voto facultativo')
}