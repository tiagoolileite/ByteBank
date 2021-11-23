import br.com.tiagoolileite.bytebank.modelo.Cliente.Cliente
import br.com.tiagoolileite.bytebank.modelo.funcionario.Diretor
import br.com.tiagoolileite.bytebank.modelo.funcionario.Gerente
import br.com.tiagoolileite.bytebank.modelo.utils.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Tiago Leite",
        cpf = "111.111.111-11",
        salario = 2000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "111.111.111-22",
        salario = 4000.0,
        senha = 4321,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "111.111.111-33",
        senha = 5000
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 1000)
    sistema.entra(cliente, 5000)

    gerente.autentica(1234)
}
