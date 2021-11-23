package br.com.tiagoolileite.bytebank.modelo.utils

import br.com.tiagoolileite.bytebank.modelo.funcionario.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}
