package M4W1D5_G62_OCA;

public class S162 {


        int count; // basına static yaz cözulur... yoruma aldım ki. gör...

        public static void displayMsg(){
            // Static bir metodun içerisine dışarıdan çağrılan metod veya fiedlar mutlak suret STATIC olmalı.

          //  count++;                                                   // line n1
          //  System.out.println("Welcome "+" Visit Count: " + count);   // line n2
        }

        public static void main(String[] args) {

            S162.displayMsg();       // line n3
            S162.displayMsg();      // line n4
        }
    }


