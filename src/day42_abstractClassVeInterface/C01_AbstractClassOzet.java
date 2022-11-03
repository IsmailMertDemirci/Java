package day42_abstractClassVeInterface;

public class C01_AbstractClassOzet {
    /*
    Bir class'i abstract yapip yapmamaya bastan karar veririz
    Eger bir class'tan obje olusturmayacaksak, o class'i child class'larinin uymasi gereken
    kurallari belirleyecek sekilde dizayn etmek istiyorsak abstract class yapariz

    Abstract bir class'ta child class'larin mutlaka uymasi gereken kurallari abstract methodlar ile belirleriz
    Abstract methodlar mutlaka child class'larda override edilecegi icin body'ye ihtiyac duymaz

    Abstract olarak isaretlenen veya tanimlanan methodlarin body'si olmaz

    Abstract class zincirinden sonra gelen ilk concrete class, parent'larinda bulunan ve concrete olmayan tum
    methodlari Override etmek zorundadir, ancak parent abstract class'larda bulunan concrete methodlari
    override etmek zorunda degildir

    Abstract bir class'in abstract child'i parent'taki abstract methodlari override etmek zorunda degildir

    Abstract class'lar constructor'a sahiptir fakat abstract class'lardan obje olusturulamaz(kisir constructor)
     */
}
