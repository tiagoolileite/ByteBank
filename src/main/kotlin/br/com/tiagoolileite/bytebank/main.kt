package br.com.tiagoolileite.bytebank

import br.com.tiagoolileite.bytebank.modelo.conta.totalContas
import br.com.tiagoolileite.bytebank.teste.testaVariavelGlobalEObject
import testaContasDiferentes

fun main() {

    testaVariavelGlobalEObject()

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}
