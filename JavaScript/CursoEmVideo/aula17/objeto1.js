var pessoa = {
    nome: 'Udyr da Silva', 
    sexo: 'M', 
    peso: 90.4,
    engordar (p = 0){
        console.log('Engordou')
        this.peso += p
    }
}

console.log(typeof pessoa)
console.log(pessoa.peso)
pessoa.engordar(2)
console.log(`${pessoa.nome} pesa ${pessoa.peso}`)

