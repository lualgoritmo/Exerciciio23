package Exercicio3

open class Itens(public override var marca: String,public override var modelo: String):Peca(marca, modelo) {
    override fun retirada() {
    }
}