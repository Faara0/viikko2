package main;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args) {
        System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            System.out.print("Anna numero: ");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()){
                int i = 0; //user gives input which action they want
                String input = sc.nextLine();
                i = Integer.parseInt(input);
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
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                }
            }
    sc.close();    
    }
}
