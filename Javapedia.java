import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        // prompts user to determine how many entries they would like to enter
        int entries = scan.nextInt(); scan.nextLine(); 
        
        // creates a 2D array using amount of entries as first index         
        String[][] database = new String[entries][3]; 

        // for loop that saves inputs to array values 
        for (int i = 0; i < database.length; i++) { 
           
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine(); 

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine(); 

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine(); 

            System.out.print("\n");

        }




        System.out.println("These are the values you stored:"); 
        
        // calls print2DArray function to display user entries 
        print2DArray(database);

        // lets user search database by name
        System.out.print("\nWho do you want information on? ");  
        String name = scan.nextLine(); 
        
        // checks if there's a match and returns information 
        for (int i = 0; i < database.length; i++) { 
            if(database[i][0].equalsIgnoreCase(name)) { 
                System.out.print("\n\tName: " + database[i][0] + "\n");
                System.out.print("\tData of birth: " + database[i][1] + "\n");
                System.out.print("\tOccupation: " + database[i][2] + "\n");
            }
        }

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * prints user data neatly formatted
     */
    public static void print2DArray(String[][] array) { 
        for (int i = 0; i < array.length; i++) { 
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
