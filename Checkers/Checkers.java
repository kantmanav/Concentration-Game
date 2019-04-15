/**
 * Write a description of class Checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checkers {
    public static void main(String [] args) {
        
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        checkerBoard[i][j] = "BLACK";
                    }
                }
                else if (i % 1 == 0) {
                    if (j % 2 == 0) {
                        checkerBoard[i][j] = "BLACK";
                    }
                }
            }
        }

        for (int i = 7; i > 4; i--) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        checkerBoard[i][j] = "WHITE";
                    }
                }
                else if (i % 1 == 0) {
                    if (j % 2 == 0) {
                        checkerBoard[i][j] = "WHITE";
                    }
                }
            }
        }
        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < checkerBoard[0].length; j++) {
                if (j != checkerBoard.length - 1) {
                    System.out.print(checkerBoard[i][j] + "\t");
                }
                else if (j == checkerBoard.length - 1) {
                    System.out.println(checkerBoard[i][j]);
                }
            }
        }
        System.out.println("");
    }
}