public class Main {
    public static void main(String[] args) {
 /*
        System.out.println("lesson 29 =))) ");
   for (int i=1; i<11; i++) {
       System.out.println("My number" + i);
    }

   for (int i=1; i<11; i+2) {
         System.out.println("My number" + i);
        }


   for (int i=10; i>0; i--) {
            System.out.println("My number" + i);
        }

   int result = 0;
   for (int i=10; i>0; i--)
   result = result+i;
   {
       System.out.println("My sum " + result);
        }

     int k = 0;
     while   (k<10)  {
            System.out.println("My number" + k);
            k++;
        }

        int [] marks = {98,90,95,100,92};
        System.out.println("My mark - " + marks[2]);

        for (int n=0; n < marks.length; n++) {
            System.out.println("My mark - " + marks [n]);
        }
 */



        System.out.println("My sum is - " + sumOfNumbers (100));
    }
    static int sumOfNumbers (int numberMax) {
        int result = 0;
        for (int i=numberMax; i>0; i--)
            result = result+i;
        return result;
    }
}