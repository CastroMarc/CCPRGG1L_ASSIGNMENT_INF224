import java.util.Scanner;

public class assignment2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Act 1 - Print FIRST NAME 3 times using while loop

        int count = 0;
        
        while (count != 3) {
            System.out.println("MARC");
            count++;
        }
        
        System.out.println();
        int count2 = 0;
        // Act 2 - Print MIDDLE NAME 4 times using Do-While loop
 
        do {
            System.out.println("APOSTOL");
            count2 ++;
        } while (count2 != 4);

        System.out.println();

        // Act 3 - Print SURNAME 5 times using for loop
        
        for (int count3 = 0; count3 !=5 ; count3++) {
            
            System.out.println("CASTRO");
        }

        
        System.out.println();

        // Act 4 - Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)

        char[] initial = {'M','A','R','C'};

        /* 
        for (char x: initial){
            System.out.print(x);
        }

        //or 
        */
        System.out.println();

        for (int x = 0; x < initial.length; x++) {
            System.out.print(initial[x]);
        }

        System.out.println();

        // Act 5 - char array REVERSE First Name
        
        char[] ini = {'M','A','R','C'};

        for (int x = ini.length - 1; x >= 0; x--) {
            System.out.print(ini[x]);
        }
        

        // Close Scanner
        scan.close();
    }
}
