package Exercicio23

import kotlin.system.exitProcess

fun main() {
    var opcao = 0
    while (true) {
        println("Calcular área do quadrado: 1")
        println("Calcular área do Triangulo: 2")
        println("Calcular área do Retangulo: 3")
        println("Calcular área do Losango: 4")
        println("Para sair: 5")
        opcao = readln().toInt()
        if(opcao == 1){
            val quadrado:CalcularArea = Quadrado()
            quadrado.area(0.0, 0.0)
        }
        else if(opcao == 2) {
            val triangulo:CalcularArea = Triangulo()
            triangulo.area(0.0, 0.0)
        }
        else if (opcao == 3) {
            val retangulo:CalcularArea = Retangulo()
            retangulo.area(0.0, 0.0)
        }
        else if (opcao == 4) {
            val losango:CalcularArea = Losango()
            losango.area(0.0, altura = 0.0)
        }
        else if (opcao == 5) {
            exitProcess(0)
        }
        else {
            println("Opção Inválida!")
        }
    }

}