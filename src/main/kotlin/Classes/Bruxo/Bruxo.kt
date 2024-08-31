package Classes.Bruxo
import Atributo
import ClassePersonagem

open class Bruxo : ClassePersonagem {
    override val nomeClasse = "Bruxo"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val carisma = atributos.find { it.nome == "Carisma" }
        carisma?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}



