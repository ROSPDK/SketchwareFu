<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# 含 S 系列 TC 票價

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/ROSPDK/SketchwareFu/total)](https://github.com/ROSPDK/SketchwareFu/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

歡迎來到素描軟體福！在這裡您可以找到 Sketchware Fu 中許多類別的原始程式碼，最重要的是，這是為 Sketchware Fu 做出貢獻的地方。

## 建立應用程式

要建立應用程序，您必須使用 Gradle。強烈建議使用 Android Studio 以獲得最佳體驗。

有兩種具有不同功能的構建變體：

-   `minApi26:`此變體支援從專案匯出 AAB 並編譯 Java 1.8、1.9、10 和 11 程式碼。不過，它僅適用於 Android 8.0 (O) 及更高版本。
-   `minApi21:`該變體無法從專案中產生AAB，並且只能編譯Java 1.7程式碼，但它支援Android 5及更高版本。

若要在 Android Studio 中選擇適當的建置變體，請使用「建置變體」標籤或使用適當的 Gradle 建置命令。

### 原始碼圖

| 班級                     | 角色                      |
| ---------------------- | ----------------------- |
| `a.a.a.ProjectBuilder` | 編譯整個專案的助手               |
| `a.a.a.Ix`             | 負責產生AndroidManifest.xml |
| `a.a.a.Jx`             | 產生活動原始碼                 |
| `a.a.a.Lx`             | 產生元件的原始碼，例如監聽器等。        |
| `a.a.a.Ox`             | 負責產生佈局的 XML 文件          |
| `a.a.a.qq`             | 內建庫相依性的註冊表              |
| `a.a.a.tq`             | 負責編譯對話框的測驗              |
| `a.a.a.yq`             | 組織 Sketchware 專案的檔案路徑   |

> [！!]您也可以檢查`mod`包，其中包含大多數貢獻者的更改。

## 貢獻

If you'd like to contribute to Sketchware Fu, follow these steps:

1.  分叉這個儲存庫。
2.  在您的分叉存儲庫中進行更改。
3.  測試這些變更。
4.  在此儲存庫中建立拉取請求。
5.  您的拉取請求將由儲存庫成員審核並在接受後合併。

我們歡迎任何規模的貢獻，無論是主要功能還是錯誤修復，但請注意，所有貢獻都將經過徹底審查。

### 我們不太可能接受哪些改變

大多數與使用者介面（香草 Sketchware 中已存在的元件）相關的變更不太可能被接受。如果與設計相關的內容發生變化，理想情況下整個應用程式也應該遵循新的風格，這很有挑戰性，尤其是對於 mods 來說。

> [！!]同時，我們不接受主分支中的 UI 更改，但我們接受[重新設計分支](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)因為我們正在積極開發 Sketchware Pro 的材料設計版本。

### 提交訊息

當您對一個或多個文件進行更改時，您需要使用提交訊息來提交這些更改。以下是一些指導原則：

-   保持提交訊息簡短而詳細。
-   使用以下提交類型之一作為前綴：
    -   `feat:`對於一項功能，可能會改進現有的功能。
    -   `fix:`進行修復，例如錯誤修復。
    -   `style:`有關與樣式相關的功能和更新。
    -   `refactor:`用於重構程式碼庫的特定部分。
    -   `test:`對於與測試相關的一切。
    -   `docs:`與文件相關的所有內容。
    -   `chore:`用於程式碼維護（您也可以使用表情符號來表示提交類型）。

例子：

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## 感謝您的貢獻

感謝您對 Sketchware Fu 的貢獻！您的貢獻有助於讓 Sketchware Fu 保持活力。每個接受的貢獻都將記錄在「關於 Modders」活動中。我們最初將使用您的 GitHub 名稱和個人資料圖片，但當然它們可以更改。

## 不和諧

想與我們聊天、討論更改，或只是閒逛？我們有一個 Discord 伺服器就是為了這個目的。

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## 免責聲明

該模組並非出於任何有害目的而創建，例如損害 Sketchware；事實上，恰恰相反。它是為了讓 Sketchware 保持活力而由社區為社區服務的。請自行決定使用它並考慮成為 Patreon 支持者以支援開發人員。不幸的是，其他支持他們的方法不再有效，因此 Patreon 是目前唯一可用的選擇。你可以找到他們的 Patreon 頁面[這裡](https://www.patreon.com/sketchware).

我們不允許在 Play 商店或任何其他應用程式商店上按原樣或修改後發布 Sketchware Fu。請記住，這個項目仍然是一個模組。未經授權的應用程式修改被視為非法，我們不鼓勵此類行為。

我們非常喜歡 Sketchware，並感謝 Sketchware 的開發人員創建瞭如此出色的應用程式。然而，我們已經很久沒有收到更新了。這就是為什麼我們決定透過創建這個完全免費的 Mod 來保持 Sketchware 的活力。我們不要求任何錢:)
