package Exercicio23

class Triangulo:CalcularArea {
    private var base = 0.0
    private var altura = 0.0
    private var area = 0.0

    override fun area(base: Double, altura: Double) {
        println("Digite a área maior(d1) e a área menor(d2)")
        this.base = readln().toDouble()
        this.altura = readln().toDouble()
        area = (this.base * this.altura)/2
        println("A área do triangulo é: $area")
    }

}