<p align="center">
  <img src="assets/Sketchware-Pro.png" style="width: 30%;" />
</p>

# स्केचवेयर प्रो

[![Android CI](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml/badge.svg)](https://github.com/ROSPDK/SketchwareFu/actions/workflows/android.yml)[![GitHub contributors](https://img.shields.io/github/contributors/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/graphs/contributors)[![GitHub last commit](https://img.shields.io/github/last-commit/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu/commits/)[![Discord server stats](https://img.shields.io/discord/790686719753846785)](http://discord.gg/kq39yhT4rX)[![Total downloads](https://img.shields.io/github/downloads/Sketchware-Pro/Sketchware-Pro/total)](https://github.com/ROSPDK/SketchwareFu/releases)[![Repository Size](https://img.shields.io/github/repo-size/ROSPDK/SketchwareFu)](https://github.com/ROSPDK/SketchwareFu)

स्केचवेयर प्रो में आपका स्वागत है! यहां आपको स्केचवेयर प्रो में कई कक्षाओं के स्रोत कोड और, सबसे महत्वपूर्ण बात, स्केचवेयर प्रो में योगदान करने का स्थान मिलेगा।

## ऐप बनाना

ऐप बनाने के लिए, आपको ग्रैडल का उपयोग करना होगा। सर्वोत्तम अनुभव के लिए एंड्रॉइड स्टूडियो का उपयोग करने की अत्यधिक अनुशंसा की जाती है।

विभिन्न विशेषताओं के साथ दो बिल्ड वेरिएंट हैं:

-   `minApi26:`यह संस्करण परियोजनाओं से एएबी निर्यात करने और जावा 1.8, 1.9, 10 और 11 कोड संकलित करने का समर्थन करता है। हालाँकि, यह केवल Android 8.0 (O) और उससे ऊपर के संस्करण पर काम करता है।
-   `minApi21:`यह संस्करण परियोजनाओं से एएबी का उत्पादन नहीं कर सकता है और केवल जावा 1.7 कोड संकलित कर सकता है, लेकिन यह एंड्रॉइड 5 और इसके बाद के संस्करण का समर्थन करता है।

एंड्रॉइड स्टूडियो में उपयुक्त बिल्ड वेरिएंट का चयन करने के लिए, बिल्ड वेरिएंट टैब का उपयोग करें या उपयुक्त ग्रैडल बिल्ड कमांड का उपयोग करें।

### स्रोत कोड मानचित्र

| कक्षा                  | भूमिका                                                |
| ---------------------- | ----------------------------------------------------- |
| `a.a.a.ProjectBuilder` | संपूर्ण प्रोजेक्ट संकलित करने के लिए सहायक            |
| `a.a.a.Ix`             | AndroidManifest.xml जनरेट करने के लिए ज़िम्मेदार      |
| `a.a.a.Jx`             | गतिविधियों का स्रोत कोड उत्पन्न करता है               |
| `a.a.a.Lx`             | श्रोताओं आदि जैसे घटकों का स्रोत कोड उत्पन्न करता है। |
| `a.a.a.Ox`             | लेआउट की XML फ़ाइलें बनाने के लिए ज़िम्मेदार          |
| `a.a.a.qq`             | अंतर्निहित पुस्तकालयों की निर्भरता की रजिस्ट्री       |
| `a.a.a.tq`             | संवाद प्रश्नोत्तरी के संकलन के लिए जिम्मेदार          |
| `a.a.a.yq`             | स्केचवेयर प्रोजेक्ट्स के फ़ाइल पथ व्यवस्थित करता है   |

> [!बख्शीश]आप भी चेक कर सकते हैं`mod`पैकेज, जिसमें अधिकांश योगदानकर्ताओं के परिवर्तन शामिल हैं।

## योगदान

यदि आप स्केचवेयर प्रो में योगदान देना चाहते हैं, तो इन चरणों का पालन करें:

1.  इस भंडार को फोर्क करें।
2.  अपने फोर्कड भंडार में परिवर्तन करें।
3.  उन परिवर्तनों का परीक्षण करें.
4.  इस रिपॉजिटरी में एक पुल अनुरोध बनाएं।
5.  आपके पुल अनुरोध की समीक्षा रिपॉजिटरी सदस्यों द्वारा की जाएगी और स्वीकार किए जाने पर विलय कर दिया जाएगा।

हम किसी भी आकार के योगदान का स्वागत करते हैं, चाहे वे प्रमुख विशेषताएं हों या बग फिक्स हों, लेकिन कृपया ध्यान दें कि सभी योगदानों की गहन समीक्षा की जाएगी।

### हम किन बदलावों को स्वीकार करने में असमर्थ हैं

उपयोगकर्ता इंटरफ़ेस से संबंधित अधिकांश परिवर्तन (घटक जो पहले से ही वेनिला स्केचवेयर में मौजूद हैं) को स्वीकार किए जाने की संभावना नहीं है। यदि डिज़ाइन से संबंधित कुछ भी बदल जाता है, तो आदर्श रूप से पूरे ऐप को भी नई शैली का पालन करना चाहिए, जो चुनौतीपूर्ण है, खासकर मॉड्स के लिए।

> [!टिप्पणी]इस बीच, हम मुख्य शाखा में यूआई परिवर्तन स्वीकार नहीं करते हैं, लेकिन हम करते हैं[पुनः डिज़ाइन शाखा](https://github.com/Sketchware-Pro/Sketchware-Pro/tree/material-redesign)चूँकि हम स्केचवेयर प्रो के मटेरियल डिज़ाइन संस्करण पर सक्रिय रूप से काम कर रहे हैं।

### प्रतिबद्ध संदेश

जब आप एक या अधिक फ़ाइलों में परिवर्तन करते हैं, तो आपको उन परिवर्तनों को एक प्रतिबद्ध संदेश के साथ करने की आवश्यकता होती है। यहां कुछ दिशानिर्देश दिए गए हैं:

-   प्रतिबद्ध संदेश को संक्षिप्त और विस्तृत रखें।
-   उपसर्ग के रूप में इनमें से किसी एक प्रतिबद्ध प्रकार का उपयोग करें:
    -   `feat:`एक सुविधा के लिए, संभवतः पहले से मौजूद किसी चीज़ में सुधार करना।
    -   `fix:`किसी सुधार के लिए, जैसे बग फिक्स।
    -   `style:`स्टाइल से संबंधित सुविधाओं और अपडेट के लिए।
    -   `refactor:`कोडबेस के एक विशिष्ट अनुभाग को दोबारा बनाने के लिए।
    -   `test:`परीक्षण से संबंधित हर चीज़ के लिए।
    -   `docs:`दस्तावेज़ीकरण से संबंधित हर चीज़ के लिए।
    -   `chore:`कोड रखरखाव के लिए (आप प्रतिबद्ध प्रकारों को दर्शाने के लिए इमोजी का भी उपयोग कर सकते हैं)।

उदाहरण:

-   `feat: Speed up compiling with new technique`
-   `fix: Fix crash during launch on certain phones`
-   `refactor: Reformat code in File.java`

## योगदान देने के लिए धन्यवाद

स्केचवेयर प्रो में योगदान देने के लिए धन्यवाद! आपका योगदान स्केचवेयर प्रो को जीवित रखने में मदद करता है। प्रत्येक स्वीकृत योगदान को "मोडर्स के बारे में" गतिविधि में नोट किया जाएगा। हम प्रारंभ में आपके GitHub नाम और प्रोफ़ाइल चित्र का उपयोग करेंगे, लेकिन निश्चित रूप से उन्हें बदला जा सकता है।

## कलह

क्या आप हमारे साथ बातचीत करना चाहते हैं, परिवर्तनों पर चर्चा करना चाहते हैं, या बस घूमना-फिरना चाहते हैं? हमारे पास बस उसके लिए एक डिस्कोर्ड सर्वर है।

[![Join our Discord server!](https://invidget.switchblade.xyz/kq39yhT4rX)](http://discord.gg/kq39yhT4rX)

## अस्वीकरण

यह मॉड किसी भी हानिकारक उद्देश्य के लिए नहीं बनाया गया था, जैसे स्केचवेयर को नुकसान पहुंचाना; वास्तव में, बिल्कुल विपरीत। इसे समुदाय द्वारा समुदाय के लिए स्केचवेयर को जीवित रखने के लिए बनाया गया था। कृपया इसे अपने विवेक से उपयोग करें और डेवलपर्स का समर्थन करने के लिए पैट्रियन समर्थक बनने पर विचार करें। दुर्भाग्य से, उनका समर्थन करने के अन्य तरीके अब काम नहीं कर रहे हैं, इसलिए पैट्रियन वर्तमान में एकमात्र उपलब्ध विकल्प है। आप उनका पैट्रियन पेज पा सकते हैं[यहाँ](https://www.patreon.com/sketchware).

हम स्केचवेयर प्रो को प्ले स्टोर या किसी अन्य ऐप स्टोर पर उसी रूप में या संशोधनों के साथ प्रकाशित करने की अनुमति नहीं देते हैं। ध्यान रखें कि यह प्रोजेक्ट अभी भी एक मॉड है। ऐप्स में अनधिकृत मोडिंग को अवैध माना जाता है और हम इस तरह के व्यवहार को हतोत्साहित करते हैं।

हम स्केचवेयर को बहुत पसंद करते हैं और इतना अद्भुत ऐप बनाने के लिए स्केचवेयर के डेवलपर्स के आभारी हैं। हालाँकि, हमें काफी समय से अपडेट नहीं मिला है। इसीलिए हमने इस मॉड को बनाकर स्केचवेयर को जीवित रखने का निर्णय लिया, और यह पूरी तरह से मुफ़्त है। हम कोई पैसा नहीं मांगते :)