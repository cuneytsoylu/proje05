https://spendinggood.com/ sitesinin testlerini gerçekleştirdiğimiz bu projemizde Test NG amework ile çalışıldı.Test NG framework unde OOP(object oriented programming) konseptine uyarak POM(page object model) dizayn modeli kullanılmıştır

pages dosyası
bu dosyamızda elimizde bulunan sitenin testlerini gerçekleştireceğimiz elemenlerin locatelerini sakladığımız classlarımız bulunmakta.İstediğimiz locate almak için oluşturduğumuz clasın adında constructar oluşturuyoruz ve içine PageFactory clasını çağırıp içerisine oluşturduğumuz driver çağırıp burada olduğunu belli ettiğimiz this key kullanılır. locatelerimizinde çağırabilinmesi için de FindBy notasyonu ile locatelerimizi oluşturabiliriz


testdosyası



Utilities dosyası
yardımcı classımız bu dosyamızda bize sürekli lazım olan classlarımız ve methodlarımız bulunmaktadır. İçerisinde projemizi daha anlaşılır hale getirecek classlarımız ve methodalrımız vardır bunlar Driver.class , ConfigReader.class , ReusableMehod.class,TestBaseRapor vb. dosyalarımız bulunmaktadır.

Configuration.properties
properties dosyamızda sürekli kullandığımız variablelarımız bulunmakta , bu veriabları kullanmak için properties dosyası Key = value olaraka oluşturulmakta ,burdaki bilgileri başaka classlara çağırabilmek için utilities dosyasından ConfigReader classı çağırırlara içindeki method saysınde bu bosyada bulunan bilgileri istediğimiz yerlere çağırabiliriz.

pom.xml
tüm çalışmlaraımızın ve kodlarımızın bilgilerinin bulunduğu bu dosyada aslında kullanmak istediğimiz kodalrın kütüphanesini dependencies tagının içerisine yerleştirip güncel bilgilerini sürekli olarak kendimizde tutabiliriz. burası sayaesinde tüm kodlara erişimi sağlayabiliriz.

Selenium Testi

Java18 ve Maven projesi oluşturulup Test NG framework kullanılarak oluşturulmuştur.


java git Selenium intelj git


![java-original](https://user-images.githubusercontent.com/110092795/197374624-bd9e0872-48b6-4752-b038-238b078a2036.svg)

![git](https://user-images.githubusercontent.com/110092795/197374620-084a97d9-88dd-47ce-9412-18aa4214ffac.svg)

![selenium](https://user-images.githubusercontent.com/110092795/197374615-bca1fa2f-38be-4e8b-b06c-d09e2e2dbb30.png)

![intellij](https://user-images.githubusercontent.com/110092795/197374618-8f0adaf1-018b-4de9-b37a-665e5b8340fc.png)
