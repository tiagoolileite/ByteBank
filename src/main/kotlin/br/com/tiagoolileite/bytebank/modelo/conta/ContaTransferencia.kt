package br.com.tiagoolileite.bytebank.modelo.conta

import br.com.tiagoolileite.bytebank.modelo.cliente.Cliente
import br.com.tiagoolileite.bytebank.modelo.interfaces.Transferivel

abstract class ContaTransferencia(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {
    override fun transfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferência da conta de ${this.titular.nome} para ${contaDestino.titular.nome}")

        return if (this.saldo >= valor) {
            this.saca(valor)
            contaDestino.deposita(valor)
            true
        } else {
            false
        }
    }
}