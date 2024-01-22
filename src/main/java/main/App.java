package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
            
                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo: ");
                        String speak = sc.nextLine();
                        Hedgehog siili = new Hedgehog();
                        String speaking = siili.speak(speak);
                        System.out.println(speaking);
                        break;
                    case 2:
                       System.out.println("Valinta 2 toimii.");
                       break;
                    case 3:
                        System.out.println("Valinta 3 toimii.");
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
