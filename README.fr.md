<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# Logiciel de croquis Pro

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/Sketchware-Pro/Sketchware-Pro/total)](https://github.com/Sketchware-Pro/Sketchware-Pro/releases)[![Repository Size](https://img.shields.io/github/repo-size/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro)

Bienvenue dans Sketchware Pro ! Vous trouverez ici le code source de nombreuses classes de Sketchware Pro et, surtout, l'endroit où contribuer à Sketchware Pro.

## Construire l'application

Pour créer l'application, vous devez utiliser Gradle. Il est fortement recommandé d'utiliser Android Studio pour une expérience optimale.

Il existe deux variantes de construction avec des fonctionnalités différentes :

-   `minApi26:` This variant supports exporting AABs from projects and compiling Java 1.8, 1.9, 10, and 11 code. However, it only works on Android 8.0 (O) and above.
-   `minApi21:`Cette variante ne peut pas produire d'AAB à partir de projets et ne peut compiler que du code Java 1.7, mais elle prend en charge Android 5 et supérieur.

To select the appropriate build variant in Android Studio, use the Build Variants tab or use the appropriate Gradle build command.

### Carte des codes sources

| Classe                 | Rôle                                                               |
| ---------------------- | ------------------------------------------------------------------ |
| `a.a.a.ProjectBuilder` | Aide pour compiler un projet entier                                |
| `a.a.a.Ix`             | Responsable de la génération d'AndroidManifest.xml                 |
| `a.a.a.Jx`             | Génère le code source des activités                                |
| `a.a.a.Lx`             | Génère le code source des composants, tels que les écouteurs, etc. |
| `a.a.a.Ox`             | Responsable de la génération des fichiers XML de mises en page     |
| `a.a.a.qq`             | Registre des dépendances des bibliothèques intégrées               |
| `a.a.a.tq`             | Responsable des quiz de la boîte de dialogue de compilation        |
| `a.a.a.yq`             | Organise les chemins de fichiers des projets Sketchware            |

> [!CONSEIL]Vous pouvez également vérifier le`mod` package, which contains the majority of contributors' changes.

## Contribuant

Si vous souhaitez contribuer à Sketchware Pro, procédez comme suit :

1.  Forkez ce référentiel.
2.  Apportez des modifications à votre référentiel forké.
3.  Testez ces changements.
4.  Créez une pull request dans ce référentiel.
5.  Votre demande d'extraction sera examinée par les membres du référentiel et fusionnée si elle est acceptée.

Nous acceptons les contributions de toute taille, qu'il s'agisse de fonctionnalités majeures ou de corrections de bugs, mais veuillez noter que toutes les contributions seront soigneusement examinées.

### Quels changements nous sommes peu susceptibles d'accepter

Il est peu probable que la plupart des modifications liées à l'interface utilisateur (composants qui existent déjà dans Vanilla Sketchware) soient acceptées. Si quelque chose lié au design est modifié, idéalement, l'ensemble de l'application devrait également suivre le nouveau style, ce qui est un défi, en particulier pour les mods.

> [!NOTE]En attendant, nous n'acceptons pas les modifications de l'interface utilisateur dans la branche principale, mais nous le faisons dans la branche principale.[branche de refonte](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)puisque nous travaillons activement sur une version de conception matérielle de Sketchware Pro.

### Message de validation

Lorsque vous apportez des modifications à un ou plusieurs fichiers, vous devez valider ces modifications avec un message de validation. Voici quelques lignes directrices :

-   Gardez le message de validation court et détaillé.
-   Use one of these commit types as a prefix:
    -   `feat:`pour une fonctionnalité, améliorant éventuellement quelque chose déjà existant.
    -   `fix:`pour un correctif, comme une correction de bug.
    -   `style:`pour les fonctionnalités et les mises à jour liées au style.
    -   `refactor:`pour refactoriser une section spécifique de la base de code.
    -   `test:`pour tout ce qui concerne les tests.
    -   `docs:`pour tout ce qui concerne la documentation.
    -   `chore:`pour la maintenance du code (vous pouvez également utiliser des emojis pour représenter les types de commit).

Exemples:

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## Merci d'avoir contribué

Merci d'avoir contribué à Sketchware Pro ! Vos contributions aident à maintenir Sketchware Pro en vie. Chaque contribution acceptée sera notée dans l'activité "A propos des Modders". Nous utiliserons dans un premier temps votre nom GitHub et votre photo de profil, mais ils peuvent bien sûr être modifiés.

## Discorde

Vous souhaitez discuter avec nous, discuter des changements ou simplement passer du temps ? Nous avons un serveur Discord rien que pour ça.

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## Clause de non-responsabilité

Ce mod n'a pas été créé à des fins nuisibles, telles que nuire à Sketchware ; bien au contraire, en fait. Il a été conçu pour maintenir Sketchware en vie par la communauté, pour la communauté. Veuillez l'utiliser à votre propre discrétion et envisagez de devenir un bailleur de fonds Patreon pour soutenir les développeurs. Malheureusement, les autres moyens de les prendre en charge ne fonctionnent plus, Patreon est donc la seule option disponible actuellement. Vous pouvez trouver leur page Patreon[ici](https://www.patreon.com/sketchware).

Nous n'autorisons PAS la publication de Sketchware Pro tel quel, ou avec des modifications, sur Play Store ou sur tout autre magasin d'applications. Gardez à l'esprit que ce projet est toujours un mod. La modification non autorisée d'applications est considérée comme illégale et nous décourageons un tel comportement.

We love Sketchware very much and are grateful to Sketchware's developers for creating such an amazing app. However, we haven't received updates for a long time. That's why we decided to keep Sketchware alive by creating this mod, and it's completely free. We don't demand any money :)
