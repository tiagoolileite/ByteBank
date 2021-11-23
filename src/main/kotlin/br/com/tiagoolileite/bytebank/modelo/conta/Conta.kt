package br.com.tiagoolileite.bytebank.modelo.conta

import br.com.tiagoolileite.bytebank.modelo.cliente.Cliente

var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    private val numero: Int) {

    var saldo = 0.0
        protected set

    var total = 0

    init {
        println("Criando Conta")
        totalContas++
    }

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

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferencia(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular.nome}")
        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não há saldo para saque. Saldo atual: ${this.saldo}\n")
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferencia(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular.nome}")

        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não há saldo para saque. Saldo atual: ${this.saldo}\n")
        }
    }
}