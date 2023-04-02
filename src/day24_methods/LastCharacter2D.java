package day24_methods;


public class LastCharacter2D {
    public static void main(String[] args) {
     String [] [] info = {
             {"James", "is", "back"},
             {"he", "was", "never", "gone"},
             {"methods", "tomorrow"}
     };
     String lastChar = "";
        for (String [] eachArr:info) {
            for (String eachWord: eachArr) {
                System.out.print(eachWord.charAt(eachWord.length() - 1));
            }

            System.out.println();
        }

    }

}
