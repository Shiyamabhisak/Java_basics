package ToDo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Operations that can be done in TO-DO list: ");
        boolean flag = true,firstTime = true;
        while(flag) {
            if(!firstTime){
                System.out.println("Press any button to continue or type 'exit' to quit");
                String toContinue = sc.nextLine();
                if(toContinue.equalsIgnoreCase("exit")){
                    flag = false;
                    break;
                }
            }
            else{
                firstTime = false;
            }
            System.out.println("Press 1 to Create a new Entry.");
            System.out.println("Press 2 to Update an entry the List.");
            System.out.println("Press 3 to Delete an entry the List.");
            System.out.println("Press 4 to Display the whole List of Students.");
            String operation = sc.nextLine();

            switch (operation){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:

            }
        }

    }
}

class Student{
    int id;
    String name;
    int rollNo;
    Department dept;
}

enum Department{
    CSE,IT,EEE,ECE,MECH,MCT,ICE
}