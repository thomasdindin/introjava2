package com.example;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Random;
import java.util.Scanner;

public class td2 {

    //ex1
    static void demanderEntierEtAfficherParité(int number){
        if (estPair(number)) {
            System.out.println(number + " est pair.");
          }
        else{
            System.out.println(number + " n'est pas pair.");
        }
    }

    //ex2
    static Boolean estPair(int number){
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //ex4
    static void couleur(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Quelle couleur souhaitez-vous ?");
        String colour = scan.nextLine();
        if (colour.equals("r")){
            System.out.println("Rouge");
        }
        else if (colour.equals("b")){
            System.out.println("Bleu");
        }
        else if (colour.equals("v")){
            System.out.println("Vert");
        }
        else {
            System.out.println("Connait pas.");
        }
        scan.close();
    }

    //ex5
    static Boolean estCapitalisé(String word){
        char first = word.charAt(0);
        if (Character.isUpperCase(first)){
            return true;
        }
        else{
            return false;
        }
    }

    //ex6
    static int nbLettres(String phrase){
        int count = 0;
        for (int i= 0; i <= phrase.length()-1; i++){
            if (Character.isLetter(phrase.charAt(i))){
                count++;
            }
        }
        return count;
    }

    //ex7
    static int nbImpairs(int nb1, int nb2, int nb3){
        int count = 0; 

        count= (nb1%2==1) ? count+1 : count;
        count= (nb2%2==1) ? count+1 : count;
        count= (nb3%2==1) ? count+1 : count;

        return count;
    }
    //ex8
    static int nbJoursDuMois(int mois){
        YearMonth date = YearMonth.of(2021,mois);
        return date.lengthOfMonth();
    }

    //ex9
    static Boolean estBissextile(int year){
        if (year % 400 == 0){
            return true;
        }
        else if (year%100 == 0){
            return false;
        }
        else if (year%4== 0){
            return true;
        }
        else {
            return false;
        }
    }

    //ex10
    static int nbJoursDuMois2(int mois, int year){
        if (mois == 2){
            if (estBissextile(year)){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            return nbJoursDuMois(mois);
        }
    }

    //ex11
    static int nbJoursDuMois3(int mois, int year){
        YearMonth date = YearMonth.of(year,mois);
        return date.lengthOfMonth();
    }

    //ex12
    static String sommePairsEtMax(Scanner scan){
        int max = 0;
        int somme = 0;
        System.out.print("Combien d'entiers : ");
        int length = scan.nextInt();

        for (int i=0; i <= length-1; i++){
            System.out.print("Entrez un entier : ");
            int current = scan.nextInt();
            if (current > max){
                max = current;
            }
            if (current %2 == 0){
                somme += current;
            }
        }
        scan.close();
        return "Somme des nombres pairs = " + somme + ", plus grand nombre = " + max;
    }

    //ex13
    static Boolean deuxSens(String s){
        int end = s.length()-1;
        String res = "";
        for (int i=0; i<s.length();i++){
            res = res + s.charAt(end);
            end -=1;
        }
        if (res.toLowerCase().equals(s.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
    }

    //ex14
    static String stringStripper(String s){
        String res="";
        for (int i=0; i<s.length();i++){
            char current = s.charAt(i);
            if (Character.isLetter(current)){
                res = res + Character.toLowerCase(current);
            }
        }
        return res.toLowerCase();
    }

    static Boolean deuxSens2(String s){
        int end = s.length()-1;
        String res = "";
        for (int i=0; i<s.length();i++){
            char current = s.charAt(end);
            if (Character.isLetter(current)){
                res = res + Character.toLowerCase(current);
            }
            end -=1;
        }
        System.out.println(res);
        if (res.toLowerCase().equals(stringStripper(s))){
            return true;
        }
        else{
            return false;
        }
    }

    //ex15
    static int nbMots(String s){
        int res= 0;
        if (Character.isLetter(s.charAt(0))){
            res++;
        }
        Boolean is_letter = true;
        for (int i=0; i<s.length();i++){
            char current = s.charAt(i);
            if (Character.isLetter(current) && is_letter == false)  {
                res++;
                is_letter = true;
            }
            if (Character.isLetter(current)==false && is_letter == true){
                is_letter = false;
            }
        }

        return res;
    }

    //ex16
    static void anniversaire(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Mois de naissance : ");
        int month = scan.nextInt();
        System.out.print("Jour de naissance : ");
        int days = scan.nextInt();
        LocalDate now = LocalDate.now();
        LocalDate birthday =LocalDate.of(2023, month, days);
        long dodos = now.until(birthday, ChronoUnit.DAYS);

        System.out.println("Il reste "+ dodos + " dodos jusqu'à votre anniversaire.");
        scan.close();

    }

    //ex17
    static String chiffrer(String message, int cle){
        String res ="";
        for (int i=0; i<message.length();i++){
            if (Character.isLetter(message.charAt(i))){
                int as_ch=Character.toLowerCase(message.charAt(i));
                char nouveau = ((int)as_ch+cle < 123) ? (char)((int)as_ch + cle): (char)((int)(as_ch+cle)%123+97);
                res += Character.toUpperCase(nouveau);
            }
            else{
                res+=Character.toUpperCase(message.charAt(i));
            }
        }

        return res;
    }

    //ex18
    static String dechiffrer(String message, int cle){
        String res ="";
        for (int i=0; i<message.length();i++){
            if (Character.isLetter(message.charAt(i))){
                int as_ch=Character.toLowerCase(message.charAt(i));
                char nouveau = ((int)as_ch-cle > 96) ? (char)((int)as_ch - cle): (char)((int)(122-(96-((int)as_ch-cle))));
                res += Character.toUpperCase(nouveau);
            }
            else{
                res+=Character.toUpperCase(message.charAt(i));
            }
        }

        return res;
    }
    //ex19
    static void guess(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez votre choix : ");
        int guess = scan.nextInt();
        int value = new Random().nextInt(101);
        scan.close();

        if(value == guess){
            System.out.println("Quel bol, vous avez trouvé !");
        }
        else if (value > guess){
            System.out.println("Perdu ! Il vous manquait " + (value - guess));
        }
        else if (value < guess){
            System.out.println("Perdu ! Vous avez dépassé de " + (guess-value));
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        //phrase();
        //demanderEntierEtAfficherParité(13);
        //couleur();
        //System.out.print(estCapitalisé("bonjour"));
        //System.out.println(ex26("Salut a toi, l'Espagnol !"));
        //System.out.println(nbImpairs(3, 15, 13));
        //System.out.println(nbJoursDuMois(1));
        //System.out.println(estBissextile(2400));
        //System.out.println(nbJoursDuMois2(2,2010));
        //System.out.println(nbJoursDuMois3(2, 2019));

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println(sommePairsEtMax(scan));
        */

        //System.out.println(deuxSens2("Éric notre valet alla te laver ton ciré"));
        //System.out.println(nbMots("Bonjour tout le monde"));
        //anniversaire();
        //System.out.println(chiffrer("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 11));
        //System.out.println(dechiffrer("LMNOPQRSTUVWXYZABCDEFGHIJK", 11));
        //guess();
    }
}
