package Classes.Clerigo
import Atributo
import ClassePersonagem

open class Clerigo : ClassePersonagem {
    override val nomeClasse = "Clérigo"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val sabedoria = atributos.find { it.nome == "Sabedoria" }
        sabedoria?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}