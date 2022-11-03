package day21_30.day25_Constructor;

public class C01 {
        /*
        Java OOP concept kullandigi icin olusturulan her bir class'in obje uretebilmesine uygun dizayn edilmistir
         Ama her class'tan obje uretilemeyebilir

         bunun icin Java ihtiyac halinde kullanilmasi icin her classta default bir cons koymustur

         bu default cons class'tan obje olusturuldugunda otomatik olarak calisir

         ornegin bu classta cons gorunmemesine ragmen C02 class'inda icinde oldugumuz C01 class'indan
         bir obje uretebildik

         ozetlersek;
         1- Obje olusturmak icin constructor kullanmak zorundayiz
         2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
         3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
         */
        int sayi;

        public void deneme(){
            System.out.println("C01 den deneme method");


        }
}
