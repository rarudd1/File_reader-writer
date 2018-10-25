
import java.io.*;
public class mycharfilereader {
	public static void main(String args[])
	throws IOException
	{
		String s;
		
		try(BufferedReader br = new BufferedReader(new FileReader("thisfile.txt")); FileWriter fw 
				= new FileWriter("thisfileoutput.txt"))
		{
			while((s= br.readLine())!= null)
				{
				String[] words = s.split(" ");
				for(int i =0; i<words.length; i++)
				{
					if(i != (words.length -1))
						fw.write(words[i] +"-");
					else
					{
						//words[i].append(line);
						fw.write(words[i]+"\r\n");
					}
				}
				}
		}catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}

}
