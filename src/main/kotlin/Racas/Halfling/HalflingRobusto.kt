package Racas.Halfling
import Atributo

class HalflingRobusto : Halfling() {
    override val nome = "Halfling Robusto"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Constituição" }.valor += 1
    }
}