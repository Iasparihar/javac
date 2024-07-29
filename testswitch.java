import java.util.Scanner;

public class testswitch {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day name (1-7):");

    String lunch= scanner.next().toLowerCase();

    switch(lunch) {

    case "monday":
    System.out.println ("Ladyfinger");
    break;

    case "tuesday":
    System.out.println ("Cauliflower");
    
    break;
    
    case "wednesday":
    System.out.println ("bringal");
    
    break;

    case "thursday":
    System.out.println ("Mataraaloo");
    
    break;

    case "friday":
    System.out.println ("fast");
    break;

    case "saturday":
    System.out.println ("Soyachunks");
    break;

    case "sunday":
    System.out.println ("paneer");
    break;

    default:
    System.out.println ("Please enter the correct day");
    break;
}
}
}


