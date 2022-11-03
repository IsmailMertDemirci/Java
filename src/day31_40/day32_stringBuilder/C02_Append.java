package day31_40.day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        //sonuna bir sey eklemek icin append kullaniriz

        sb.append("?");

        System.out.println(sb);

        //append istedigimiz String'i en sona ekler, araya ekleme yapmaz, sayisal deger de ekler
        //string strong dan dolayi, append(4) yaparsam java daha ne yapsin5 olur, ne eklersek
        //ekleyelim bir String gibi sonuna ekliyor

        sb.append("java",2,4);
        System.out.println(sb);

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);

        //araya ekleme yapmak istersek insert kullanmaliyiz

        sb.insert(22,"valla valla",5,11);//valla valla kismindaki 5. indeks ile 11.indeks
        //arasini aliyor, 5-11 sayilari icerideki stringi boluyor
        System.out.println(sb);
    }
}
