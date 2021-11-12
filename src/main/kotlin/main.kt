fun main() {

    println("Bem vindo ao Bytebank!")

    //var ou val para variávies - val não pode ser alterado
    /*No caso do uso de var, sempre inicializar antes de atribuir novo valor ou utilizar a variável.
    No caso de val, necessário inicialização*/
    //Para declarar, usar : e o tipo. Ex: val titular: String = "Tiago Leite"
    val titular = "Tiago Leite"
    val numeroConta = 1000
    //Double declarado implicitamente deve-se usar 0 . para informar que é um decimal
    var saldo = 0.0

    saldo = 100 + 2.0
    saldo += 200
    saldo = 0.0
    saldo -= 800

    //String template usando "$" e a variável desejada pode substituir a concatenação ("" + "")
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    /*if (saldo > 0.0) { //Para linha única na instrução de execução, podem ser ocultadas as chaves "{ }"
        println("A conta $numeroConta é positiva. Saldo: $saldo")
    } else if (saldo == 0.0) {
        println("A conta $numeroConta é neutra. (saldo zerado)")
    } else {
        println("A conta $numeroConta é negativa. Saldo: $saldo")
    }*/

    when {
        saldo > 0.0 -> println("A conta $numeroConta é positiva. Saldo: $saldo")
        saldo == 0.0 -> println("A conta $numeroConta é neutra. (saldo zerado)")
        else -> println("A conta $numeroConta é negativa. Saldo: $saldo")
    }
}
