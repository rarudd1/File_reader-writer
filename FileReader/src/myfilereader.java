import java.io.*;

public class myfilereader {

	public static void main(String[] args) {
	
		int i;
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if(args.length != 2)
		{
			System.out.println("Usage: Show File FIle.");
		}
		
		try {
			fin = new FileInputStream(args [0]);
			fout = new FileOutputStream(args[1]);
		}
		catch(FileNotFoundException exc)
		{
			System.out.println("File Not Found");
			return;
		}
		
		try {
			do {
				i= fin.read();
				if(i!= -1) 
					{
					if((char)i == ' ')
					{
						i = 45;	
					}
					fout.write(i);
					
					}
					}while(i != -1);
		}catch(IOException exc)
		{
			System.out.println("Error reading file.");
		}
		finally
		{
		try {
			if(fin != null)
			fin.close();
		}catch(IOException exc)
		{
			System.out.println("Error Closing File");
		}
		try {
			if(fout !=null) fout.close();
		}catch(IOException exc)
		{
			System.out.println("Error Cloring OUtput File");
		}
		}
	}

}
