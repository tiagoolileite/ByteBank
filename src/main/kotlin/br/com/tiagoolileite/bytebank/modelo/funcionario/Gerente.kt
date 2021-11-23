package br.com.tiagoolileite.bytebank.modelo.funcionario

import br.com.tiagoolileite.bytebank.modelo.interfaces.Autenticavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double = salario * 1.2
}
