fun main() {
    println("Bem vindo ao Bytebank!\n")

    val contaTiago = Conta("Tiago", 1000)
    contaTiago.deposita(-200.0)

    val contaFran = Conta("Fran", 1001)
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

class Conta(
    private val titular: String,
    private val numero: Int) {

    var saldo = 0.0
        private set



    fun deposita(valor: Double) {
        println("Depositando na conta de ${this.titular}")

        if (valor > 0) {
            this.saldo += valor
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não é permitido depósito de valor negativo ou zerado\n")
        }

    }

    fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular}")

        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Novo saldo: R$${this.saldo}\n")
        } else {
            println("Não há saldo para saque. Saldo atual: ${this.saldo}\n")
        }

    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferência da conta de ${this.titular} para ${contaDestino.titular}")

        return if (this.saldo >= valor) {
            this.saca(valor)
            contaDestino.deposita(valor)
            true
        } else {
            false
        }
    }



    override fun toString(): String {
        var toString = "Titular: ${this.titular}\n"
        toString += "Conta: ${this.numero}\n"
        toString += "Saldo: R$${this.saldo}\n"
        return toString
    }
}
