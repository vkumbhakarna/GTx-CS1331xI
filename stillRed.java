
import java.util.Arrays;

public class stillRed {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
		for (int r=0; r<8 ; r++){
			for (int c=0; c<8; c++){
				if (r==0) {
					board[r][c] = "red";
				}
				else if (r==7){
					board[r][c] = "black";
				}
				
				System.out.println("row =" + r + " col = " + c  + " " + board[r][c]);			
			}
		}
		
		System.out.println(stillRed(board));
		
    }	
public static boolean stillRed(String[][] board) {
	for (int r = 0; r < 8; r++) {
		for (int c = 0; c < 8; c++) {
			if (board[r][c] != null && board[r][c].equals("red")) {
				return true;
			}
		}
	}
	return false;
}
}

