//Importando as classes
import Classes.Barbaro.Barbaro
import Classes.Barbaro.BarbaroBerserker
import Classes.Barbaro.BarbaroGuerreiroTotemico
import Classes.Bardo.Bardo
import Classes.Bardo.BardoColegioDoConhecimento
import Classes.Bardo.BardoColegioDoValor
import Classes.Bruxo.Bruxo
import Classes.Bruxo.BruxoPactoDoArquifado
import Classes.Bruxo.BruxoPactoDoDemonio
import Classes.Clerigo.Clerigo
import Classes.Clerigo.ClerigoDominioDaVida
import Classes.Clerigo.ClerigoDominioDaLuz
import Classes.Clerigo.ClerigoDominioDaTempestade
import Classes.Druida.Druida
import Classes.Druida.DruidaCirculoDaTerra
import Classes.Druida.DruidaCirculoDaLua
import Classes.Feiticeiro.Feiticeiro
import Classes.Feiticeiro.FeiticeiroLinhagemDraconica
import Classes.Feiticeiro.FeiticeiroMagiaSelvagem
import Classes.Guerreiro.GuerreiroCampeao
import Classes.Guerreiro.GuerreiroCavaleiroEldritch
import Classes.Guerreiro.Guerreiro
import Classes.Guerreiro.GuerreiroMestreDeBatalha
import Classes.Ladino.LadinoAssassino
import Classes.Ladino.Ladino
import Classes.Ladino.LadinoTrapaceiroArcano
import Classes.Mago.MagoEvocador
import Classes.Mago.MagoIlusionista
import Classes.Mago.Mago
import Classes.Mago.MagoNecromante
import Classes.Monge.MongeCaminhoDaMaoAberta
import Classes.Monge.MongeCaminhoDasSombras
import Classes.Monge.Monge
import Classes.Paladino.PaladinoJuramentoDaDevoção
import Classes.Paladino.PaladinoJuramentoDosAncestrais
import Classes.Paladino.Paladino
import Classes.Patrulheiro.PatrulheiroCacador
import Classes.Patrulheiro.PatrulheiroMestreDasFeras
import Classes.Patrulheiro.Patrulheiro
//Fim dos imports de Classes

//Importando as raças
import Racas.Anao.Anao
import Racas.Anao.AnaoDaColina
import Racas.Anao.AnaoDaMontanha
import Racas.Draconato.Draconato
import Racas.Elfo.Elfo
import Racas.Elfo.ElfoAlto
import Racas.Elfo.ElfoDaFloresta
import Racas.Elfo.ElfoNegro
import Racas.Gnomo.Gnomo
import Racas.Gnomo.GnomoDaFloresta
import Racas.Gnomo.GnomoDasRochas
import Racas.Halfling.Halfling
import Racas.Halfling.HalflingPesLeves
import Racas.Halfling.HalflingRobusto
import Racas.Humano.Humano
import Racas.MeioElfo.MeioElfo
import Racas.MeioOrc.MeioOrc
import Racas.Tiefling.Tiefling
//Fim dos imports de raça
fun main() {
    val atributos = listOf(
        Atributo("Força", 8),
        Atributo("Destreza", 8),
        Atributo("Constituição", 8),
        Atributo("Inteligência", 8),
        Atributo("Sabedoria", 8),
        Atributo("Carisma", 8)
    )

    println("Digite o nome do seu personagem:")
    val nome = readLine() ?: "Herói Sem Nome"

    val racas = listOf(
        Anao(),
        AnaoDaColina(),
        AnaoDaMontanha(),
        Draconato(),
        Elfo(),
        ElfoAlto(),
        ElfoDaFloresta(),
        ElfoNegro(),
        Gnomo(),
        GnomoDaFloresta(),
        GnomoDasRochas(),
        Halfling(),
        HalflingPesLeves(),
        HalflingRobusto(),
        Humano(),
        MeioElfo(),
        MeioOrc(),
        Tiefling()
    )

    // Escolha da Raça
    println("Escolha a raça do seu personagem:")
    racas.forEachIndexed { index, raca ->
        println("${index + 1}. ${raca.nome}")
    }
    val escolhaRaca = readLine()?.toIntOrNull()
    val racaPersonagem = racas.getOrNull(escolhaRaca?.minus(1) ?: -1)

    if (racaPersonagem != null) {
        racaPersonagem.aplicarBonusDeAtributos(atributos)
        println("Raça escolhida: ${racaPersonagem.nome}")
    } else {
        println("Raça inválida. Usando Humano por padrão.")
        racas[5].aplicarBonusDeAtributos(atributos) // 5 é o índice do Humano
    }

    // Escolha de classe e especialização
    println("Escolha sua classe:")
    println("1. Bárbaro")
    println("2. Bardo")
    println("3. Clérigo")
    println("4. Druida")
    println("5. Guerreiro")
    println("6. Ladino")
    println("7. Mago")
    println("8. Monge")
    println("9. Paladino")
    println("10. Patrulheiro")
    println("11. Feiticeiro")
    println("12. Bruxo")

    val escolhaClasse = readLine()?.toIntOrNull()

    val classePersonagem: ClassePersonagem = when (escolhaClasse) {
        1 -> {
            println("Escolha sua especialização:")
            println("1. Barbaro Berserker")
            println("2. Barbaro Guerreiro Totêmico")
            println("3. Barbaro")
            when (readLine()?.toIntOrNull()) {
                1 -> BarbaroBerserker()
                2 -> BarbaroGuerreiroTotemico()
                else -> Barbaro()
            }
        }
        2 -> {
            println("Escolha sua especialização:")
            println("1. Bardo Colégio do Conhecimento")
            println("2. Bardo Colégio do Valor")
            println("3. Bardo")
            when (readLine()?.toIntOrNull()) {
                1 -> BardoColegioDoConhecimento()
                2 -> BardoColegioDoValor()
                else -> Bardo()
            }
        }
        3 -> {
            println("Escolha sua especialização:")
            println("1. Clerigo Domínio da Vida")
            println("2. Clerigo Domínio da Luz")
            println("3. Clerigo Domínio da Tempestade")
            println("4. Clerigo")
            when (readLine()?.toIntOrNull()) {
                1 -> ClerigoDominioDaVida()
                2 -> ClerigoDominioDaLuz()
                3 -> ClerigoDominioDaTempestade()
                else -> Clerigo()
            }
        }
        4 -> {
            println("Escolha sua especialização:")
            println("1. Círculo da Terra")
            println("2. Círculo da Lua")
            println("3. Druida")
            when (readLine()?.toIntOrNull()) {
                1 -> DruidaCirculoDaTerra()
                2 -> DruidaCirculoDaLua()
                else -> Druida()
            }
        }
        5 -> {
            println("Escolha sua especialização:")
            println("1. Guerreiro Campeão")
            println("2. Guerreiro Mestre de Batalha")
            println("3. Guerreiro Cavaleiro Eldritch")
            println("4. Guerreiro")
            when (readLine()?.toIntOrNull()) {
                1 -> GuerreiroCampeao()
                2 -> GuerreiroMestreDeBatalha()
                3 -> GuerreiroCavaleiroEldritch()
                else -> Guerreiro()
            }
        }
        6 -> {
            println("Escolha sua especialização:")
            println("1. Ladino Assassino")
            println("2. Ladino Trapaceiro Arcano")
            println("3. Ladino")
            when (readLine()?.toIntOrNull()) {
                1 -> LadinoAssassino()
                2 -> LadinoTrapaceiroArcano()
                else -> Ladino()
            }
        }
        7 -> {
            println("Escolha sua especialização:")
            println("1. Mago Evocador")
            println("2. Mago Ilusionista")
            println("3. Mago Necromante")
            println("4. Mago")
            when (readLine()?.toIntOrNull()) {
                1 -> MagoEvocador()
                2 -> MagoIlusionista()
                3 -> MagoNecromante()
                else -> Mago()
            }
        }
        8 -> {
            println("Escolha sua especialização:")
            println("1. Monge Caminho da Mão Aberta")
            println("2. Monge Caminho das Sombras")
            println("3. Monge")
            when (readLine()?.toIntOrNull()) {
                1 -> MongeCaminhoDaMaoAberta()
                2 -> MongeCaminhoDasSombras()
                else -> Monge()
            }
        }
        9 -> {
            println("Escolha sua especialização:")
            println("1. Paladino Juramento da Devoção")
            println("2. Paladino Juramento dos Ancestrais")
            println("3. Paladino")
            when (readLine()?.toIntOrNull()) {
                1 -> PaladinoJuramentoDaDevoção()
                2 -> PaladinoJuramentoDosAncestrais()
                else -> Paladino()
            }
        }
        10 -> {
            println("Escolha sua especialização:")
            println("1. Patrulheiro Caçador")
            println("2. Patrulheiro Mestre das Feras")
            println("3. Patrulheiro")
            when (readLine()?.toIntOrNull()) {
                1 -> PatrulheiroCacador()
                2 -> PatrulheiroMestreDasFeras()
                else -> Patrulheiro()
            }
        }
        11 -> {
            println("Escolha sua especialização:")
            println("1. Feiticeiro Linhagem Dracônica")
            println("2. Feiticeiro Magia Selvagem")
            println("3. Feiticeiro")
            when (readLine()?.toIntOrNull()) {
                1 -> FeiticeiroLinhagemDraconica()
                2 -> FeiticeiroMagiaSelvagem()
                else -> Feiticeiro()
            }
        }
        12 -> {
            println("Escolha sua especialização:")
            println("1. Bruxo Pacto do Arquifado")
            println("2. Bruxo Pacto do Demônio")
            println("3. Bruxo")
            when (readLine()?.toIntOrNull()) {
                1 -> BruxoPactoDoArquifado()
                2 -> BruxoPactoDoDemonio()
                else -> Bruxo()
            }
        }
        else -> Barbaro() // Classe padrão
    }

    // Aplica benefícios de classe antes da atribuição de pontos
    classePersonagem.aplicarBeneficiosDeClasse(atributos)

    // Cálculo dos pontos de vida
    val pontosDeVida = classePersonagem.calcularPontosDeVidaIniciais(atributos)

    println("Pontos de vida iniciais: $pontosDeVida")

    // Exibe os atributos após os benefícios de raça e classe
    println("Atributos após os benefícios de raça e classe:")
    atributos.forEachIndexed { index, it ->
        println("(${index + 1}) ${it.nome}: ${it.valor}")
    }

    var pontosDisponiveis = 27
    println("Você tem $pontosDisponiveis pontos para distribuir entre os atributos.")

    while (pontosDisponiveis > 0) {
        println("Escolha o número do atributo que você quer aumentar:")
        val escolhaAtributo = readLine()?.toIntOrNull()

        if (escolhaAtributo in 1..atributos.size) {
            val atributo = atributos[escolhaAtributo!! - 1]
            val valorMinimo = atributo.valor
            val custoAtual = custoPorValor(valorMinimo)

            println("Você quer aumentar ${atributo.nome} (atualmente ${atributo.valor}). Para qual valor você quer aumentar (entre $valorMinimo e 15)?")
            val novoValor = readLine()?.toIntOrNull()

            if (novoValor in valorMinimo..15) {
                val custoNovo = custoPorValor(novoValor!!)
                val custoTotal = custoNovo - custoAtual

                if (custoTotal <= pontosDisponiveis) {
                    atributo.valor = novoValor
                    pontosDisponiveis -= custoTotal
                    println("${atributo.nome} agora é ${atributo.valor}. Pontos restantes: $pontosDisponiveis")
                } else {
                    println("Você não tem pontos suficientes. Custo: $custoTotal, Pontos disponíveis: $pontosDisponiveis.")
                }
            } else {
                println("Valor inválido. Escolha um valor entre $valorMinimo e 15.")
            }
        } else {
            println("Escolha inválida. Digite um número entre 1 e ${atributos.size}.")
        }

        if (pontosDisponiveis == 0) {
            println("Você não tem mais pontos para distribuir.")
        } else {
            // Reexibe os atributos após a distribuição parcial
            println("Atributos atuais:")
            atributos.forEachIndexed { index, it ->
                println("(${index + 1}) ${it.nome}: ${it.valor}")
            }
        }
    }

    // Exibe os atributos finais e os pontos de vida
    println("Personagem criado: $nome")
    println("Raça: ${racaPersonagem?.nome ?: "Humano"}")
    println("Classe: ${classePersonagem.nomeClasse}")
    println("Pontos de vida: $pontosDeVida")
    println("Atributos finais:")
    atributos.forEach {
        println("${it.nome}: ${it.valor}")
    }
}

    // Função para calcular o custo de pontos para um determinado valor de atributo
    fun custoPorValor(valor: Int): Int {
        return when (valor) {
            8 -> 0
            9 -> 1
            10 -> 2
            11 -> 3
            12 -> 4
            13 -> 5
            14 -> 7
            15 -> 9
            else -> 0 // No caso de valores menores que 8 ou maiores que 15, sem custo
        }
    }