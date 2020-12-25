package M1W4D4_G19_Array;

public class Arrays_2D_1 {
    public static void main(String[] args) {
        int [] dizi1= new int[5];
        int [] dizi2={1,45,78,90,75,34};

        int [][] mat1=new int [2][3];//2 boyutlu dizi tanımlaması
        int [][] mat2={ {65,76,90},{80,66,95} }; // 2 boyutlu dizi hem tanımalama hem değer atama
        // satır sayısı kadar Q parantez vardır...içindeki eleman sayıları da sütünları verir.
// dersler ing. ve fen olsun... öğrenciler ali - veli- betul olsun.

        for(int satir=0;satir<2;satir++){

            for(int sütün=0;sütün<3;sütün++){

                System.out.print(mat2[satir][sütün]+" ");

            }
            System.out.println();
        }

        int tümNotlarınToplamı=0;
        for(int satir=0;satir<2;satir++){

            for(int sütün=0;sütün<3;sütün++){

                tümNotlarınToplamı=tümNotlarınToplamı+mat2[satir][sütün];

            }

        }

        System.out.println("tümNotlarınToplamı: "+tümNotlarınToplamı);
        System.out.println("mat2 nin length= "+mat2.length); // 2 dir conku satır sayısı 2...

        int birinciDersNotToplamı=0;

// burada sadece 1. sutunu toplayacagın için satırla işin olmayacak.sadece sütünların toplamını al...

            for(int sütün=0;sütün<3;sütün++){

            birinciDersNotToplamı=(birinciDersNotToplamı+mat2[0][sütün]);//satırı cıktıya yaz.
            }


        // burada sadece 1. sutunu toplayacagın için satırla işin olmayacak.sadece sütünların toplamını al...
       System.out.println("birinciDersNotortalaması "+(birinciDersNotToplamı/3));
        int ikinciDersNotToplamı=0;


            for(int sütün=0;sütün<3;sütün++){

                ikinciDersNotToplamı=(ikinciDersNotToplamı+mat2[1][sütün]);//satırı çıktıya yaz.
            }

        System.out.println("ikinci dersin ortALAMASI: "+ikinciDersNotToplamı/3);

// ALİ nın not ortlaması

        int AliNotlarınToplamı=0;
        for(int satir=0;satir<2;satir++){

                AliNotlarınToplamı=AliNotlarınToplamı+mat2[satir][0];

            }

        System.out.println("ali nın not ortalaması= "+AliNotlarınToplamı/2);
// VELİ nin notları toplamı...
        int VeliNotlartoplamı=0;
        for(int satir=0;satir<2;satir++){
            VeliNotlartoplamı+=mat2[satir][1];
        }
        System.out.println("veli nin not ortalaması= "+VeliNotlartoplamı/2);

 // Betül ün not ortalaması....
        int BetülNotlartoplamı=0;
        for(int satir=0;satir<2;satir++){
            BetülNotlartoplamı+=mat2[satir][2];
        }
        System.out.println("Betül nün not ortalaması= "+BetülNotlartoplamı/2);


    }
}
