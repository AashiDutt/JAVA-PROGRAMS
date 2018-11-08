// this code is a new way to implement inner classes
// it responds to click of the key

package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);  // using scanner
    private static Button btnPrint = new Button("Print"); // using Button

    public static void main(String[] args) {
        class  ClickListener implements Button.OnClickListener{   // implementing interface in class
            public ClickListener(){   // default constructor
                System.out.println("I've Been Attached");

            }
            public void onClick(String title){      // prints when a key is pressed in this case '1'
                System.out.println(title + " was clicked ");
            }
        }
        btnPrint.setonClickListener(new ClickListener());
        listen();
    }
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();  // inputs next key
            scanner.nextLine();
            switch(choice){
                case 0:  // if input = 0  then terminate code
                    quit = true;
                    System.out.println("Terminated");
                    break;
                case 1: // if input = 1 use print command defined in onClick() method
                    btnPrint.onClick();

            }
        }
    }
}
