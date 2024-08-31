package Racas.Humano
import Atributo
import Raca

class Humano : Raca {
    override val nome = "Humano"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.forEach { it.valor += 1 }
    }
}