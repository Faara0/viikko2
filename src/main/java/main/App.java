package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args) {
        int i = 0; //user gives input which action they want
        do {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
                Scanner bufferedScanner = new Scanner(System.in);
                    String input = bufferedScanner.nextLine();
                    i = Integer.parseInt(input);
                    if(i == 1) {
                        System.out.println("Mitä siili sanoo: ");
                        Scanner SpeakScanner = new Scanner(System.in);
                        String speak = SpeakScanner.nextLine();
                        Hedgehog siili = new Hedgehog();
                        String speaking = siili.speak(speak);
                        System.out.println(speaking);
                    }
                    else if(i == 2) {
                        System.out.println("Valinta 2 toimii.");
                        //break;
                    }
                    else if(i == 3) {
                        System.out.println("Valinta 3 toimii.");
                        //break;
                    }
                    else if(i == 0) {
                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;
                    }
                    else {
                        System.out.println("Syöte oli väärä");
                    }    
        } while(i > 0);     
    }
}
