class ContaCorrente(
    titular: String,
    numero: Int
) : ContaTransferencia(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular}")
        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não há saldo para saque. Saldo atual: ${this.saldo}\n")
        }
    }
}
