package Classes.Patrulheiro
import Atributo
import ClassePersonagem

open class Patrulheiro : ClassePersonagem {
    override val nomeClasse = "Patrulheiro"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val destreza = atributos.find { it.nome == "Destreza" }
        destreza?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}