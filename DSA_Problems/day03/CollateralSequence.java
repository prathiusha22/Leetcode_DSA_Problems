package day03;

public class CollateralSequence {

    public static char checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 'X') {
                    return 'X';
                } else if (board[i][0] == 'O') {
                    return 'O';
                }
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                if (board[0][j] == 'X') {
                    return 'X';
                } else if (board[0][j] == 'O') {
                    return 'O';
                }
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'X') {
                return 'X';
            } else if (board[0][0] == 'O') {
                return 'O';
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 'X') {
                return 'X';
            } else if (board[0][2] == 'O') {
                return 'O';
            }
        }

        return '-';
        
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };

        char winner = checkWinner(board);

        if (winner != '-') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}