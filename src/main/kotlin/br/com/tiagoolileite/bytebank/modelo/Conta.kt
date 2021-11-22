package br.com.tiagoolileite.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    private val numero: Int) {

    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        println("Depositando na conta de ${this.titular.nome}")

        if (valor > 0) {
            this.saldo += valor
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não é permitido depósito de valor negativo ou zerado\n")
        }

    }

    abstract fun saca(valor: Double)

}
