import java.util.Scanner; //class that allows us to scan/read input from the user

public class Main {
    public static void main(String[] args){


        //object that will be used for scanning
        Scanner scanner = new Scanner(System.in);

        //**D1** - declarations
        char[] corrects = new char[30];
        char[][] answers = new char[100][30];
        String[] names = new String[100];
        int[] grades = new int[100];

        //**D2** user input in order to fill the arrays

        //a)
        for (int i = 0; i < corrects.length; i++) {
            System.out.print("Enter the correct answer of the question " + (i + 1) + ": ");
            corrects[i] = scanner.nextLine().toUpperCase().charAt(0); //write the correct answer that user types into the i index of corrects
        }                                                             //and turning it into upper case letter for safety

        //b)
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        //c)
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) { //nested loop to access the whole 2D array
                System.out.print("Enter answer of " + names[i] + " for the question " + (j + 1) + ": ");
                char ans = scanner.nextLine().toUpperCase().charAt(0);
                while (ans != 'A' && ans != 'B' && ans != 'C') { //checking if answer doesn't belong to {A,B,C} so as to the user tries again
                    System.out.print("Invalid. Try again (A, B, or C): ");
                    ans = scanner.nextLine().toUpperCase().charAt(0);
                }
                answers[i][j] = ans;
            }
        }


        //**D3** grade calculating
        for (int i = 0; i < names.length; i++){
            grades[i] = score(answers, corrects, i); //calling the score method
        }

        //D4 sort
        //using the bubblesort method
        for (int i = 0; i < names.length ; i++){
            for (int j = names.length - 1; j > 1 ; j--){
                if (grades[j] > grades[j-1]){
                    //swap grades
                    int temp1 = grades[j];
                    grades[j] = grades[j-1];
                    grades[j-1] = temp1;
                    //swap names
                    String temp2 = names[j];
                    names[j] = names[j-1];
                    names[j-1] = temp2;
                }
            }
        }

        System.out.println("The 10 students with the highest points: ");

        //final output
        int min = grades[10] , i = 0;
        while (true){
            if (grades[i] >= min){
                System.out.println(names[i] + " (" + grades[i] + " points) " );
            } else break;
            i++;
        }


        scanner.close();

    }

    //D5 function
    static int score(char[][] answers, char[] corrects,int i){
        int points = 0;
        for (int j = 0; j < corrects.length ; j++){
            if (answers[i][j] == corrects[j]){
                points += 2;
            }
        }
        return points;
    }
}
