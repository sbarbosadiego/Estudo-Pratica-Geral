fn main() {
    // Em rust é utilizado snake case, ao invés de camel case
    let numero_um: i32 = 50;
    let numero_dois: i32 = 80;
    let numero_tres: i32 = 10;

    if numero_um > (numero_dois + numero_tres) {
        println!("{numero_um} é maior que {numero_dois} + {numero_tres}");
    } else if numero_dois > (numero_tres + numero_um) {
        println!("{numero_dois} é maior que {numero_tres} + {numero_um}");
    } else {
        print!("{numero_tres} é maior que {numero_um} + {numero_dois}")
    }
}
