package day36_inheritance.lyft;

public class LyftXL extends  Lyft{

    public LyftXL(String driver){
        super(driver);
    }
    @Override
    public double calculateRate(int miles){
       // return  (miles * 3.75)*1.5;
        return super.calculateRate(miles)*1.5;

    }

}
