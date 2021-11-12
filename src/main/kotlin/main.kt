fun main() {
    println("Bem vindo ao Bytebank!")
    //var ou val para variávies - val não pode ser alterado
    /*No caso do uso de var, sempre inicializar antes de atribuir novo valor ou utilizar a variável.
    No caso de val, necessário inicialização*/
    //Para declarar, usar : e o tipo. Ex: val titular: String = "Tiago Leite"
    val titular = "Tiago Leite"
    val numeroConta = 1000
    //Double declarado implicitamente deve-se usar 0 . para informar que é um decimal
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    //String template usando "$" e a variável desejada pode substituir a concatenação ("" + "")
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")
}
