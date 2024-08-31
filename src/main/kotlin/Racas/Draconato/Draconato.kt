package Racas.Draconato
import Atributo
import Raca

class Draconato : Raca {
    override val nome = "Draconato"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        atributos.first { it.nome == "Força" }.valor += 2
        atributos.first { it.nome == "Carisma" }.valor += 1
    }
}