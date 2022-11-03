package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfMapi=new HashMap<>();

        harfMapi.put("A",5);
        harfMapi.put("B",1);
        harfMapi.put("C",2);
        harfMapi.put("D",4);
        harfMapi.put("E",4);

        System.out.println(harfMapi);

        harfMapi.compute("A", (ali,veli) -> veli*2);
        harfMapi.compute("D", (a,b) -> b*b);
        harfMapi.computeIfAbsent("C", (v)->30);//C oldugundan dolayi degistirmedi, F olmadigindan ekledi
        harfMapi.computeIfAbsent("F", (v)->30);
        harfMapi.computeIfPresent("E",(k,v) ->v+5);//olani 5 arttirir
        harfMapi.computeIfPresent("G",(k,v) ->v+5);//G yok o yuzden hicbir sey yapmaz
        //computeifabsent map'te varsa bir sey degistirmiyor
        //computeifpresent map'te yoksa bir sey degistirmiyor


        System.out.println(harfMapi);
    }
}
