var hora = 18
var dataAtual = new Date()
var horaAtual = dataAtual.getHours()

if (hora >= 6 && hora < 12) {
    if (hora == 11) {
        console.log(`Hora Atual: ${hora}\nBom Dia, está quase na hora do almoço`)
    } else {
        console.log(`Hora Atual: ${hora}\nBom Dia`)
    }
} else if (hora >= 12 && hora < 18) {
    if (hora == 12 || hora == 13) {
        console.log(`Hora atual: ${hora}\nBoa tarde, um bom almoço`)
    } else if (hora == 16 || hora == 17) {
        console.log(`Hora Atual: ${hora}\nBoa Tarde\nHora do café da tarde`)
    } else {
        console.log(`Hora Atual: ${hora}\nBoa Tarde`)
    }
} else if (hora >= 18 && hora <= 24) {
    if (hora == 24 || hora == 23) {
        console.log(`Hora Atual: ${hora}\nBoa Noite, está na hora de dormir`)
    } else {
        console.log(`Hora Atual: ${hora}\nBoa Noite`)
    }
} else {
    console.log(`Hora Atual: ${hora}\nVocê deveria estar dormindo a essa hora da madrugada`)
}