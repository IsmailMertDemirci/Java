package day11_20.day20_arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[] = {1, 2, 3, 4, 5, 6, 7};

        //array'in tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7] java virgul bosluk otomatik koyar,ekstra karakter yok

        //array'in tum elementlerini(elemanlarini) yazdirin bunun icin for kullanmaliyiz

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");

        }
    }
}
/*
manuel olarak , ve bosluk koymak istersek for dongusunde if kalibi yapariz
        for (int i = 0; i < sayilar.length; i++) {
            if(i!=sayilar.length-1){
                System.out.print(sayilar[i] + ", ");
            }else{
                System.out.print(sayilar[i]);
 */