package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomExceptions {
	public class IncorrectFilenameException extends Exception{
		String filename;
		
		private static final long serialVersionUID = 1L;

		public IncorrectFilenameException(String errMsg, Throwable err)
		{
			super(errMsg, err);
		}
		
	
		public String updateFile() throws IncorrectFilenameException
		{
		try (Scanner file= new Scanner(new File(filename)))
		{
			if(file.hasNextLine())
			return file.nextLine();
		}
		catch (FileNotFoundException ex)
		{
			if(!IncorrectFilename(filename))
			{
				throw new IncorrectFilenameException("Incorrect filename"+ filename , ex);
			}
		}
		return filename;
		}
		
		
		private boolean IncorrectFilename(String filename2) {
			// TODO Auto-generated method stub
			
			return filename.equals(filename2);
			 
		}
	}
	
	public static void main(String[] s)
	{
		
		
		
	}

}


