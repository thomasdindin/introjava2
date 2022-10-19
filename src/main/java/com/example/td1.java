package com.example;
import java.util.Scanner;
import java.util.Random;

public class td1 {
    static void ex1(){
        int heure = 12;
        int minute = 34;
        int secondes = 56;

        int sum = heure * 3600 + minute * 60 + secondes;
        System.out.println("Il s'est écoulé "+ sum + " secondes depuis minuit.");
    }
    static int ex2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nombre d'heures:");
        int heure = scan.nextInt();
        System.out.println("Entrez le nombre de minutes:");
        int minutes = scan.nextInt();
        System.out.println("Entrez le nombre de secondes:");
        int secondes = scan.nextInt();
        int sum = (heure*3600)+(minutes*60)+secondes;

        System.out.println("Il s'est écoulé " + sum + " secondes depuis minuit");
        scan.close();
        return sum;
    }
    static int ex3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nombre d'heures:");
        int heure = scan.nextInt();
        System.out.println("Entrez le nombre de minutes:");
        int minutes = scan.nextInt();
        System.out.println("Entrez le nombre de secondes:");
        int secondes = scan.nextInt();
        int sum = (24*3600) - ((heure*3600)+(minutes*60)+secondes);
        System.out.println("Il reste " + sum + "secondes avant minuit.");
        scan.close();
        return sum;
    }
    static void ex4(){
        System.out.println("Heure de début:");
        int deb = ex2();
        System.out.println("Heure de fin:");
        int end = ex2();

        float res = ((end-deb)*100)/86400;
        System.out.println(" Cela vous aura prit " + res+ "% de la journée.");

    }
    static void ex5(){
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        System.out.println("Vous pensiez à:" + guess);
        System.out.println("Le nombre auquel je pensais était :" + new Random().nextInt(101));
        scan.close();

    }
    static int[] nbPlates(double poids){
        int[] weight_array = new int[6];
        double[] weight_index = {20,15,10,5,2.5,1.25};
        double totalWeight = (poids-20)/2;

        for (int i = 0; i < 6; i++){
            var count = 0;
            while (totalWeight>=weight_index[i]){
                count++;
                totalWeight-=weight_index[i];
            }
            weight_array[i]=count;
        }
        return weight_array;
        
    }
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();   
        for (int i:nbPlates(107.5)) System.out.println(i);;
    }
}
