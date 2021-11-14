fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X $numeroX")
    println("Numero Y $numeroY")

    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}
