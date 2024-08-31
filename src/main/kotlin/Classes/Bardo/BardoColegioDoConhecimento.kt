package Classes.Bardo
import Atributo

class BardoColegioDoConhecimento : Bardo() {
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        super.aplicarBeneficiosDeClasse(atributos)
        val inteligencia = atributos.find { it.nome == "Inteligência" }
        inteligencia?.let { it.valor += 1 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}