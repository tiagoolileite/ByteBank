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

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 1000)
}
