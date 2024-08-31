package Racas.Anao
import Atributo

class AnaoDaColina : Anao() {
    override val nome = "Anão da Colina"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Sabedoria" }.valor += 1
    }
}