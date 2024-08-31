package Racas.Elfo
import Atributo

class ElfoDaFloresta : Elfo() {
    override val nome = "Elfo da Floresta"
    override fun aplicarBonusDeAtributos(atributos: List<Atributo>) {
        super.aplicarBonusDeAtributos(atributos)
        atributos.first { it.nome == "Sabedoria" }.valor += 1
    }
}