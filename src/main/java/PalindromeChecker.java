import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String a = new String("");
  word = word.replaceAll(" ","");
  word = word.replaceAll(".","");
  word = word.toLowerCase();
  for(int i = 0; i<word.length(); i++){
    a=a+word.substring(word.length()-i-1,word.length()-i);
  }
  if(a.equals(word)){
  return true;}
  return false;
}
public String reverse(String str)
{
    String sNew = new String();
    str = str.replaceAll(" ","");
    str = str.toLowerCase();
    str = str.replaceAll(".","");
    for(int i = 0; i<str.length(); i++){
      sNew=sNew+str.substring(str.length()-i-1,str.length()-i);
    }
    return sNew;
}
}
