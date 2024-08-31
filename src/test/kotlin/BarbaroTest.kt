import Classes.Barbaro.Barbaro
import Atributo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BarbaroTest {

    @Test
    fun `testar aplicacao de beneficios de classe`() {
        // Setup
        val barbaro = Barbaro()
        val atributos = listOf(
            Atributo("Força", 8),
            Atributo("Destreza", 8),
            Atributo("Constituição", 8),
            Atributo("Inteligência", 8),
            Atributo("Sabedoria", 8),
            Atributo("Carisma", 8)
        )

        // Ação
        barbaro.aplicarBeneficiosDeClasse(atributos)

        // Verificação
        val forca = atributos.find { it.nome == "Força" }?.valor
        assertEquals(10, forca) // A Força deve ter aumentado de 8 para 10
    }

    @Test
    fun `testar calculo de pontos de vida`() {
        // Setup
        val barbaro = Barbaro()
        val constituicao = 14 // Isso deveria dar um modificador de +2

        // Ação
        val pontosDeVida = classePersonagem.calcularPontosDeVidaIniciais(atributos)

        // Verificação
        assertEquals(14, pontosDeVida) // 12 (dado de vida do bárbaro) + 2 (modificador de constituição)
    }
}
