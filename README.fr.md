<p align="center">
  <img src="assets/FuMod.png" style="width: 30%;" />
</p>

# Tarif TC famille S inclus

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/ROSPDK/SketchwareFu/total)](https://github.com/ROSPDK/SketchwareFu/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

Bienvenue sur Sketchware Fu ! Vous trouverez ici le code source de nombreuses classes de Sketchware Fu et, plus important encore, l'endroit où contribuer à Sketchware Fu.

## Construire l'application

Pour créer l'application, vous devez utiliser Gradle. Il est fortement recommandé d'utiliser Android Studio pour une expérience optimale.

Il existe deux variantes de construction avec des fonctionnalités différentes :

-   `minApi26:`Cette variante prend en charge l'exportation d'AAB à partir de projets et la compilation du code Java 1.8, 1.9, 10 et 11. Cependant, cela ne fonctionne que sur Android 8.0 (O) et supérieur.
-   `minApi21:`Cette variante ne peut pas produire d'AAB à partir de projets et ne peut compiler que du code Java 1.7, mais elle prend en charge Android 5 et supérieur.

Pour sélectionner la variante de build appropriée dans Android Studio, utilisez l'onglet Variantes de build ou utilisez la commande de build Gradle appropriée.

### Source Code Map

| Classe                 | Rôle                                                               |
| ---------------------- | ------------------------------------------------------------------ |
| `a.a.a.ProjectBuilder` | Aide pour compiler un projet entier                                |
| `a.a.a.Ix`             | Responsable de la génération d'AndroidManifest.xml                 |
| `a.a.a.Jx`             | Génère le code source des activités                                |
| `a.a.a.Lx`             | Génère le code source des composants, tels que les écouteurs, etc. |
| `a.a.a.Ox`             | Responsable de la génération des fichiers XML de mises en page     |
| `a.a.a.qq`             | Registre des dépendances des bibliothèques intégrées               |
| `a.a.a.tq`             | Responsible for the compiling dialog's quizzes                     |
| `a.a.a.yq`             | Organise les chemins de fichiers des projets Sketchware            |

> [!CONSEIL]Vous pouvez également vérifier le`mod`package, qui contient la majorité des modifications apportées par les contributeurs.

## Contribuant

Si vous souhaitez contribuer à Sketchware Fu, suivez ces étapes :

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
-   Utilisez l'un de ces types de commit comme préfixe :
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

Merci d'avoir contribué à Sketchware Fu ! Vos contributions aident à maintenir Sketchware Fu en vie. Chaque contribution acceptée sera notée dans l'activité "A propos des Modders". Nous utiliserons dans un premier temps votre nom GitHub et votre photo de profil, mais ils peuvent bien sûr être modifiés.

## Discorde

Vous souhaitez discuter avec nous, discuter des changements ou simplement passer du temps ? Nous avons un serveur Discord rien que pour ça.

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## Clause de non-responsabilité

Ce mod n'a pas été créé à des fins nuisibles, telles que nuire à Sketchware ; bien au contraire, en fait. Il a été conçu pour maintenir Sketchware en vie par la communauté, pour la communauté. Veuillez l'utiliser à votre propre discrétion et envisagez de devenir un bailleur de fonds Patreon pour soutenir les développeurs. Malheureusement, les autres moyens de les prendre en charge ne fonctionnent plus, Patreon est donc la seule option disponible actuellement. Vous pouvez trouver leur page Patreon[ici](https://www.patreon.com/sketchware).

Nous n'autorisons PAS la publication de Sketchware Fu tel quel, ou avec des modifications, sur le Play Store ou sur tout autre magasin d'applications. Gardez à l'esprit que ce projet est toujours un mod. La modification non autorisée d'applications est considérée comme illégale et nous décourageons un tel comportement.

Nous aimons beaucoup Sketchware et sommes reconnaissants envers les développeurs de Sketchware d'avoir créé une application aussi étonnante. Cependant, nous n'avons pas reçu de mises à jour depuis longtemps. C'est pourquoi nous avons décidé de maintenir Sketchware en vie en créant ce mod, et il est entièrement gratuit. Nous ne demandons pas d'argent :)
