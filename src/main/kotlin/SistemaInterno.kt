class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank, ${admin.nome}\n")
        } else {
            println("Falha na autenticação\n")
        }
    }

}
