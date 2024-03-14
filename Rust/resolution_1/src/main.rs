fn main() {
    // let declara variável, não é necessário informar o tipo da variável
    let nome = "Diego";

    // Caso seja necessário explicitar o tipo de variável, a mesma é feita da forma abaixo
    let sobrenome: &str = "Barbosa";

    /*
    Não é possível fazer a atribuição de um novo valor a uma variável com um valor já atribuído
    Exemplo:
    let nome = "silva";
    É nessário informar o mut após o let, para informar ao compilador que é uma variável mutavel
    */

    let mut idade = 25;
    idade += 1;

    // Ao imprimir as variáveis
    println!("Nome: {nome} {sobrenome}");
    // Ou
    println!("Nome: {} {}", nome, sobrenome);
    println!("{idade}");
}
