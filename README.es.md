<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# Sketchware Pro

[![GitHub contributors](https://img.shields.io/github/contributors/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/Sketchware-Pro/Sketchware-Pro/total)](https://github.com/Sketchware-Pro/Sketchware-Pro/releases)[![Repository Size](https://img.shields.io/github/repo-size/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro)

¡Bienvenido a Sketchware Pro! Aquí encontrará el código fuente de muchas clases de Sketchware Pro y, lo más importante, el lugar para contribuir a Sketchware Pro.

## Construyendo la aplicación

Para crear la aplicación, debes usar Gradle. Se recomienda encarecidamente utilizar Android Studio para obtener la mejor experiencia.

Hay dos variantes de construcción con características diferentes:

-   `minApi26:`Esta variante admite la exportación de AAB de proyectos y la compilación de código Java 1.8, 1.9, 10 y 11. Sin embargo, sólo funciona en Android 8.0 (O) y superior.
-   `minApi21:`Esta variante no puede producir AAB a partir de proyectos y solo puede compilar código Java 1.7, pero es compatible con Android 5 y superior.

Para seleccionar la variante de compilación adecuada en Android Studio, use la pestaña Variantes de compilación o use el comando de compilación de Gradle apropiado.

### Mapa de código fuente

| Clase                  | Role                                                          |
| ---------------------- | ------------------------------------------------------------- |
| `a.a.a.ProjectBuilder` | Ayudante para compilar un proyecto completo.                  |
| `a.a.a.Ix`             | Responsable de generar AndroidManifest.xml                    |
| `a.a.a.Jx`             | Genera código fuente de actividades.                          |
| `a.a.a.Lx`             | Genera código fuente de componentes, como oyentes, etc.       |
| `a.a.a.Ox`             | Responsable de generar archivos XML de diseños.               |
| `a.a.a.qq`             | Registro de dependencias de bibliotecas integradas.           |
| `a.a.a.tq`             | Responsable de los cuestionarios del diálogo de compilación.  |
| `a.a.a.yq`             | Organiza las rutas de archivos de los proyectos de Sketchware |

> [!CONSEJO]También puedes consultar el`mod`paquete, que contiene la mayoría de los cambios de los contribuyentes.

## Contribuyendo

Si desea contribuir a Sketchware Pro, siga estos pasos:

1.  Bifurca este repositorio.
2.  Realice cambios en su repositorio bifurcado.
3.  Pruebe esos cambios.
4.  Cree una solicitud de extracción en este repositorio.
5.  Los miembros del repositorio revisarán su solicitud de extracción y la fusionarán si se acepta.

We welcome contributions of any size, whether they are major features or bug fixes, but please note that all contributions will be thoroughly reviewed.

### Qué cambios es poco probable que aceptemos

Es poco probable que se acepten la mayoría de los cambios relacionados con la interfaz de usuario (componentes que ya existen en Vanilla Sketchware). Si se cambia algo relacionado con el diseño, lo ideal sería que toda la aplicación también siguiera el nuevo estilo, lo cual es un desafío, especialmente para los mods.

> [!NOTA]Mientras tanto, no aceptamos cambios en la interfaz de usuario en la rama principal, pero sí en la[rediseñar rama](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)ya que estamos trabajando activamente en una versión de diseño de materiales de Sketchware Pro.

### Mensaje de confirmación

Cuando realiza cambios en uno o más archivos, debe confirmar esos cambios con un mensaje de confirmación. Aquí hay algunas pautas:

-   Mantenga el mensaje de confirmación breve y detallado.
-   Utilice uno de estos tipos de confirmación como prefijo:
    -   `feat:`para una característica, posiblemente mejorando algo ya existente.
    -   `fix:`para una solución, como por ejemplo una corrección de errores.
    -   `style:`para funciones y actualizaciones relacionadas con el estilo.
    -   `refactor:`para refactorizar una sección específica del código base.
    -   `test:`para todo lo relacionado con las pruebas.
    -   `docs:`para todo lo relacionado con la documentación.
    -   `chore:`para el mantenimiento del código (también puedes usar emojis para representar tipos de confirmación).

Ejemplos:

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## Gracias por contribuir

¡Gracias por contribuir a Sketchware Pro! Tus contribuciones ayudan a mantener vivo Sketchware Pro. Cada contribución aceptada se anotará en la actividad "Acerca de los modders". Inicialmente usaremos su nombre de GitHub y su imagen de perfil, pero, por supuesto, se pueden cambiar.

## Discordia

¿Quieres charlar con nosotros, discutir cambios o simplemente pasar el rato? Tenemos un servidor Discord solo para eso.

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## Descargo de responsabilidad

Este mod no fue creado con ningún propósito dañino, como dañar Sketchware; todo lo contrario, en realidad. Fue creado para mantener vivo Sketchware por la comunidad y para la comunidad. Úselo a su propia discreción y considere convertirse en patrocinador de Patreon para apoyar a los desarrolladores. Desafortunadamente, otras formas de apoyarlos ya no funcionan, por lo que Patreon es la única opción disponible actualmente. Puedes encontrar su página de Patreon.[aquí](https://www.patreon.com/sketchware).

NO permitimos publicar Sketchware Pro tal como está, o con modificaciones, en Play Store ni en ninguna otra tienda de aplicaciones. Tenga en cuenta que este proyecto sigue siendo un mod. La modificación no autorizada de aplicaciones se considera ilegal y desaconsejamos dicho comportamiento.

Amamos mucho a Sketchware y estamos agradecidos a los desarrolladores de Sketchware por crear una aplicación tan increíble. Sin embargo, hace mucho tiempo que no recibimos actualizaciones. Es por eso que decidimos mantener vivo Sketchware creando este mod, y es completamente gratuito. No exigimos dinero :)
