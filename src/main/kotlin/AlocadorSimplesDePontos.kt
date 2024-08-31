class AlocadorSimplesDePontos : AlocadorDePontos {
    override fun alocarPontos(pontos: Int, atributos: List<Atributo>) {
        var pontosRestantes = pontos
        while (pontosRestantes > 0) {
            println("Você tem $pontosRestantes pontos restantes.")
            println("Escolha um atributo para aumentar:")
            atributos.forEachIndexed { index, atributo ->
                println("${index + 1}. ${atributo.nome} (Valor Atual: ${atributo.valor})")
            }
            val escolha = readLine()?.toIntOrNull()?.minus(1) ?: continue
            if (escolha in atributos.indices) {
                atributos[escolha].valor += 1
                pontosRestantes -= 1
            } else {
                println("Escolha inválida. Por favor, selecione um atributo válido.")
            }
        }
    }
}
