package Racas.Halfling
import Atributo

class HalflingPesLeves : Halfling() {
    override val nome = "Halfling Pés Leves"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Carisma" }.valor += 1
    }
}