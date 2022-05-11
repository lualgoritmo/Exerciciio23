package Exercicio3

abstract class Peca(protected open var marca:String, protected open var modelo:String) {
    abstract fun retirada()
}