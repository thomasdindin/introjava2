package com.example;
import java.util.Random;


public class td3 {
    static void motif1(){
        for (int j=1; j<=4;j++){
            if (j==1 || j ==4)
                for (int i =1; i<=40; i++){
                    System.out.print('-');
                }
            if (j==2){
                for (int i=1; i <= 10; i++){
                    System.out.print("_-^-");
                }
            }

            if (j==3) {
                for (int i=1; i<=20; i++){
                    int out = ( i >= 10) ? i%10 : i;
                    System.out.print(out);
                    System.out.print(out);
                }
            }
            
            System.out.println();
        }
        
    }
    static void motif2(int c,int l){
            for (int i=1; i<= c;i++){
                for (int j=1; j<=l;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    static void motif3(int h){
        for (int i = 1; i <= h; i++){
            for (int j = 1; j <=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void motif4(int h){
        for (int i = 1; i <= h; i++){
            for (int j = 1; j <=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void motif5(int h){
        int max= h;
        for (int i = 1; i <= h; i++){
            for (int j = 0; j <= max; j++){
                if (j==max) System.out.print(i);
                else System.out.print(" ");}
            max--;
            System.out.println();
        }

    }

    static void motif6(int h){
        int max= h;
        for (int i = 1; i <= h; i++){
            for (int j = 0; j <= h; j++){
                if (j>=max) System.out.print(i);
                else System.out.print(" ");}
            max--;
            System.out.println();
        }
    }

    static void motif7(int dep, int end, int nb, boolean reverted, int lines){
        for (int i = 1; i<= lines;i++){
            var it = dep;
            var cond = true;
            int variable = (nb==0)? dep : nb;

            while (cond){
                if (reverted){
                    for (int j= 1;j<=variable;j++){
                        System.out.print(it);}
                    it--;
                    cond = (it>=end) ? true: false;}

                else{
                    for (int j= 1;j<=variable;j++){
                        System.out.print(it);
                    }
                    it++;
                    cond = (it<=end) ? true: false;
                }
                if (nb==0 && reverted) variable--;
                else if (nb==0 && reverted == false) variable++;}
            
            System.out.println();  
        }
    }

    static void motif10(){
        //length : 11;
        int deb = 1;
        int counter = 5;
        for (int i =1; i<=5;i++){
            for (int y=1; y<=counter;y++){
                System.out.print("-");
            }
            for (int y=1; y<=deb;y++){
                System.out.print(deb);
            }
            for (int y=1; y<=counter;y++){
                System.out.print("-");
            }
            System.out.println();
            deb+=2;
            counter--;
        }
    }
    static void motif11(){
        int exc = 22;
        int slash = 0;
        for (int i = 1; i<=6; i++ ){
            for (int j =0; j<slash; j++){
                System.out.print("\\");
            }
            for (int j =0; j<exc; j++){
                System.out.print("!");
            }
            for (int j =0; j<slash; j++){
                System.out.print("/");
            }
            System.out.println();
            exc-=4;
            slash+=2;
        }
    }
    
    static void motif11b(int h){
        int exc = (h*4)-2;
        int slash = 0;
        for (int i = 1; i<=h; i++ ){
            for (int j =0; j<slash; j++){
                System.out.print("\\");
            }
            for (int j =0; j<exc; j++){
                System.out.print("!");
            }
            for (int j =0; j<slash; j++){
                System.out.print("/");
            }
            System.out.println();
            exc-=4;
            slash+=2;
        }
        System.out.println("\\\\\\\\\\\\\\".length());
    }

    static void motif12(int taille){
        String border = "+===+";
        String window = "|   |";
        for (int i = 1; i<= taille-1;i++ ) border+= "===+";
        for (int i = 1; i<= taille-1;i++ ) window+= "   |";
        for (int i = 1; i <=taille; i++){
            System.out.println(border);
            for (int j = 1; j <=3;j++) System.out.println(window);
        }
        System.out.println(border);
    }

    static void motif13(int hauteur){
        int slash = (hauteur * 8)/2;
        int stars = 0;
        for (int i = 1; i<= hauteur; i++){
            for (int j = 1; j<= slash; j++) System.out.print("/");
            for (int j = 1; j<= stars; j++) System.out.print("*");
            for (int j = 1; j<= slash; j++) System.out.print("\\");
            System.out.println();
            slash-=4;
            stars+=8;
        }

    }
    static void motif14(int hauteur){
        int dollar = hauteur;
        int inner = hauteur *2;
        int outlet = 0;
        for (int i=1;i<=hauteur;i++){
            for (int j = 1; j<= outlet; j++) System.out.print("*");
            for (int j = 1; j<= dollar; j++) System.out.print("$");
            for (int j = 1; j<= inner; j++) System.out.print("*");
            for (int j = 1; j<= dollar; j++) System.out.print("$");
            for (int j = 1; j<= outlet; j++) System.out.print("*");
            dollar--;
            inner-=2;
            outlet+=2;
            System.out.println();
        }
    }
    
    static void motif15(){
        int fslash= 12;
        int bslash=0;
        int stars = 6;
        int height = 7;
        int whites = 1;

        for (int i = 1; i<= height;i++){
            for (int j =1; j<=stars;j++) System.out.print("*");
            for (int j =1; j<=whites;j++) System.out.print(" ");
            for (int j =1; j<=fslash;j++) System.out.print("/");
            for (int j =1; j<=bslash;j++) System.out.print("\\");
            for (int j =1; j<=whites;j++) System.out.print(" ");
            for (int j =1; j<=stars;j++) System.out.print("*");
            System.out.println();
            fslash-=2;
            bslash+=2;
            stars--;
            whites++;
        }
    }
    static void motif16(int marches){
        int width = ((marches*6))-(9+(marches%5));
        int blanks = 5;

        for (int i = 1; i<= marches; i++){
            for (int j=1;j <= width;j++) System.out.print(" ");
            System.out.print(" o  ******");
            for (int j=1;j <= blanks-5;j++) System.out.print(" ");
            System.out.println("*");
            for (int y =1;y<=2;y++ ){
                for (int j=1;j <= width;j++) System.out.print(" ");
                System.out.print("/|\\ *");
                for (int j=1; j<= blanks; j++) System.out.print(" ");
                System.out.println("*");
            }
            blanks += 5;
            width-=5;
        }
        for (int i =1; i<= (6*marches)+2;i++) System.out.print("*");
        System.out.println((6*marches)+2);
    }

    static boolean jeuDeLoie(int lancer){
        int res = 0;
        for (int i=1; i<=lancer;i++){
            res+=new Random().nextInt(7);
        }
        if (res==20){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        //Output 1: 4, 2
        /*
        int nb = 4;
        for (int i = 1; i <= nb; i++) {
            System.out.println(nb);
            nb /= 2;   // équivalent à nb = nb / 2
        }
        */

         //Output 2:
         /* 24 1
            22 2
            19 3
            15 4
            10 5 */

        /*Output 3: 2
                ligne suivante: 4
                ligne suivante: 6
                ligne suivante:*/
        //Output 4: Table de multiplication(1:5) jusqu'à 10
        /*Output 6:
         *          
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
         */


        /* Output 7:
         *  ****!****!****!
            ****!****!****!
         */

        /* Output 8:
         *  ************!
            ************!
         */

        /* Output 9:
         *       *!*!*!*!
                 *!*!*!*!
                 *!*!*!*!
                 *!*!*!*!
                 *!*!*!*!
                 *!*!*!*!
         */

         //Suite 1:
         /*for (int i=-4; i<=86;i+=18){
            System.out.println(i);
         } */

         //Suite 2:
         /*
         int count =0;
         int a = 0;
         int b = 1;
         System.out.print(a + " "+  b + " ");
         while (count <=20){
            var current = a+b;
            System.out.print(current + " ");
            a=b;
            b= current;
            count++;
         }
         System.out.println();
         */
        //Suite 3:
        /*
        for (int i = 1; i <=10;i++){
            System.out.print(i*i + " ");
        }
        System.out.println();
        */
        //Suite 4:
        /*
        for (int i = 1; i <=10;i++){
            System.out.print((int)Math.pow(i,2) + " ");
        }*/
        //motif1();
        //motif2(4,5);
        //motif3(5);
        //motif4(5);
        //motif5(5);
        //motif6(5);
        //motif7(0,9,3,false,3);
        //motif7(9,0,5,true,5);
        //motif7(0,9,0,false,4);
        //motif10();
        //motif11();
        //motif11b(8);
        //motif12(2);
        //motif12(3);
        //motif13(5);
        //motif13(6);
        //motif14(37);
        //motif15();
        //motif16(11);
        //jeuDeLoie(5);
        int count = 0;
        while (!jeuDeLoie(5)) count ++;
        System.out.println(count);
    }
}
