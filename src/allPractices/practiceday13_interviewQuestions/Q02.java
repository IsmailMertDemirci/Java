package allPractices.practiceday13_interviewQuestions;

public class Q02 {
        /*
        // Stringi ters cevirmek icin bir Java Programi yazin
        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        */
        public static void main(String[] args) {
            //1-String builder ile
                String input = "All is well";

                StringBuilder str = new StringBuilder();
                str.append(input);//append ekleme yapar, StringBuilder methodudur
                System.out.println("str = " + str);

                String tersInput=str.reverse().toString();//reverse ile tersine cevrildi
                System.out.println("tersInput = " + tersInput);

                System.out.println("2. yol");

                //int sonHarf=input.length()-1 yazip asagidaki input.length kismina sonHarf yazabilirdik
                for (int i = input.length()-1; i >=0 ; i--) {
                        System.out.println(input.charAt(i));//her bir karakteri alip yazdirdi
                }

        }
}
