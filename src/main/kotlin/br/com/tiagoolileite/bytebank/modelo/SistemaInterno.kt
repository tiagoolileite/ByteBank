package br.com.tiagoolileite.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank\n")
        } else {
            println("Falha na autenticação\n")
        }
    }

}
