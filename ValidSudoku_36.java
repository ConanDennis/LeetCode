package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku_36 {
	public static void main(String[] args){
		char[][] board = {
			{'.','4','.' , '.','.','.' , '.','.','.'},
			{'.','.','4' , '.','.','.' , '.','.','.'},
			{'.','.','.' , '1','.','.' , '7','.','.'},
			
			{'.','.','.' , '.','.','.' , '.','.','.'},
			{'.','.','.' , '3','.','.' , '.','6','.'},
			{'.','.','.' , '.','.','6' , '.','9','.'},
			
			{'.','.','.' , '.','1','.' , '.','.','.'},
			{'.','.','.' , '.','.','.' , '2','.','.'},
			{'.','.','.' , '8','.','.' , '.','.','.'}
		};
		
		System.out.println(isValidSudoku(board));
		
	}
	public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            List<Character> list1 = new ArrayList<Character>();
            List<Character> list2 = new ArrayList<Character>();
            for(int j = 0 ; j < board.length; j++){
                if( (!list1.contains(board[i][j])) && board[i][j]!='.')
                    list1.add(board[i][j]);
                else if(list1.contains(board[i][j]))
                    return false;
                    
                if( (!list2.contains(board[j][i])) && board[j][i]!='.')
                    list2.add(board[j][i]);
                else if(list2.contains(board[j][i]))
                    return false;
            }
        }
        
        List<Character> list3 = new ArrayList<Character>();
        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                if( (!list3.contains(board[i][j])) && board[i][j]!='.')
                    list3.add(board[i][j]);
                else if(list3.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list4 = new ArrayList<Character>();
        for(int i = 0; i < 3; i++){
            for(int j = 3 ; j < 6; j++){
                if( (!list4.contains(board[i][j])) && board[i][j]!='.')
                    list4.add(board[i][j]);
                else if(list4.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list5 = new ArrayList<Character>();
        for(int i = 0; i < 3; i++){
            for(int j = 6 ; j < 9; j++){
                if( (!list5.contains(board[i][j])) && board[i][j]!='.')
                    list5.add(board[i][j]);
                else if(list5.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list6 = new ArrayList<Character>();
        for(int i = 3; i < 6; i++){
            for(int j = 0 ; j < 3; j++){
                if( (!list6.contains(board[i][j])) && board[i][j]!='.')
                    list6.add(board[i][j]);
                else if(list6.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list7 = new ArrayList<Character>();
        for(int i = 3; i < 6; i++){
            for(int j = 3 ; j < 6; j++){
                if( (!list7.contains(board[i][j])) && board[i][j]!='.')
                    list7.add(board[i][j]);
                else if(list7.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list8 = new ArrayList<Character>();
        for(int i = 3; i < 6; i++){
            for(int j = 6 ; j < 9; j++){
                if( (!list8.contains(board[i][j])) && board[i][j]!='.')
                    list8.add(board[i][j]);
                else if(list8.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list9 = new ArrayList<Character>();
        for(int i = 6; i < 9; i++){
            for(int j = 0 ; j < 3; j++){
                if( (!list9.contains(board[i][j])) && board[i][j]!='.')
                    list9.add(board[i][j]);
                else if(list9.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list10 = new ArrayList<Character>();
        for(int i = 6; i < 9; i++){
            for(int j = 3 ; j < 6; j++){
                if( (!list10.contains(board[i][j])) && board[i][j]!='.')
                    list10.add(board[i][j]);
                else if(list10.contains(board[i][j]))
                    return false;
            }
            
        }
        List<Character> list11 = new ArrayList<Character>();
        for(int i = 6; i < 9; i++){
            for(int j = 6 ; j < 9; j++){
                if( (!list11.contains(board[i][j])) && board[i][j]!='.')
                    list11.add(board[i][j]);
                else if(list11.contains(board[i][j]))
                    return false;
            }
            
        }
        
        return true;
        

    }
}
