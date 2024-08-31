package Classes.Bardo
import Atributo
import ClassePersonagem

open class Bardo : ClassePersonagem {
    override val nomeClasse = "Bardo"
    override val dadoVida = 8
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val carisma = atributos.find { it.nome == "Carisma" }
        carisma?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}
