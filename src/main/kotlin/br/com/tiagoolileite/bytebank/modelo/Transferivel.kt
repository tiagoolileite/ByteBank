package br.com.tiagoolileite.bytebank.modelo

interface Transferivel {
    fun transfere(valor: Double, contaDestino: Conta): Boolean
}
