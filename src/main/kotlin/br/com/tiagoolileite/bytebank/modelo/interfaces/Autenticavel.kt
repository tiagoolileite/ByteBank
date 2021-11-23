package br.com.tiagoolileite.bytebank.modelo.interfaces

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
