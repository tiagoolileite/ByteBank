fun testaLacos() {

    var i = 0
    while (i < 5) {
        val titular = "Tiago Leite $i"
        val numeroConta = 1000 + i
        var saldo = 10.0
        saldo += i

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        println()
        i++

    }

}
