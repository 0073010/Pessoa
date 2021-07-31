class Pessoa {
    var nome: String = "Camila"
    var cpf: String = "123.123.123.45"

    inner class Endereço {
        var rua: String = "Rua teste"
    }

}

fun main() {
    val Camila = Pessoa()

    println(Camila.nome)
    println(Camila.cpf)

    println(Camila.Endereço().rua)
}