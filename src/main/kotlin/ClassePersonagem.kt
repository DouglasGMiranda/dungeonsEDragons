interface ClassePersonagem {
    abstract val nomeClasse: String
    abstract val dadoVida: Int
    abstract fun aplicarBeneficiosDeClasse(atributos: List<Atributo>)

    fun calcularPontosDeVidaIniciais(atributos: List<Atributo>): Int {
        val valorConstituicao = atributos.find { it.nome == "Constituição" }?.valor ?: 10
        val modificadorConstituicao = CalcAtributos.calcularModificador(valorConstituicao)
        return dadoVida + modificadorConstituicao
    }



}