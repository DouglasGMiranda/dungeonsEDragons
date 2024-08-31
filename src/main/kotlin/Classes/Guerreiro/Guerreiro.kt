package Classes.Guerreiro
import Atributo
import ClassePersonagem

open class Guerreiro : ClassePersonagem {
    override val nomeClasse = "Guerreiro"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val forca = atributos.find { it.nome == "Força" }
        forca?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}