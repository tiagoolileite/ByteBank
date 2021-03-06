import br.com.tiagoolileite.bytebank.modelo.Cliente
import br.com.tiagoolileite.bytebank.modelo.ContaCorrente
import br.com.tiagoolileite.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X $numeroX")
    println("Numero Y $numeroY\n")

    val joao = Cliente(nome = "João", cpf = "111", senha = 123)

    val contaJoao = ContaCorrente(titular = joao, numero = 1002)
    contaJoao.titular.nome = "João"
    val contaMaria = ContaPoupanca(titular = Cliente(
        nome = "Maria",
        cpf = "222",
        senha = 123
    ), numero = 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("Referência Titular conta João: ${contaJoao.titular}")
    println("Referência Titular conta Maria: ${contaMaria.titular}")
    println("Titular conta João: ${contaJoao.titular.nome}")
    println("Titular conta Maria: ${contaMaria.titular.nome}\n")
}
