class Pessoa {
    var nome: String = "Camila"

    var cpf: String = "123.123.123.45"
        private set

    constructor()

    fun unenomecpf() = "$nome e $cpf"

 }
}

fun main() {
    val Camila = Pessoa

    println(Camila.Pessoainfo())

}