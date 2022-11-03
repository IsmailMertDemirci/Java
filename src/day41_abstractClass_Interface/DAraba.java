package day41_abstractClass_Interface;

public abstract class DAraba {

    public static void main(String[] args) {
        /*
    abstract class'da main method opsiyoneldir . Eger abstract class sadece child class'larin tasimak
    zorunda oldugu ozellikleri belirlemek icin olusturulduysa main methoda ihtiyac olmaz
    Sadece abstract methodlar olur

    ama bor abstract methodda standart belirlemek disinda da methodlar calisabilir
    bu durumda ihtiyac olursa main merhod olusturulabilir
     */
    }
    protected abstract void yakit();

    protected abstract void kaporta();

    public abstract void motor();
    /*
    sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen methodlar abstract
    method olur ve abstract methodlarin body'si olmaz {} yoktur
    body olmadigi icin kod da yazilmaz
     */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan methodlara concrete method denir
        abstract bir methodu abstract keyword ile belirtmek ZORUNLUDUR
        concrete methodlarda bunun declare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda abstract olmayan methodlardan
        bahsetmek icin concrete tabirini kullaniriz
        */
        /*
        /*
araba classindaki bodysi olmayan methodlar ne ise yarıyor
ya kural koy ya kurala uy diyor.
 */

    }

}
