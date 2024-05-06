<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# Tarifa TC família S incluída

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)
[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/ROSPDK/SketchwareFu/total)](https://github.com/ROSPDK/SketchwareFu/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

Bem-vindo ao Sketchware Fu! Aqui você encontrará o código-fonte de muitas classes do Sketchware Fu e, o mais importante, o local para contribuir com o Sketchware Fu.

## Construindo o aplicativo

Para construir o aplicativo, você deve usar o Gradle. É altamente recomendável usar o Android Studio para obter a melhor experiência.

There are two build variants with different features:

-   `minApi26:`Esta variante oferece suporte à exportação de AABs de projetos e à compilação de código Java 1.8, 1.9, 10 e 11. No entanto, só funciona no Android 8.0 (O) e superior.
-   `minApi21:`Esta variante não pode produzir AABs de projetos e só pode compilar código Java 1.7, mas oferece suporte ao Android 5 e superior.

Para selecionar a variante de build apropriada no Android Studio, use a guia Build Variants ou use o comando de build apropriado do Gradle.

### Mapa de código-fonte

| Aula                   | Role                                                         |
| ---------------------- | ------------------------------------------------------------ |
| `a.a.a.ProjectBuilder` | Auxiliar para compilar um projeto inteiro                    |
| `a.a.a.Ix`             | Responsável por gerar AndroidManifest.xml                    |
| `a.a.a.Jx`             | Gera código fonte das atividades                             |
| `a.a.a.Lx`             | Gera código-fonte de componentes, como ouvintes, etc.        |
| `a.a.a.Ox`             | Responsável por gerar arquivos XML de layouts                |
| `a.a.a.qq`             | Registro de dependências de bibliotecas integradas           |
| `a.a.a.tq`             | Responsável pelos questionários do diálogo de compilação     |
| `a.a.a.yq`             | Organiza os caminhos dos arquivos dos projetos do Sketchware |

> [!DICA]Você também pode verificar o`mod`pacote, que contém a maioria das alterações dos contribuidores.

## Contribuindo

Se você gostaria de contribuir com o Sketchware Fu, siga estas etapas:

1.  Bifurque este repositório.
2.  Make changes in your forked repository.
3.  Teste essas mudanças.
4.  Crie uma solicitação pull neste repositório.
5.  Sua solicitação pull será revisada pelos membros do repositório e mesclada se for aceita.

Aceitamos contribuições de qualquer tamanho, sejam elas recursos importantes ou correções de bugs, mas observe que todas as contribuições serão revisadas minuciosamente.

### Que mudanças provavelmente não aceitaremos

A maioria das alterações relacionadas à interface do usuário (componentes que já existem no Sketchware vanilla) provavelmente não serão aceitas. Se algo relacionado ao design for alterado, o ideal é que todo o aplicativo siga o novo estilo também, o que é um desafio, especialmente para mods.

> [!OBSERVAÇÃO]Enquanto isso, não aceitamos alterações de UI no branch principal, mas aceitamos no branch[redesenhar filial](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)já que estamos trabalhando ativamente em uma versão de material design do Sketchware Pro.

### Mensagem de confirmação

Ao fazer alterações em um ou mais arquivos, você precisa confirmar essas alterações com uma mensagem de confirmação. Aqui estão algumas diretrizes:

-   Mantenha a mensagem de commit curta e detalhada.
-   Use um destes tipos de commit como prefixo:
    -   `feat:`para um recurso, possivelmente melhorando algo já existente.
    -   `fix:`para uma correção, como uma correção de bug.
    -   `style:`para recursos e atualizações relacionadas ao estilo.
    -   `refactor:`para refatorar uma seção específica da base de código.
    -   `test:`para tudo relacionado a testes.
    -   `docs:`para tudo relacionado à documentação.
    -   `chore:`para manutenção de código (você também pode usar emojis para representar tipos de commit).

Exemplos:

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## Obrigado por contribuir

Thank you for contributing to Sketchware Fu! Your contributions help keep Sketchware Fu alive. Each accepted contribution will be noted down in the "About Modders" activity. We'll use your GitHub name and profile picture initially, but they can be changed, of course.

## Discórdia

Quer conversar conosco, discutir mudanças ou simplesmente sair? Temos um servidor Discord só para isso.

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## Isenção de responsabilidade

Este mod não foi criado para fins prejudiciais, como prejudicar o Sketchware; muito pelo contrário, na verdade. Foi feito para manter o Sketchware vivo pela comunidade para a comunidade. Use-o a seu critério e considere se tornar um patrocinador do Patreon para apoiar os desenvolvedores. Infelizmente, outras formas de apoiá-los não estão mais funcionando, então o Patreon é a única opção disponível atualmente. Você pode encontrar a página do Patreon[aqui](https://www.patreon.com/sketchware).

NÃO permitimos a publicação do Sketchware Fu como está, ou com modificações, na Play Store ou em qualquer outra app store. Tenha em mente que este projeto ainda é um mod. A modificação não autorizada de aplicativos é considerada ilegal e desencorajamos tal comportamento.

Amamos muito o Sketchware e somos gratos aos desenvolvedores do Sketchware por criarem um aplicativo tão incrível. No entanto, não recebemos atualizações há muito tempo. É por isso que decidimos manter o Sketchware vivo criando este mod, e é totalmente gratuito. Não exigimos dinheiro :)
