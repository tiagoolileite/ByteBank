package br.com.tiagoolileite.bytebank.modelo.Cliente

import br.com.tiagoolileite.bytebank.modelo.interfaces.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        var toString = "Titular: ${this.nome}\n"
        toString += "CPF: ${this.cpf}\n"
        return toString
    }
}
