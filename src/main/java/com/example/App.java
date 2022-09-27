package com.example;
import java.util.Random;
import java.util.Scanner;

public class App {

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

    static void phrase(){
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Entrez un nom: ");
        String nom1 = scan1.nextLine();
        System.out.print("Entrez un nombre: ");
        int nombre = scan1.nextInt();
        scan1.nextLine();
        System.out.print("Entrez un nom: ");
        String nom2 = scan1.nextLine();
        System.out.print("Entrez un adjectif: ");
        String adjectif = scan1.nextLine()+ ".";
        System.out.println("Il était une fois un "+ nom1 + " qui avait "+ nombre + " " +nom2 +". Cela le rendait très "+ adjectif);
        scan1.close();
    }
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();   
        //phrase();
    }
}
