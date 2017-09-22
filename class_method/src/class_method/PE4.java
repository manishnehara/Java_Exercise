package class_method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PE4 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("src/File.txt");
			BufferedReader br=new BufferedReader(fr);
			String cur_line;
			int i,count=0;
			while((i=fr.read())!=-1)
			{	char c=(char)i;
				System.out.print(Character.toUpperCase(c) );
				if(c=='\n')
					count++;
			}
			File f=new File("src/File.txt");
			System.out.println("Number of lines : "+count);
			System.out.println((double)f.length()/1024+" MB");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
