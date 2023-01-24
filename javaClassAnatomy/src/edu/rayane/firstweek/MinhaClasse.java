package edu.rayane.firstweek;
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String firstName =  "Rayane";
        String secondName = "France";

        String completeName = completeName(firstName, secondName);

        System.out.print(completeName);

    }

    public static String completeName (String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
        
    }
}
