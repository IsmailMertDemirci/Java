package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedListQueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        //Queue kuyruk demektir, dolayisiyla sira onemlidir, gelen sona gelir, giden bastan gider

        System.out.println(ll3);//[Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove());//Adem

        System.out.println(ll3);//[Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat"));//true

        System.out.println(ll3);//[Zeynep, Kadir]

        System.out.println(ll3.element());//Zeynep, queue bossa exception atar
        System.out.println(ll3.peek());//Zeynep

        Queue<String> ll4=new LinkedList();
        //System.out.println(ll4.element());//throws NoSuchElementException
        System.out.println(ll4.peek());//null

        /*
        peek ve element, silmeden ilk elementi bize dondurur
        aralarindaki fark bos liste olursa peek null doner, element exception firlatir
         */

        ll3.offer("Ahmet");
        System.out.println(ll3);//[Zeynep, Kadir, Ahmet]

        System.out.println(ll3.poll());//Zeynep
        System.out.println(ll3);//[Kadir, Ahmet]
        //aralarindaki fark bos liste olursa poll null doner,remove Exception verir

    }
}
