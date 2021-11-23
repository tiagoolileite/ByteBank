package br.com.tiagoolileite.bytebank.modelo.interfaces

import br.com.tiagoolileite.bytebank.modelo.conta.Conta

interface Transferivel {
    fun transfere(valor: Double, contaDestino: Conta): Boolean
}
