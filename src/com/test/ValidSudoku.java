package com.test;

public class ValidSudoku {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ValidSudoku vs = new ValidSudoku();

		char[][] b = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(vs.isValidSudoku(b));

	}

	public boolean isValidSudoku(char[][] board) {
		
		String validNum="123456789";
		
		if(board.length>9)
		{
			return false;
		}
		
		
		for(int i=0;i<board[i].length;i++)
		{
			if(board[i].length == 9)
			{
			for(int j=0;j<board[j].length;j++)
			{
				if(validNum.indexOf(board[i][j])!=-1||board[i][j]=='.')
				{
				 return true;
				}
				else
					System.out.println("not in range of 1-9 or .");
					return false;
			}
			}
			else
				System.out.println("number of rows are more than 9");
				return false;
		}

		return true;

	}

}
