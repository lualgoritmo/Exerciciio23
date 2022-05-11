package Exercicio5

class ContaPoupanca:Tributo {
    private var valor: Double = 0.0
    private var porcentagem: Double = 0.0

    override fun cobrarTributo(porcentagem: Double, valor: Double) {
       println("Conta Poupança não paga tributo ${this.porcentagem}")
    }
}