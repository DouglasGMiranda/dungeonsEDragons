package Classes.Barbaro
import Atributo
import ClassePersonagem

open class Barbaro : ClassePersonagem {
    override val nomeClasse = "Bárbaro"
    override val dadoVida = 12

    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        val forca = atributos.find { it.nome == "Força" }
        forca?.let { it.valor += 2 }
    }

    // Aqui, a classe pode usar a implementação padrão ou sobrepor com uma personalizada
    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}