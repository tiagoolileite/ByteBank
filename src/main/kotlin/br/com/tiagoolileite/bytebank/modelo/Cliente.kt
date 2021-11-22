package br.com.tiagoolileite.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
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
