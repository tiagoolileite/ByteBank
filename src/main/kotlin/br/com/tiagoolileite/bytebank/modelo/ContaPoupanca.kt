package br.com.tiagoolileite.bytebank.modelo

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
