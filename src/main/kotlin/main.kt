fun main() {

    println("Bem vindo ao Bytebank!")

    var i = 0
    while(i < 5) {
        val titular = "Tiago Leite $i"
        val numeroConta = 1000 + i
        var saldo = 10.0
        saldo += i

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        testaCondicao(saldo, numeroConta)
        println()
        i++
    }

    /*for (i in 1..5) { //para decrescente, usar downTo (i in 5 downTo 1)
                      //Usar step para configurar a forma de incrementação (i in 5 downTo 1 step 2) - pula de 2 em 2
        if (i == 4) {
            continue // continue no laço de repetição força o próximo passo. break força a finalização do loop
        }
        //var ou val para variávies - val não pode ser alterado
        *//*No caso do uso de var, sempre inicializar antes de atribuir novo valor ou utilizar a variável.
        No caso de val, necessário inicialização*//*
        //Para declarar, usar : e o tipo. Ex: val titular: String = "Tiago Leite"
        val titular = "Tiago Leite $i"
        val numeroConta = 1000 + i
        //Double declarado implicitamente deve-se usar 0 . para informar que é um decimal
        var saldo = 10.0
        saldo += i

        //String template usando "$" e a variável desejada pode substituir a concatenação ("" + "")
        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        *//*for (i in 1..3) {
            println(i)
        }*//*

        *//*when {
        saldo > 0.0 -> println("A conta $numeroConta é positiva. Saldo: $saldo")
        saldo == 0.0 -> println("A conta $numeroConta é neutra. (saldo zerado)")
        else -> println("A conta $numeroConta é negativa. Saldo: $saldo")
        }*//*

        testaCondicao(saldo, numeroConta)
        println()
    }*/
}

fun testaCondicao(saldo: Double, numeroConta: Int) { //Passando parâmetro em Kotlin, necessário declarar o tipo
    if (saldo > 0.0) { //Para linha única na instrução de execução, podem ser ocultadas as chaves "{ }"
        println("A conta $numeroConta é positiva. Saldo: $saldo")
    } else if (saldo == 0.0) {
        println("A conta $numeroConta é neutra. (saldo zerado)")
    } else {
        println("A conta $numeroConta é negativa. Saldo: $saldo")
    }
}
