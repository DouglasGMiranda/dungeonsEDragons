package Classes.Feiticeiro
import Atributo
import ClassePersonagem

open class Feiticeiro : ClassePersonagem {
    override val nomeClasse = "Feiticeiro"
    override val dadoVida = 10
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val carisma = atributos.find { it.nome == "Carisma" }
        carisma?.let { it.valor += 2 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}



