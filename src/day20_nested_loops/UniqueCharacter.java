package day20_nested_loops;

import javax.swing.plaf.IconUIResource;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";


        for (int i = 0; i < str.length() ; i++) {
            char outerLetter = str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                if (innerLetter==outerLetter){
                    count++;
                }
            }
            if (count==1){
                System.out.println(outerLetter);
            }

        }

        System.out.println();
    }
}
