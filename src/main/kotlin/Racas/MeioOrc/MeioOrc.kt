package Racas.MeioOrc
import Atributo
import Raca

class MeioOrc : Raca {
    override val nome = "Meio-Orc"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Força" }.valor += 2
        atributos.first { it.nome == "Constituição" }.valor += 1
    }
}