package day08_scanner__logical_operators;

public class EligebleToVote {

    public static void main(String[] args) {
//        create and assign these variables:
//
//        name
//        are they citizen
//        do have criminal background
//                age
//
//        sample inputs:
//        "James Bond"
//        true
//        false
//        49
//
//        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18
//
//        print : $name is eligible to vote: $boolean

        String name ="Tom";
        boolean isCitizen=true;
        boolean hasCriminalBackground = true;
        int age = 49;

        boolean isElegible;
        isElegible=age>=18 && isCitizen && !hasCriminalBackground;

        System.out.println(name+ " is elegible to vote "+isElegible);

        isElegible=age>=18 && isCitizen && hasCriminalBackground;

        System.out.println(name+ " is elegible to vote "+isElegible);



    }
}
