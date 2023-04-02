package day24_methods;

public class CreditScore {

    public static int gerCreditScore(){
       return 800;
    }

    public static String isGoodCreditHistory(int score){
        if (score>=750){
            return "Great";
        }else if (score>=720&&score<=750){
            return "Good";
        }else {
            return "Poor";
        }
    }

    public static boolean isGoodCredit(int score){
        if (score>=750){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int score = gerCreditScore();
        System.out.println(score);
        System.out.println("=============================");
        System.out.println(gerCreditScore());

        System.out.println("Shafeg credid score is 800. That score is "+isGoodCreditHistory(800));
        System.out.println("Shafeg credid score is 820. Is that score good? "+isGoodCredit(800));


    }





}
