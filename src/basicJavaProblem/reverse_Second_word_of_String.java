package basicJavaProblem;

public class reverse_Second_word_of_String {
    public static String reversesecondword(String str,int ind){
       String [] words = str.split(" ");
       if(words.length<2){
           return str;
       }
       String secondWord = words[ind];
       String reverseSecondWord = new StringBuilder(secondWord).reverse().toString();
       words[ind]=reverseSecondWord;
       return String.join(" ",words);
    }
}

