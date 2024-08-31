package Racas.MeioElfo
import Atributo
import Raca

class MeioElfo : Raca {
    override val nome = "Meio-Elfo"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Carisma" }.valor += 2
        // Meio-Elfos podem escolher dois atributos para adicionar +1, isso pode ser implementado para permitir a escolha
        atributos.first { it.nome == "Destreza" }.valor += 1
        atributos.first { it.nome == "Constituição" }.valor += 1
    }
}