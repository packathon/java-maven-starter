### Java başlangıç projesi

Bu repository, Java ve Maven ile hızlıca proje oluşturabileceğiniz ve içerisinde örnek testler barındıran bir proje iskeletidir.

Gereklilikler: 

* Java 1.8
* Maven

#### Çalıştırma (ve testlerin çalıştırılması)

    mvn package

Bu komut proje dosyalarınızı derler, testleri çalıştırır ve target klasörü içerisinde çalıştırılabilir bir `über-jar` oluşturur.

#### Testleri çalıştırma

    mvn test

Bu komut proje içerisinde yer alan `Calculator` sınıfının testlerini çalıştırır.

#### Çalıştırma

    java -jar target/test-1.0-SNAPSHOT.jar

Bu komut aşağıdaki gibi bir çıktı üretmelidir:
    
    [main] INFO org.packathon.test.Application - Hey!

