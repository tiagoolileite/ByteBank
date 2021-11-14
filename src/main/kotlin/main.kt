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
    println("Bonificação: R$${tiago.bonificacao()}")
}
