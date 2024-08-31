package Racas.Tiefling
import Atributo
import Raca

class Tiefling : Raca {
    override val nome = "Tiefling"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Inteligência" }.valor += 1
        atributos.first { it.nome == "Carisma" }.valor += 2
    }
}