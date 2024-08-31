package Classes.Bardo
import Atributo

class BardoColegioDoValor : Bardo() {
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        super.aplicarBeneficiosDeClasse(atributos)
        val destreza = atributos.find { it.nome == "Destreza" }
        destreza?.let { it.valor += 1 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}