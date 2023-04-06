package my_util;

public class StringUtil {
    /**
 This method made by Loopcamp Batch#1
 The method accepts a String and returns the reversed String
 */
public static String reverseStr (String str) {

    String reversed = "";
    for (int i = str.length()-1; i >= 0; i--) {
        reversed += str.charAt(i);
    }
    return reversed;

}
    /**
     This method made by Loopcamp Batch#1
     The method accepts a String parameter and puts it in a format
     ex:
     The format will be like this

     First letter is in upper case and rest in lower case

     Then return a String in a formatted way.
     */

    public static String fixFormat (String str){
        String fixed = str.trim();
         fixed = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        return fixed;
    }

    /**
    This method will accept a String with multiple words
     And convert to camelCase String
     */
   public static String camelCase (String str){
       String [] arr = str.split(" ");
       String result="";
       for (String each:arr) {
           result+=(each.charAt(0)+"").toUpperCase()+each.substring(1).toLowerCase();

       }
       return  (result.charAt(0)+"").toLowerCase()+result.substring(1);



   }
    /**
     * This method accepts String and a Char
     * And returns how many times that char exists in the String
     * Input:
     *      apple, z
     * Output:
     *      0
     */
    public static int frequencyOfCharacter(String str, char ch){
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == ch){
                count++;
            }

        }
        return count;
    }

    /**
     * This method accepts String
     * And returns only unique characters as a String
     *
     */
    public static String uniqueCharacters(String str) {
        String checked = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains(str.charAt(i) + "")) {
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);
                if (count == 1) {
                    unique += str.charAt(i);
                }
            }

        }
        return unique;
    }



}
