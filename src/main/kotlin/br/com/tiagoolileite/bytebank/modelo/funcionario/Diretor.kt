package br.com.tiagoolileite.bytebank.modelo.funcionario

import br.com.tiagoolileite.bytebank.modelo.interfaces.Autenticavel

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double = salario * 1.3 + plr
}
