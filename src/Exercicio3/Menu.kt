package Exercicio3

import kotlin.system.exitProcess

class Menu {
    private var opcoes = GuardaVolumes()

    fun menu() {
        println("Escolha a melhor opção:")
        println("Salvar Peças: 1")
        println("Mostrar Peças: 2")
        println("Remover Peças: 3")
        println("Sair do Sistema: 4")
        when(readln().toInt()){
           1 -> {
               opcoes.salvarPecas()
               menu()
           }
           2 -> {
               opcoes.mostrarPecas()
               menu()
           }
           3 -> {
               opcoes.tirarPeca()
               menu()
           }
           4 -> exitProcess(0)
           else -> {
               println("Opção Inválida!")
               menu()
           }
        }
    }
}