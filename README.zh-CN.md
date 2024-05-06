<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# 素描软件专业版

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/Sketchware-Pro/Sketchware-Pro)](https://github.com/Sketchware-Pro/Sketchware-Pro/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/Sketchware-Pro/Sketchware-Pro/total)](https://github.com/Sketchware-Pro/Sketchware-Pro/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

欢迎使用 Sketchware Pro！在这里您可以找到 Sketchware Pro 中许多类的源代码，最重要的是，您可以在这里找到为 Sketchware Pro 做出贡献的地方。

## 构建应用程序

要构建应用程序，您必须使用 Gradle。强烈建议使用 Android Studio 以获得最佳体验。

有两种具有不同功能的构建变体：

-   `minApi26:`此变体支持从项目导出 AAB 并编译 Java 1.8、1.9、10 和 11 代码。不过，它仅适用于 Android 8.0 (O) 及更高版本。
-   `minApi21:`该变体无法从项目中生成AAB，并且只能编译Java 1.7代码，但它支持Android 5及更高版本。

要在 Android Studio 中选择适当的构建变体，请使用“构建变体”选项卡或使用适当的 Gradle 构建命令。

### 源代码图

| 班级                     | 角色                      |
| ---------------------- | ----------------------- |
| `a.a.a.ProjectBuilder` | 编译整个项目的助手               |
| `a.a.a.Ix`             | 负责生成AndroidManifest.xml |
| `a.a.a.Jx`             | 生成活动源代码                 |
| `a.a.a.Lx`             | 生成组件的源代码，例如监听器等。        |
| `a.a.a.Ox`             | 负责生成布局的 XML 文件          |
| `a.a.a.qq`             | 内置库依赖项的注册表              |
| `a.a.a.tq`             | 负责编译对话框的测验              |
| `a.a.a.yq`             | 组织 Sketchware 项目的文件路径   |

> [！提示!]您还可以检查`mod`包，其中包含大多数贡献者的更改。

## 贡献

如果您想为 Sketchware Pro 做出贡献，请按照以下步骤操作：

1.  分叉这个存储库。
2.  在您的分叉存储库中进行更改。
3.  测试这些更改。
4.  在此存储库中创建拉取请求。
5.  您的拉取请求将由存储库成员审核并在接受后合并。

我们欢迎任何规模的贡献，无论是主要功能还是错误修复，但请注意，所有贡献都将经过彻底审查。

### 我们不太可能接受哪些改变

大多数与用户界面（香草 Sketchware 中已存在的组件）相关的更改不太可能被接受。如果与设计相关的内容发生变化，理想情况下整个应用程序也应该遵循新的风格，这很有挑战性，尤其是对于 mods 来说。

> [！笔记!]与此同时，我们不接受主分支中的 UI 更改，但我们接受[重新设计分支](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)因为我们正在积极开发 Sketchware Pro 的材料设计版本。

### 提交消息

当您对一个或多个文件进行更改时，您需要使用提交消息来提交这些更改。以下是一些指导原则：

-   保持提交消息简短而详细。
-   使用以下提交类型之一作为前缀：
    -   `feat:`对于一项功能，可能会改进现有的功能。
    -   `fix:`进行修复，例如错误修复。
    -   `style:`有关与样式相关的功能和更新。
    -   `refactor:`用于重构代码库的特定部分。
    -   `test:`对于与测试相关的一切。
    -   `docs:`与文档相关的所有内容。
    -   `chore:`用于代码维护（您还可以使用表情符号来表示提交类型）。

例子：

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## 感谢您的贡献

感谢您对 Sketchware Pro 的贡献！您的贡献有助于让 Sketchware Pro 保持活力。每个接受的贡献都将记录在“关于 Modders”活动中。我们最初将使用您的 GitHub 名称和个人资料图片，但当然它们可以更改。

## 不和谐

想与我们聊天、讨论更改，或者只是闲逛？我们有一个 Discord 服务器就是为了这个目的。

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## 免责声明

该模组并非出于任何有害目的而创建，例如损害 Sketchware；事实上，恰恰相反。它是为了让 Sketchware 保持活力而由社区为社区服务的。请自行决定使用它并考虑成为 Patreon 支持者以支持开发人员。不幸的是，其他支持他们的方法不再有效，因此 Patreon 是目前唯一可用的选择。你可以找到他们的 Patreon 页面[这里](https://www.patreon.com/sketchware).

我们不允许在 Play 商店或任何其他应用商店上按原样或经过修改发布 Sketchware Pro。请记住，这个项目仍然是一个模组。未经授权的应用程序修改被视为非法，我们不鼓励此类行为。

我们非常喜欢 Sketchware，并感谢 Sketchware 的开发人员创建了如此出色的应用程序。然而，我们已经很长时间没有收到更新了。这就是为什么我们决定通过创建这个完全免费的 Mod 来保持 Sketchware 的活力。我们不要求任何钱:)
