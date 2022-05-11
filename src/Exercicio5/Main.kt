package Exercicio5

fun main() {
    val contaPoupanca: Tributo = ContaPoupanca()
    contaPoupanca.cobrarTributo(porcentagem = 0.0, valor = 0.0)
    println("----------------------------------------------------")
    val contaCorrente: Tributo = ContaCorrente()
    contaCorrente.cobrarTributo(porcentagem = 0.01, valor = 1.200)
}