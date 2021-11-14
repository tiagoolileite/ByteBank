class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double = salario * 0.3

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}
