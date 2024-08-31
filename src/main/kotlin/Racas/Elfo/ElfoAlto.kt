package Racas.Elfo
import Atributo

class ElfoAlto : Elfo() {
    override val nome = "Elfo Alto"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Inteligência" }.valor += 1
    }
}