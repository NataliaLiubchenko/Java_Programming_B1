package day27_wrapper_arraylist;
/*

    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number

 */
public class CountCharacters {
    public static void main(String[] args) {
        String s ="aP3d572&*jd@jdJU";
        int loverCase = 0, upperCase = 0, digit = 0, others = 0;
        for (int i = 0; i < s.length(); i++) {
         if ( Character.isUpperCase(s.charAt(i))){
             upperCase++;
         }else if(Character.isLowerCase(s.charAt(i))){
             loverCase++;
         }else if(Character.isDigit(s.charAt(i))) {
             digit++;
         }else {
             others++;
         }
        }
        System.out.println("UpperCase count: "+upperCase);
        System.out.println("LowerCase count: "+loverCase);
        System.out.println("Digit count: "+digit);
        System.out.println("Other Characters: "+others);

    }

}
