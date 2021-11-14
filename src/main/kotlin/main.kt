fun main() {
    println("Bem vindo ao Bytebank!")

    val contaTiago = Conta()
    contaTiago.titular = "Tiago"
    contaTiago.numero = 1000
    contaTiago.saldo = 200.0
    println(contaTiago.titular)
    println(contaTiago.numero)
    println(contaTiago.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    contaTiago.deposita(50.0)
    contaFran.deposita(70.0)

    contaTiago.saca(250.0)
    contaFran.saca(450.0)

    if (contaFran.transfere(100.0, contaTiago)) {
        println("Novo saldo conta destino: R$${contaTiago.saldo}")
    } else {
        println("Transferência não realizada")
    }
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Depositando na conta de ${this.titular}")
        this.saldo += valor
        println("Novo saldo: R$${this.saldo}")
        println()
    }

    fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular}")

        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Novo saldo: R$${this.saldo}")
        } else {
            println("Não há saldo para saque. Saldo atual: ${this.saldo}")
        }
        println()
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferência da conta de ${this.titular} para ${contaDestino.titular}")

        return if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.saldo += valor
            println("Novo saldo: R$${this.saldo}")
            true
        } else {
            println("Não há saldo para transferência. Saldo atual: ${this.saldo}")
            false
        }
    }
}

//fun testaCopiasEReferencias() {
//    val numeroX = 10
//    var numeroY = numeroX
//    numeroY++
//
//    println("Numero X $numeroX")
//    println("Numero Y $numeroY")
//
//    val contaJoao = Conta()
//    contaJoao.titular = "João"
//
//    // var contaMaria = contaJoao cópia de referência, alterando em um objeto altera nos dois
//    val contaMaria = Conta()
//    contaMaria.titular = "Maria"
//
//    println("Titular conta João: ${contaJoao.titular}")
//    println("Titular conta Maria: ${contaMaria.titular}")
//
//    /*println(contaJoao) imprime a referência de um objeto
//    println(contaMaria)*/
//}

// fun testaLacos() {
//
// var i = 0
// while(i < 5) {
// val titular = "Tiago Leite $i"
// val numeroConta = 1000 + i
// var saldo = 10.0
// saldo += i
//
// println("Titular: $titular")
// println("Número da conta: $numeroConta")
// println("Saldo da conta: $saldo")
//
// testaCondicao(saldo, numeroConta)
// println()
// i++
//
// }
//
// @Suppress("NAME_SHADOWING")
// for (i in 1..5) { //para decrescente, usar downTo (i in 5 downTo 1)
//
// //Usar step para configurar a forma de incrementação (i in 5 downTo 1 step 2) - pula de 2 em 2
// if (i == 4) {
// continue // continue no laço de repetição força o próximo passo. break força a finalização do loop
// }
// //var ou val para variávies - val não pode ser alterado
// /*No caso do uso de var, sempre inicializar antes de atribuir novo valor ou utilizar a variável.
// No caso de val, necessário inicialização*/
// //Para declarar, usar : e o tipo. Ex: val titular: String = "Tiago Leite"
// val titular = "Tiago Leite $i"
// val numeroConta = 1000 + i
// //Double declarado implicitamente deve-se usar 0 . para informar que é um decimal
// var saldo = 10.0
// saldo += i
//
// //String template usando "$" e a variável desejada pode substituir a concatenação ("" + "")
// println("Titular: $titular")
// println("Número da conta: $numeroConta")
// println("Saldo da conta: $saldo")
//
// /*for (i in 1..3) {
// println(i)
// }*/
//
// testaCondicao(saldo, numeroConta)
// println()
//
// }
// }
//
// fun testaCondicao(saldo: Double, numeroConta: Int) { //Passando parâmetro em Kotlin, necessário declarar o tipo
//
// when {
// saldo > 0.0 -> println("A conta $numeroConta é positiva. Saldo: $saldo")
// saldo == 0.0 -> println("A conta $numeroConta é neutra. (saldo zerado)")
// else -> println("A conta $numeroConta é negativa. Saldo: $saldo")
// }
//
// /*if (saldo > 0.0) { //Para linha única na instrução de execução, podem ser ocultadas as chaves "{ }"
// println("A conta $numeroConta é positiva. Saldo: $saldo")
// } else if (saldo == 0.0) {
// println("A conta $numeroConta é neutra. (saldo zerado)")
// } else {
// println("A conta $numeroConta é negativa. Saldo: $saldo")
// }*/
// }