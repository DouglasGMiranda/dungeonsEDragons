package Racas.Anao
import Atributo
import Raca

open class Anao : Raca {
    override val nome = "Anão"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Constituição" }.valor += 2
    }
}