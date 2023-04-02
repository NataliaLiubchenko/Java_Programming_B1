package day19_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        String checked = "";

        for (int i = 0; i < word.length() ; i++) {
            char letter = word.charAt(i);                      //a
            int count = 0;

            if (!checked.contains(""+letter)){
                for (int j = 0; j < word.length(); j++) {
                    char eachLetter = word.charAt(j);           //a
                    if (letter == eachLetter){
                        count++;                                 //0
                    }

                } //inner loops ends
                System.out.println(letter+" - "+count);
                checked+=letter;
            }

        }




    }
}
