package Exercicio5

class SeguroDeVida:Tributo {
    private var taxa = 42.00
    private var valor = 0.0

    override fun cobrarTributo(porcentagem: Double, taxa: Double) {
        println("A taxo do seguro de vida é: ${this.taxa}")
    }
}