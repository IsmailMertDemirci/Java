package allPractices.practiceDay4;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {

        birkereyazdir("aabbcccccddddaaa");
    }

    private static void birkereyazdir(String str) {
        String output="";//String default degeri hiclik '' oldugu icin isleme etki etmesin diye bu sekilde atadik

        for (int i = 0; i <str.length() ; i++) { //0 dan baslarsa str.length, 1 den baslarsa str.length()-1
            if(!output.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz icin sonucumuz
                output+=str.substring(i,i+1);           //str den aldigimiz herhangi bir karakteri icermesin

            }
        }
        System.out.println(output);

    }


}
