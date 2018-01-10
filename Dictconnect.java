import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;
public class Dictconnect {
	InputForm in=new InputForm();
	public static void setup(){
		
		//HashSet<String> dictionary = null;
		HashSet<String> dictionary = new HashSet<String>();
		try{
			BufferedReader bufferedReader= new BufferedReader (new FileReader("el_GR.dic"));
		 String line= null;
			while ((line=bufferedReader.readLine())!=(null)){
				dictionary.add(line);
			}
				bufferedReader.close();
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
		System.out.println(dictionary);

	 //public static void checker(String[] strs,HashSet<String> dicitonary)
	 int i=0;
	 while (strs[i].hasNext=true) {
		 if (dictionary.contains(strs[i]))=false {
			 System.out.println(strs[i]);
		 }
	 }
}
