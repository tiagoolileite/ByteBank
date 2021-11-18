import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X $numeroX")
    println("Numero Y $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    val contaMaria = ContaPoupanca("Maria", 1003)

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}
