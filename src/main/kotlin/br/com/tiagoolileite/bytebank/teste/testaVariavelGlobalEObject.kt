package br.com.tiagoolileite.bytebank.teste

import br.com.tiagoolileite.bytebank.modelo.cliente.Cliente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaCorrente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaPoupanca
import br.com.tiagoolileite.bytebank.modelo.interfaces.Autenticavel
import br.com.tiagoolileite.bytebank.modelo.utils.SistemaInterno

fun testaVariavelGlobalEObject() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "12345"
        val senha: Int = 123

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 123)

    println("Nome do Cliente: ${fran.nome}\n")

    val tiago = Cliente(nome = "Tiago", cpf = "", senha = 123)
    val contaPoupanca = ContaPoupanca(titular = tiago, numero = 1000)
    val contaCorrente = ContaCorrente(titular = tiago, numero = 1001)
}
