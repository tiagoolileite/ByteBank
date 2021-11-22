package br.com.tiagoolileite.bytebank.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
