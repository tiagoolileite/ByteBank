package modelo

interface Transferivel {
    fun transfere(valor: Double, contaDestino: Conta): Boolean
}
