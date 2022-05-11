package Exercicio3
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Calendar.getInstance
import Exercicio3.Peca as Peca

class GuardaVolumes {
    private val listaPecas = ArrayList<Itens>()

    fun salvarPecas() {
        println("Quantas Peças")
        val quantidade = readln().toInt()
        val numero = IntArray(quantidade)

        for (i in numero) {
            println("Marca")
            var marca = readln()
            println("Modelo")
            var modelo = readln()
            val novoItem = Itens(marca, modelo)
            listaPecas.add(novoItem)
        }
}
    fun data() {
        val dataHoraAtual = LocalDateTime.now()
        val formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        val dataHoraFormatada = dataHoraAtual.format(formatador)

        println(dataHoraFormatada)
    }
    fun mostrarPecas() {
        listaPecas.forEachIndexed { index, itens ->
           println("Id da Peça")
            println(index)
            println("Data de Cadastro")
            println(data())
            println(itens.marca)
            println(itens.modelo)
        }
    }

    fun tirarPeca() {
        println("Peça para retirar")
        val numero = readln().toInt()
        listaPecas.removeAt(numero)
        println("Data de Remoção")
        println(data())
        mostrarPecas()
    }

}
