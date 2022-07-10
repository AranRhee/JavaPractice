package Ch7_OOP2.Inheritance;

public class Lotteria {
    String[] hamburgers;
    IceCream iceCream;

    Lotteria(){
        // Lotteria(IceCream iceCream) 호출
        this(new IceCream("white", new String[]{"Vanilla"}));
    }

    Lotteria(IceCream iceCream){
        this.iceCream = iceCream;
    }

}
