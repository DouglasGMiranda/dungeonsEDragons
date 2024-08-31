package Classes.Bruxo
import Atributo

class BruxoPactoDoDemonio : Bruxo() {
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        super.aplicarBeneficiosDeClasse(atributos)
        val constituicao = atributos.find { it.nome == "Constituição" }
        constituicao?.let { it.valor += 1 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}