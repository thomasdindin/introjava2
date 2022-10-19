package com.example;

import java.util.Random;
import java.util.Scanner;

public class td4j {
    static void guess1(){
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        if (value == gen ) System.out.println("Vous avez gagné");
        else System.out.println("Perdu ! La valeur était " + gen );
    }

    static void guess2(){
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        if (value > gen ) System.out.println("Perdu ! vous avez dépassé de " + (value-gen));
        else if  ( value < gen ) System.out.println("Perdu ! Il manquait  " + (gen-value) );
        else System.out.println("C'est gagné !");
    }

    static void guess3(){
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        boolean win = false;
        int tries = 1;
        while(!win){
            int value = scan.nextInt();
            if (value > gen) System.out.println("Trop grand");
            else if (value<gen) System.out.println("Trop petit;");
            else {
                System.out.println("C'est bon ! Vous avez gagné en " + tries + " tentatives.");
                win = true;
            }
            tries++;
        }
        scan.close();
    }

    static void guess4(){
        boolean break_loop = false;
        Random generer = new Random();
        System.out.println("Je pense à un nombre entre 1 et 100. Devinez lequel. ");
        Scanner scan = new Scanner(System.in);

        while (!break_loop){
            int gen = generer.nextInt(100);
            boolean win = false;
            int tries = 1;
            while(!win){
                System.out.print("Entrez un nombre :");
                int value = scan.nextInt();
                boolean cond = (value>= 0)&&(value<=100);
                if (value > gen && cond) {
                    System.out.println("Trop grand");
                    tries ++;}
                else if (value<gen && cond) {
                    System.out.println("Trop petit;"); 
                    tries ++;
                }
                else if ( value == gen && cond) {
                    System.out.println("C'est bon ! Vous avez gagné en " + tries + " tentatives.");
                    win = true;
                    System.out.println("Rejouer ? (O/N)");
                    String replay =  scan.next().toLowerCase();
                    System.out.println(replay);
                    if (!(replay.equals("o"))) break_loop = true;
                }
                else { 
                    System.out.println("Veuillez entrer un nombre entre 0 et 100.");
                }
            }
        }
        scan.close();
    }

    static void guess6(){
        Random gene = new Random();
        int gen = gene.nextInt(100);
        System.out.println("Je pense à un nombre que j'essaie de deviner.");
        boolean win = false;
        int tries = 1;
        int upperbound = 100;
        int lowerbound = 0;
        while(!win){
            int value = gene.nextInt(upperbound-lowerbound) + lowerbound;
            System.out.println("Je tente : " +value);
            if (value > gen) {upperbound=value;System.out.println("Trop grand.");}
            else if (value<gen) {lowerbound=value;System.out.println("Trop petit.");}
            else {
                System.out.println("J'ai trouvé en " + tries + " tentatives.");
                win = true;
            }
            tries++;
        }
    }

    static void guess7(int tours){
        Random gene = new Random();
        int gen = gene.nextInt(100);
        System.out.println("Je pense à un nombre que j'essaie de deviner.");
        
        int upperbound = 100;
        int lowerbound = 0;
        int i = 0;


        int[] array = new int[tours];
        while (i< tours){
            boolean win = false;
            int tries = 1;
            while(!win){
                int value = gene.nextInt(upperbound-lowerbound) + lowerbound;
                System.out.println("Je tente : " +value);
                tries++;
                if (value > gen) {upperbound=value;System.out.println("Trop grand.");}
                else if (value<gen) {lowerbound=value;System.out.println("Trop petit.");}
                else {
                    System.out.println("J'ai trouvé en " + tries + " tentatives.");
                    win = true;
                }
            }
            array[i]=tries;
            i++;
        }
        double resultat =  0;
        for (int z : array) resultat+=z;
        resultat/=tours;
        System.out.println("En moyenne, sur "+ tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }

    static void guess8(int tours){
        Random gene = new Random();
        int i = 0;
        int[] array = new int[tours];
        boolean bug = false;
        while (i< tours){
            System.out.print(i + " - ");
            boolean win = false;
            int tries = 0;
            int upperbound = 100;
            int lowerbound = 0;
            int gen = gene.nextInt(99)+1;
            double value=50;

            while(!win){
                System.out.print((int)value+ " ");
                tries++;
                if ((int)value > gen) {
                    upperbound = (int)value;
                    value = upperbound-(int)((upperbound-lowerbound)/2);
                }
                else if ((int)value<gen) {
                    lowerbound = (int)value;
                    value = (int)(lowerbound+((upperbound-lowerbound)/2));
                }
                else {
                    win = true;
                }
                if (tries == 15) {bug = true;break;}
            }
            array[i]=tries;

            System.out.println("["+tries+"]");
            i++;
        }
        if (bug) {System.out.println("Il y a eu un bug.");}

        double resultat =  0;
        for (int z : array) resultat+=z;
        resultat/=tours;
        System.out.println("En moyenne, sur "+ tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }

    static void guess9(int tours){
        Random gene = new Random();
        int i = 0;
        int[] array = new int[tours];
        boolean bug = false;
        while (i< tours){
            boolean win = false;
            int tries = 0;
            int upperbound = 100;
            int lowerbound = 0;
            int gen = gene.nextInt(99)+1;
            double value=50;

            while(!win){
                tries++;
                if ((int)value > gen) {
                    upperbound = (int)value;
                    value = upperbound-(int)((upperbound-lowerbound)/2);
                }
                else if ((int)value<gen) {
                    lowerbound = (int)value;
                    value = (int)(lowerbound+((upperbound-lowerbound)/2));
                }
                else {
                    win = true;
                }
                if (tries == 15) {bug = true;break;}
            }
            array[i]=tries;

            i++;
        }
        if (bug) {System.out.println("Il y a eu un bug.");}

        double resultat =  0;
        for (int z : array) resultat+=z;
        resultat/=tours;
        System.out.println("En moyenne, sur "+ tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }
    public static void main(String[] args){
        //guess1();
        //guess2();
        //guess3();
        //guess4();
        //guess6();
        //guess8(50000);
        guess9(1000000);

    }
}
