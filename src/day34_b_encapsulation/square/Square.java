package day34_b_encapsulation.square;

public class Square {
      //instant var - side
    private int side;



    //make constructor - accepts one  - side



    public Square (int side){
        setSide(side);

    }


    //assign value to instance var - side indirectly
    public void setSide(int side) {
        if(side>0) {
            this.side = side;
        }
    }

    public int getSide(){
        return side;
    }

    public int calculateArea(){
        return side*side;
    }

    public int calculatePerimeter(){
        return 4 * side;
    }

}
