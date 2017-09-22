package class_method;


import java.io.*;
import java.util.*;

public class PE10 {
	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr=new FileReader("src/File.txt");
			BufferedReader br=new BufferedReader(fr);
			String str="",str1;
			while((str1=br.readLine()) != null)
			{
				
				str+=str1;
				str+=" ";
				
					
			}
			
			 List<String> list = Arrays.asList(str.split(" "));
	            Set<String> words = new HashSet<String>(list);
	            for (String word : words) {
	                    System.out.println(word+"-"+Collections.frequency(list, word));
	                }
			
			
//			String cur_line;
//			String Filename="src/File.txt";
//			HashMap<String,Integer> map=countWords(Filename);
//			
//			
//			    Iterator it = map.entrySet().iterator();
//			    while (it.hasNext()) {
//			        Map.Entry pair = (Map.Entry)it.next();
//			        System.out.println(pair.getKey() + " = " + pair.getValue());
//			        it.remove(); // avoids a ConcurrentModificationException
//			    }
			
		}
		catch (FileNotFoundException e) {
			  System.err.println("File not found.");
			}
	
		
	}
	public static HashMap<String, Integer> countWords(String file) {
		HashMap<String, Integer> wordCount = new HashMap();
		try {
		  FileReader reader = new FileReader(file);
		  BufferedReader br = new BufferedReader(reader);
		  // The BufferedReader reads the lines
		  String line;
		 while((line=br.readLine())!=null) {
		  String[] words = line.split(" ");
		  for (int i = 0; i < words.length; i++) {

		    if (wordCount.containsKey(words[i])) {  
		      wordCount.put(words[i], wordCount.get(words[i])+1);
		    }
		    else {
		      wordCount.put(words[i], 1);
		    }
		  }}
		}
		catch (FileNotFoundException fnfe) {
		  System.err.println("File not found.");
		}
		catch (Exception e) {
		  System.err.print(e);
		   }
	
		return wordCount;
		}
}
