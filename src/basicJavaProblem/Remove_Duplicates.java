package basicJavaProblem;

import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static String removedups(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch :str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
