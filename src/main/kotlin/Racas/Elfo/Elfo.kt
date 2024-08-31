package Racas.Elfo
import Atributo
import Raca

open class Elfo : Raca {
    override val nome = "Elfo"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Destreza" }.valor += 2
    }
}