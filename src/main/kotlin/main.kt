fun main() {
    println("Bem vindo ao Bytebank!\n")

    val tiago = Funcionario(
        nome = "Tiago",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${tiago.nome}")
    println("CPF: ${tiago.cpf}")
    println("Salário: R$${tiago.salario}")
    println("Bonificação: R$${tiago.bonificacao()}\n")

    val fran = Gerente(
        nome = "Fran",
        cpf = "111.111.111-11",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: R$${fran.salario}")
    println("Bonificação: R$${fran.bonificacao()}\n")

    if(fran.autentica(1234)) {
        println("Autenticação realizada com sucesso\n")
    } else {
        println("Falha na autenticação\n")
    }

}
