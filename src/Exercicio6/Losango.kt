package Exercicio23

class Losango:CalcularArea {
    private var area = 0.0
    private var d1 = 0.0
    private var d2 = 0.0
    override fun area(d1: Double, d2: Double) {
        println("Digite a área maior(d1) e a área menor(d2)")
        this.d1 = readln().toDouble()
        this.d2 = readln().toDouble()
       area = (this.d1 * this.d2)/2
        println("Área do Losango é: $area cm ao quadrado")
    }
}