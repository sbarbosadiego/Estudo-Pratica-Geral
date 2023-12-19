
var numero = [50, 40, 30, 20, 10]

console.log(numero)

// Adiciona mais um valor ao vetor e aumenta seu tamanho
numero.push(60)

numero[2] = 31
console.log(numero)
console.log(numero.length)

// Ordena o vetor
numero.sort()
console.log(numero)

for (var c = 0; c < numero.length; c++) {
    console.log(numero[c])
}