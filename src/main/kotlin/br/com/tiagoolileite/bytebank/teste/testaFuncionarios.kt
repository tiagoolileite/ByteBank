import br.com.tiagoolileite.bytebank.modelo.funcionario.Analista
import br.com.tiagoolileite.bytebank.modelo.utils.CalculadoraBonificacao
import br.com.tiagoolileite.bytebank.modelo.funcionario.Diretor
import br.com.tiagoolileite.bytebank.modelo.funcionario.Gerente

fun testaFuncionarios() {
    val tiago = Analista(
        nome = "Tiago",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${tiago.nome}")
    println("CPF: ${tiago.cpf}")
    println("Salário: R$${tiago.salario}")
    println("Bonificação: R$${tiago.bonificacao}\n")

    val fran = Gerente(
        nome = "Fran",
        cpf = "111.111.111-12",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: R$${fran.salario}")
    println("Bonificação: R$${fran.bonificacao}\n")

    if (fran.autentica(1234)) {
        println("Autenticação realizada com sucesso\n")
    } else {
        println("Falha na autenticação\n")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "111.111.111-13",
        salario = 3000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: R$${gui.salario}")
    println("Bonificação: R$${gui.bonificacao}")
    println("PLR: R$${gui.plr}\n")

    if (gui.autentica(4000)) {
        println("Autenticação realizada com sucesso\n")
    } else {
        println("Falha na autenticação\n")
    }

    val maria = Analista(
        nome = "Gui",
        cpf = "111.111.111-14",
        salario = 2500.0
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: R$${maria.salario}")
    println("Bonificação: R$${maria.bonificacao}\n")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(tiago)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificacao: R$${calculadora.total}")
}
