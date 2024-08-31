package Classes.Bruxo
import Atributo

class BruxoPactoDoArquifado : Bruxo() {
    override fun aplicarBeneficiosDeClasse(atributos: List<Atributo>) {
        super.aplicarBeneficiosDeClasse(atributos)
        val sabedoria = atributos.find { it.nome == "Sabedoria" }
        sabedoria?.let { it.valor += 1 }
    }

    override fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        return super.calcularPontosDeVidaIniciais(atributos)
    }
}