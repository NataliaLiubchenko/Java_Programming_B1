package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        OfferV2 offer1 = new OfferV2("Facebook","California",150000,true, 28);
        System.out.println(offer1);
        System.out.println("-----------------------------------");
        OfferV2 offer2 = new OfferV2("Amazon","Arlington",145000.00);
        System.out.println(offer2);

        ArrayList<String > listOfStr = new ArrayList<>(Arrays.asList("Hello","Bye"));
        ArrayList<Integer > listOfInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        ArrayList<OfferV2> offerList = new ArrayList<>();
        offerList.add(offer1);
        offerList.add(offer2);
        System.out.println("-----------------------------------");
        for (OfferV2 each:offerList) {
            System.out.println(each);
            System.out.println("---------------------");

        }
        System.out.println("This is from ArrayList and i will get only company name only ");
        for (OfferV2 each :offerList) {
            System.out.println(each.company);

        }
        System.out.println("---------------------");

        OfferV2 [] offerArr = {offer1,offer2};
        OfferV2 [] offerArr2 = {new OfferV2("Tesla","Texas"),
                                new OfferV2("Google","California")};




    }
}
