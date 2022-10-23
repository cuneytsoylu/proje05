https://spendinggood.com/
sitesinin testlerini gerçekleştirdiğimiz bu projemizde Test NG framework ile çalışıldı.Test NG framework unde OOP(object oriented programming) konseptine uyarak POM(page object model) dizayn modeli kullanılmıştır

# page dosyasi

bu dosyamızda elimizde bulunan sitenin testlerini gerçekleştireceğimiz elemenlerin locatelerini sakladığımız classlarımız bulunmakta.İstediğimiz locate almak için oluşturduğumuz clasın adında constructar oluşturuyoruz ve içine PageFactory clasını çağırıp içerisine oluşturduğumuz driver çağırıp burada olduğunu belli ettiğimiz this key kullanılır. locatelerimizinde çağırabilinmesi için de FindBy notasyonu ile locatelerimizi oluşturabiliriz


# test dosyasi

tests dosyamızda otomasyon kodlarimizi




# utilities dosyasi

yardımcı classımız bu dosyamızda bize sürekli lazım olan classlarımız ve methodlarımız bulunmaktadır. İçerisinde projemizi daha anlaşılır hale getirecek classlarımız ve methodalrımız vardır bunlar Driver.class , ConfigReader.class , ReusableMehod.class,TestBaseRapor vb. dosyalarımız bulunmaktadır.

## Configuration.properties

properties dosyamızda sürekli kullandığımız variablelarımız bulunmakta , bu veriabları kullanmak için properties dosyası Key = value olaraka oluşturulmakta ,burdaki bilgileri başaka classlara çağırabilmek için utilities dosyasından ConfigReader classı çağırırlara içindeki method saysınde bu bosyada bulunan bilgileri istediğimiz yerlere çağırabiliriz.

# pom.xml

tüm çalışmlaraımızın ve kodlarımızın bilgilerinin bulunduğu bu dosyada aslında kullanmak istediğimiz kodalrın kütüphanesini dependencies tagının içerisine yerleştirip güncel bilgilerini sürekli olarak kendimizde tutabiliriz. burası sayaesinde tüm kodlara erişimi sağlayabiliriz.


# Selenium Testi

<br/>

Java18 ve Maven projesi oluşturulup Test NG framework kullanılarak oluşturulmuştur.

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="git" width="100" height="40"/> </a>

<hr/>

# Kullanilan Testler

E2E

SMOKE TEST

NEGATİVE SMOKE TEST

