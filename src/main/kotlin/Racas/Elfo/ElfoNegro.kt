package Racas.Elfo
import Atributo

class ElfoNegro : Elfo() {
    override val nome = "Elfo Negro (Drow)"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Carisma" }.valor += 1
    }
}