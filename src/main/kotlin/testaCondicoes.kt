fun testaCondicao(saldo: Double, numeroConta: Int) {

    when {
        saldo > 0.0 -> println("A conta $numeroConta é positiva. Saldo: $saldo")
        saldo == 0.0 -> println("A conta $numeroConta é neutra. (saldo zerado)")
        else -> println("A conta $numeroConta é negativa. Saldo: $saldo")
    }

    if (saldo > 0.0) {
        println("A conta $numeroConta é positiva. Saldo: $saldo")
    } else if (saldo == 0.0) {
        println("A conta $numeroConta é neutra. (saldo zerado)")
    } else {
        println("A conta $numeroConta é negativa. Saldo: $saldo")
    }

}