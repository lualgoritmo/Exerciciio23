package Exercicio4

class ObjCores:Dicionario {
    private var listObj = mutableMapOf<String, String>()
    override fun insertObject() {
        listObj.entries.add()
       listObj["Guitarra"] = "Vermelha"
        listObj["Contra Baixo"] = "Preto"
        listObj["Cavaco"] = "Amarelo"
        listObj["Violão"] = "Cinza"
    }

    override fun viewObject() {
        listObj.forEach { (i, v) ->
            println("$i = $v") }
    }
}