package allPractices.practiceDay7;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {

        String[][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        //icerideki elemanlara erisirken for dongusu kullaniyoruz

        double toplam = 0;

        for (int i = 0; i < 3; i++) { //lengthi 3 ondan i<3
            for (int j = 0; j < 3; j++) { //3 cunku inner arrayin de lengthi 3
                if (arr[i][j].contains("$")){//array string oldugundan contains kullanabildik/alt satirda array String oldugu icin data casting yaptik
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2; //bu sekilde kelimeyi sayiya ceviriyoruz
                //$ isareti kalkinca stringin icinde 12 kaldi, bunu sayiya cevirmek icin Double.parseDouble kullandik
                }else{
                    toplam+= Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }
            }

        }

        System.out.println("toplam = " + toplam);
    }
}
