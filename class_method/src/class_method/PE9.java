package class_method;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PE9 {

	public static void main(String[] args) throws IOException {
		File folder = new File("/home/manish/Desktop/Java/class_method/src");
		File[] listOfFiles = folder.listFiles();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter extension of file (print this file) : ");
		String ext=sc.next();
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	  System.out.println("File : " + listOfFiles[i].getName());
		    	  String fname=listOfFiles[i].getName();
		    	  	int index=fname.indexOf('.');
		    		  int length=fname.length();
		    		  String substr=fname.substring(index+1,length);
		    		  System.out.print(substr);
		    		  if(substr.matches(ext))
		    		  {
		    			  String fpath=listOfFiles[i].getPath();
				    	  Path path=Paths.get(fpath);
				    	  byte[] data =  Files.readAllBytes(path);
//				    	  byte[] array = Files.readAllBytes(new File("/path/to/file").toPath());
				    	  for(int j=0;j<data.length;j++)
				    	  System.out.print((char)data[j]);
				    	  System.out.println();
		    		  }
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory :" + listOfFiles[i].getName());
		      }
		    }

	}

}
