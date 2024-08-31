package Classes.Mago
import Atributo
import ClassePersonagem

open class Mago : ClassePersonagem {
    override val nomeClasse = "Mago"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val inteligencia = atributos.find { it.nome == "Inteligência" }
        inteligencia?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}