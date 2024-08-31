package Racas.Gnomo
import Atributo
import Raca

open class Gnomo : Raca {
    override val nome = "Gnomo"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Inteligência" }.valor += 2
    }
}