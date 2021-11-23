import br.com.tiagoolileite.bytebank.modelo.cliente.Cliente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaCorrente
import br.com.tiagoolileite.bytebank.modelo.conta.ContaPoupanca
import br.com.tiagoolileite.bytebank.modelo.conta.ContaSalario

fun testaComportamentosConta() {

    val tiago = Cliente(nome = "Tiago", cpf = "111", senha = 123)

    val contaTiago = ContaCorrente(titular = tiago, numero = 1000)
    contaTiago.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "222", senha = 321)

    val contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    val jota = Cliente(nome = "Jota", cpf = "333", senha = 323)

    val contaJota = ContaSalario(titular = jota, numero = 1003)
    contaJota.deposita(1000.0)

    println(contaTiago.titular.toString())
    println(contaFran.titular.toString())
    println(contaJota.titular.toString())

    contaTiago.deposita(50.0)
    contaFran.deposita(70.0)

    contaTiago.saca(250.0)
    contaFran.saca(450.0)
    contaJota.saca(100.0)

    if (contaFran.transfere(100.0, contaTiago)) {
        println("Novo saldo conta destino: R$${contaTiago.saldo}")
    } else {
        println("Transferência não realizada")
    }

    /*if (contaJota.transfere(100.0, contaTiago)) { Impossível chamar método transfere devido sua herança
        println("Novo saldo conta destino: R$${contaTiago.saldo}")
    } else {
        println("Transferência não realizada")
    }*/
}
