package Racas.Anao
import Atributo

class AnaoDaMontanha : Anao() {
    override val nome = "Anão da Montanha"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Força" }.valor += 2
    }
}