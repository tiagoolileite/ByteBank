fun testaComportamentosConta() {
    val contaTiago = ContaCorrente("Tiago", 1000)
    contaTiago.deposita(-200.0)

    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaTiago.toString())
    println(contaFran.toString())

    contaTiago.deposita(50.0)
    contaFran.deposita(70.0)

    contaTiago.saca(250.0)
    contaFran.saca(450.0)

    if (contaFran.transfere(100.0, contaTiago)) {
        println("Novo saldo conta destino: R$${contaTiago.saldo}")
    } else {
        println("Transferência não realizada")
    }
}
