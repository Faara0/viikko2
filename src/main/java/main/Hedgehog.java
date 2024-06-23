package main;

public class Hedgehog {

    public int age = 5;
    public String Name = "Pikseli";
    
    String Line(String Line){
        return Name + ": " + Line;
    }
    String emptyLine(String line1, String line2, String line3) {
        return line1 + Name + line2 +  age + line3; 
    }

    String Loops(){
        return Name;
    }
}

