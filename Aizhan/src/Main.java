import javafx.util.Pair;
import java.util.Scanner;
public class Main {

    static final String enterMove = "Player '%s', enter your move (row[1-3] column[1-3]):";

    static final String won = "Player '%s' won!";
    static String grid[][] = new String[4][4];

    public static void main(String[] args) {

        char move = 'X';
        for(int i = 0; i <= 3; ++i) {
            for(int j = 0; j <= 3; ++j) {
                grid[i][j] = "   ";
            }
        }
        while (true) {
            char cur = check(grid);
            if (cur != ' ') {
                System.out.print(String.format(won, cur));
                break;
            }

            Pair <Integer, Integer> newMove = readMove(move);

            move(newMove.getKey(), newMove.getValue(), move);

            printGrid(grid);


            if (move == 'X') move = 'O';
            else move = 'X';
        }


    }

    /*static Pair<Integer, Integer> readMove(char ch) {
        System.out.print(String.format(enterMove, ch));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = Integer.parseInt(s.split(" ")[0]);
        int y = Integer.parseInt(s.split( " ")[1]);

        while((x>3 || y>3 || x<1 || y<1)) {
        	System.out.println(String.format("This move at (%s,%s) is not valid. Try again...", x, y));
            System.out.print(String.format(enterMove, ch));
            s = sc.nextLine();
            x = Integer.parseInt(s.split(" ")[0]);
            y = Integer.parseInt(s.split( " ")[1]);
        }
        
        while (!grid[x][y].equals("   ")) {
            System.out.println(String.format("This move at (%s,%s) is not valid. Try again...", x, y));
            System.out.print(String.format(enterMove, ch));
            s = sc.nextLine();
            x = Integer.parseInt(s.split(" ")[0]);
            y = Integer.parseInt(s.split( " ")[1]);
        }
        return new Pair<>(x, y);
    }*/
    
    static Pair<Integer, Integer> readMove(char ch) {
        System.out.println(String.format(enterMove, ch));
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(getInput(sc,"Enter row: "));
        int y = Integer.parseInt(getInput(sc,"Enter column: "));

        while((x>3 || y>3 || x<1 || y<1)) {
        	System.out.println(String.format("This move at (%s,%s) is not valid. Try again...", x, y));
            System.out.print(String.format(enterMove, ch));
            sc = new Scanner(System.in);
            x = Integer.parseInt(getInput(sc,"Enter row: "));
            y = Integer.parseInt(getInput(sc,"Enter column: "));
        }
        
        while (!grid[x][y].equals("   ")) {
            System.out.println(String.format("This move at (%s,%s) is not valid. Try again...", x, y));
            System.out.print(String.format(enterMove, ch));
            sc = new Scanner(System.in);
            x = Integer.parseInt(getInput(sc,"Enter row: "));
            y = Integer.parseInt(getInput(sc,"Enter column: "));
        }
        return new Pair<>(x, y);
    }
    
    public static String getInput(Scanner in, String prompt) { // Get valid user input
        System.out.print(prompt); // Tell user what to input
        String text = "";
        while (true) { // Keep looping until valid input is found
            text = in.nextLine(); // Get input from stdin
            if(isInteger(text)) // Check if they put in integer
                break; // Exit loop
            System.out.print("Try again, " + prompt); // Wasn't valid, prompt again
        } 
        return text; // Return valid user input
    }

    private static boolean isInteger(String str) { // Check if string is integer
        try {
            Integer.parseInt(str); // If this doesn't fail then it's integer
            return true;
        } catch(NumberFormatException e) {
            return false; // Wasn't integer
        }
    }

    static boolean move(int x, int y, char ch) {
        if (grid[x][y].equals("   ")) {
            grid[x][y] = " " + ch + " ";
            return true;
        }
        return false;
    }



    static char check(String grid[][]) {
        int cnt[][][] = new int[10][4][2];
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j) {
                if (grid[i][j].equals("   ")) continue;
                int id = 0;
                if (grid[i][j].equals(" O ")) id = 1;
                cnt[i][0][id]++;
                cnt[j][1][id]++;
                cnt[i - j + 3][2][id]++;
                cnt[i + j][3][id]++;
            }
        }
        for(int i = 0; i < 2; ++i) {
            for(int k = 0; k < 4; ++k) {
                for (int j = 0; j < 10; ++j) {
                    if (cnt[j][k][i] == 3) {
                        if (i == 0) return 'X';
                        return 'O';
                    }
                }
            }
        }
        return ' ';
    }

    static void printGrid(String grid[][]) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; ++j) {
                System.out.print(grid[i][j]);
                if (j != 3) System.out.print('|');
            }
            System.out.println();
            if (i != 3) System.out.println("-----------");
        }
    }

}
