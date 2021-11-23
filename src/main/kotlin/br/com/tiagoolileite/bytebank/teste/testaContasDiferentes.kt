import br.com.tiagoolileite.bytebank.modelo.Cliente
import br.com.tiagoolileite.bytebank.modelo.ContaCorrente
import br.com.tiagoolileite.bytebank.modelo.ContaPoupanca
import br.com.tiagoolileite.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Tiago",
            cpf = "123",
            senha = 123,
            endereco = Endereco(
                logradouro = "Av. Sagitário"
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "321",
            senha = 321
        ),
        numero = 1001
    )

    println(contaCorrente.titular.toString())
    println("endereço titular: ${contaCorrente.titular.endereco.logradouro}\n")
    println(contaPoupanca.titular.toString())

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    contaCorrente.transfere(100.0, contaPoupanca)
    contaPoupanca.transfere(200.0, contaCorrente)
}
