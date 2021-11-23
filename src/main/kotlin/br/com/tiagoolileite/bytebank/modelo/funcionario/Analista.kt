package br.com.tiagoolileite.bytebank.modelo.funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double = salario * 1.1

}
