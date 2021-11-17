abstract class ContaTransferencia(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {
    override fun transfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferência da conta de ${this.titular} para ${contaDestino.titular}")

        return if (this.saldo >= valor) {
            this.saca(valor)
            contaDestino.deposita(valor)
            true
        } else {
            false
        }
    }
}