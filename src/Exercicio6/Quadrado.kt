package Exercicio23

import java.util.Base64

class Quadrado:CalcularArea {
    private var area = 0.0
    private var base = 0.0
    private var altura = 0.0

    override fun area(base:Double, altura:Double) {
        println("Digite a base e a altura do quadrado)")
        this.base = readln().toDouble()
        this.altura = readln().toDouble()
        area = this.base * this.altura
        println("A área do quadrado é: $area")
    }

}