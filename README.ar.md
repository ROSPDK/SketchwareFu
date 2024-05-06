<p align="center">
  <img src="assets/FuMod.png" style="width: 30%;" />
</p>

# يشمل سعر تذكرة S TC العائلية

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/ROSPDK/SketchwareFu/total)](https://github.com/ROSPDK/SketchwareFu/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

مرحبًا بك في Sketchware Fu! ستجد هنا الكود المصدري للعديد من الفئات في Sketchware Fu، والأهم من ذلك، المكان المناسب للمساهمة في Sketchware Fu.

## بناء التطبيق

لإنشاء التطبيق، يجب عليك استخدام Gradle. يوصى بشدة باستخدام Android Studio للحصول على أفضل تجربة.

هناك نوعان مختلفان من البناء بميزات مختلفة:

-   `minApi26:`يدعم هذا المتغير تصدير AABs من المشاريع وتجميع كود Java 1.8 و1.9 و10 و11. ومع ذلك، فهو يعمل فقط على نظام التشغيل Android 8.0 (O) والإصدارات الأحدث.
-   `minApi21:`لا يمكن لهذا المتغير إنتاج AABs من المشاريع ويمكنه فقط تجميع كود Java 1.7، ولكنه يدعم Android 5 والإصدارات الأحدث.

لتحديد متغير البناء المناسب في Android Studio، استخدم علامة التبويب Build Variants أو استخدم أمر Gradle build المناسب.

### خريطة كود المصدر

| فصل                    | دور                                                    |
| ---------------------- | ------------------------------------------------------ |
| `a.a.a.ProjectBuilder` | مساعد لتجميع المشروع بأكمله                            |
| `a.a.a.Ix`             | المسؤول عن إنشاء AndroidManifest.xml                   |
| `a.a.a.Jx`             | يولد كود المصدر للأنشطة                                |
| `a.a.a.Lx`             | يُنشئ كود المصدر للمكونات، مثل المستمعين، وما إلى ذلك. |
| `a.a.a.Ox`             | مسؤول عن إنشاء ملفات XML للتخطيطات                     |
| `a.a.a.qq`             | سجل تبعيات المكتبات المضمنة                            |
| `a.a.a.tq`             | المسؤول عن تجميع اختبارات الحوار                       |
| `a.a.a.yq`             | ينظم مسارات ملفات مشاريع Sketchware                    |

> [!نصيحة]يمكنك أيضًا التحقق من`mod`الحزمة، التي تحتوي على غالبية تغييرات المساهمين.

## المساهمة

إذا كنت ترغب في المساهمة في Sketchware Fu، فاتبع الخطوات التالية:

1.  شوكة هذا المستودع.
2.  قم بإجراء تغييرات في مستودعك المتشعب.
3.  اختبر تلك التغييرات.
4.  قم بإنشاء طلب سحب في هذا المستودع.
5.  ستتم مراجعة طلب السحب الخاص بك من قبل أعضاء المستودع ودمجه في حالة قبوله.

نحن نرحب بالمساهمات من أي حجم، سواء كانت ميزات رئيسية أو إصلاحات للأخطاء، ولكن يرجى ملاحظة أنه ستتم مراجعة جميع المساهمات بدقة.

### ما هي التغييرات التي من غير المرجح أن نقبلها؟

من غير المرجح أن يتم قبول معظم التغييرات المتعلقة بواجهة المستخدم (المكونات الموجودة بالفعل في Vanilla Sketchware). إذا تم تغيير شيء متعلق بالتصميم، فمن الأفضل أن يتبع التطبيق بأكمله النمط الجديد أيضًا، وهو أمر يمثل تحديًا، خاصة بالنسبة للتعديلات.

> [!ملحوظة]في هذه الأثناء، لا نقبل تغييرات واجهة المستخدم في الفرع الرئيسي، ولكننا نقبلها في[إعادة تصميم فرع](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)نظرًا لأننا نعمل بنشاط على إصدار تصميم متعدد الأبعاد من Sketchware Pro.

### رسالة الالتزام

عندما تقوم بإجراء تغييرات على ملف واحد أو أكثر، فإنك تحتاج إلى تنفيذ هذه التغييرات من خلال رسالة التزام. فيما يلي بعض الإرشادات:

-   اجعل رسالة الالتزام قصيرة ومفصلة.
-   استخدم أحد أنواع الالتزام هذه كبادئة:
    -   `feat:`لميزة ما، وربما تحسين شيء موجود بالفعل.
    -   `fix:`لإصلاح، مثل إصلاح الخلل.
    -   `style:`للحصول على الميزات والتحديثات المتعلقة بالتصميم.
    -   `refactor:`لإعادة هيكلة قسم معين من قاعدة التعليمات البرمجية.
    -   `test:`لكل ما يتعلق بالاختبار.
    -   `docs:`لكل ما يتعلق بالتوثيق.
    -   `chore:`لصيانة الكود (يمكنك أيضًا استخدام الرموز التعبيرية لتمثيل أنواع الالتزام).

أمثلة:

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## شكرا للمساهمة

شكرًا لك على المساهمة في Sketchware Fu! تساعد مساهماتك في إبقاء Sketchware Fu على قيد الحياة. سيتم الإشارة إلى كل مساهمة مقبولة في نشاط "حول المعدلين". سنستخدم اسمك وصورة ملفك الشخصي في GitHub في البداية، ولكن يمكن تغييرهما بالطبع.

## الفتنة

هل تريد الدردشة معنا أو مناقشة التغييرات أو قضاء الوقت فقط؟ لدينا خادم Discord لهذا الغرض فقط.

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## تنصل

This mod was not created for any harmful purposes, such as harming Sketchware; quite the opposite, actually. It was made to keep Sketchware alive by the community for the community. Please use it at your own discretion and consider becoming a Patreon backer to support the developers. Unfortunately, other ways to support them are not working anymore, so Patreon is the only available option currently. You can find their Patreon page [هنا](https://www.patreon.com/sketchware).

We do NOT permit publishing Sketchware Fu as it is, or with modifications, on Play Store or on any other app store. Keep in mind that this project is still a mod. Unauthorized modding of apps is considered illegal and we discourage such behavior.

نحن نحب Sketchware كثيرًا ونشعر بالامتنان لمطوري Sketchware لإنشاء مثل هذا التطبيق المذهل. ومع ذلك، لم نتلق تحديثات لفترة طويلة. ولهذا السبب قررنا إبقاء Sketchware على قيد الحياة من خلال إنشاء هذا التعديل، وهو مجاني تمامًا. نحن لا نطلب أي أموال :)
