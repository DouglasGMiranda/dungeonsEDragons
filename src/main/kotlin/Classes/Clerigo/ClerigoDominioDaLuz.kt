package Classes.Clerigo
import Atributo

class ClerigoDominioDaLuz : Clerigo() {
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        super.aplicarBeneficiosDeClasse(atributos)
        val carisma = atributos.find { it.nome == "Carisma" }
        carisma?.let { it.valor += 1 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}