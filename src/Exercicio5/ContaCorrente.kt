package Exercicio5

class ContaCorrente: Tributo {
    private var porcentagem = 0.01
    private var valor = 1.200

    override fun cobrarTributo(valor: Double, porcentagem: Double) {
        var tributado = this.valor + (this.valor * this.porcentagem)
        println("Pagará de tributo pela Conta Corrente %.2f".format(tributado))
    }
}