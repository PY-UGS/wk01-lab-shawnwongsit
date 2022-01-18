import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Example 1
        Scanner nameObj = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = nameObj.nextLine();
        System.out.println("Hello, I am " + name + "!\n");

        //Example 3
        Scanner moduleObj = new Scanner(System.in);
        System.out.println("Enter module code: ");

        String moduleCode = moduleObj.nextLine();
        switch(moduleCode.toUpperCase()){
            case "CSC1006":
            System.out.println("Mathematics II");
            break;
            case "CSC1007":
            System.out.println("Operating Systems");
            break;
            case "CSC1008":
            System.out.println("Data Structures and Algorithms");
            break;
            case "CSC1009":
            System.out.println("Object Oriented Programming");
            break;
            case "CSC1010":
            System.out.println("Computer Networks");
            break;
            default:
            System.out.println("Please enter a valid module code");
            break;
        }

        System.out.println();

        //Example 4
        for(int x = 102; x >= 66; x--){
            if(x % 2 != 0){
                System.out.println("Value of x is " + x);
            }  
        }

    }
}
