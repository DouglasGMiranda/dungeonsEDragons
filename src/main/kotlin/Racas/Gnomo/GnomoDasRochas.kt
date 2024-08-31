package Racas.Gnomo
import Atributo

class GnomoDasRochas : Gnomo() {
    override val nome = "Gnomo das Rochas"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Constituição" }.valor += 1
    }
}