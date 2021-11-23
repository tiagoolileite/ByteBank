package br.com.tiagoolileite.bytebank

import br.com.tiagoolileite.bytebank.modelo.cliente.Cliente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaCorrente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaPoupanca
import br.com.tiagoolileite.bytebank.modelo.conta.totalContas
import testaContasDiferentes

fun main() {

    val tiago = Cliente(nome = "Tiago", cpf = "", senha = 123)
    val contaPoupanca = ContaPoupanca(titular = tiago, numero = 1000)
    val contaCorrente = ContaCorrente(titular = tiago, numero = 1001)

    testaContasDiferentes()



    println("Total de contas: $totalContas")
}
