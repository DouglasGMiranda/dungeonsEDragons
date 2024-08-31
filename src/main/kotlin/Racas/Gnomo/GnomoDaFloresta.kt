package Racas.Gnomo
import Atributo

class GnomoDaFloresta : Gnomo() {
    override val nome = "Gnomo da Floresta"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Destreza" }.valor += 1
    }
}