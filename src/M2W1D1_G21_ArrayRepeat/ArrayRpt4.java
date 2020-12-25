package M2W1D1_G21_ArrayRepeat;

public class ArrayRpt4 {
    public static void main(String[] args) {
// sumTotal sorusu
        // String 2D array oluştur
        // {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
        // String de $ varsa 3.2 ile çarp
        // String de € varsa 4.2 ile çarp
        // double return et
        String[][] mat={{"$14" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€13", "$2","$0"}};

        double toplam=0;  // int toplam=0; yapsam kusuratlar alınmadıgı için 382 oluyor. double ile 385.2 oluyor.

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {

              if(mat[i][j].contains("$")) {

               //   mat[i][j].replace("$", ""); //$ işareti vaken çarpılmaz. yoket.
// ama aşagıda birlikte yaptık , ayrı ayrı yaptım hata verdi. neden??????????????????-ÇÜNKÜ Bİ ATAMA YAPMADIN.

                  toplam += (Integer.parseInt(mat[i][j].replace("$",""))*3.2); //Stringi int e cevir ki işlem yapasın.
              } // parantezi koymayınca else kırmızı cizgi veriyor.

                else if(mat[i][j].contains("€")){
                    toplam+=(Integer.parseInt(mat[i][j].replace("€",""))*4.2);//yukarıdakinin 2 si birden
                }
            }
        }

        System.out.println(toplam);









     /*   double toplam=0;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (mat[i][j].contains("$"))  // $ içeriyorsa
                {
                    toplam +=Integer.parseInt(  mat[i][j].replace("$","")  ) * 3.2;
                }
                else
                if (mat[i][j].contains("€"))  // € içeriyorsa
                {
                    toplam +=Integer.parseInt(  mat[i][j].replace("€","")  ) * 4.2;
                }
            }
        }

        System.out.println("toplam = " + toplam);

*/

    }
}
