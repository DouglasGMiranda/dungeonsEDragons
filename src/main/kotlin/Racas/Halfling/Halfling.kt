package Racas.Halfling
import Atributo
import Raca

open class Halfling : Raca {
    override val nome = "Halfling"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Destreza" }.valor += 2
    }
}