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
                        if (GivenLine.equals("")){
                            Hedgehog emptySpeak = new Hedgehog();
                            String emptyLine = emptySpeak.emptyLine("Olen ", " ja ikäni on vuotta ", " mutta antaisitko silti syötteen?");
                            System.out.println(emptyLine);
                        } else { 
                        Hedgehog line = new Hedgehog();
                        String speaking = line.Line(GivenLine);
                        System.out.println(speaking);
                        }
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String givenName = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String givenAge = sc.nextLine();
                        int NewAge = Integer.parseInt(givenAge);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String loopAmount = sc.nextLine();
                        int loops = Integer.parseInt(loopAmount);
                        Hedgehog loop = new Hedgehog();
                        String Name = loop.Loops();
                        for(int i = 1; i<= loops; i++){
                           System.out.println(Name+ " juoksee kovaa vauhtia!");
                        }
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
        }
    sc.close();
    }
}

