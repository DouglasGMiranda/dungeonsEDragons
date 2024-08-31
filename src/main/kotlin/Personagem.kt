class Personagem(
    val nome: String,
    val classePersonagem: ClassePersonagem,
    val atributos: List<Atributo>
) {
    init {
        classePersonagem.aplicarBeneficiosDeClasse(atributos)
    }

    fun exibirInformacoesDoPersonagem() {
        println("Nome: $nome")
        println("Classe: ${classePersonagem.nomeClasse}")
        println("Atributos:")
        atributos.forEach {
            println("${it.nome}: ${it.valor}")
        }
    }
}