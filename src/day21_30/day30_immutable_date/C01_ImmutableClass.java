package day21_30.day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Mert");

        System.out.println(list);//[Kenan, Enes, Mert]

        list.set(1, "Yasemin");//[Kenan, Yasemin, Mert]
        System.out.println(list);

        list.remove("Mert");//[Kenan, Yasemin]
        System.out.println(list);


    }

}
