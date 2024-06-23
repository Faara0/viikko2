package main;

import java.util.Scanner;

//Otin mallia 2. viikon lähdemateriaalista valikon luomiseen ja scannerin lyhentämisen sen uudellen käyttöä varten 
public class App {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){ 
            System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );
            if(sc.hasNext()){
                int choise = 0;
                String StringInput = sc.nextLine();
                choise = Integer.parseInt(StringInput);           
                switch(choise) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String GivenLine = sc.nextLine();
                        Hedgehog h = new Hedgehog();
                        String speaking = h.line(GivenLine);
                        System.out.println(speaking);
                        break;
                    case 2:
                        System.out.println("Uusi siili");
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default: 
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        //System.out.println("Olen <siilin nimi> ja ikäni on <siili ikä>, mutta antaisitko silti syötteen?")   
        }
    sc.close();
    }
}

