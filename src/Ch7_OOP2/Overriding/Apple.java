package Ch7_OOP2.Overriding;

public class Apple {
    String manufacturer = "Apple";
    private String modelName;
    private String CPU;
    private int price;
    private int RAM;
    int releaseYear = 1976;

    void changePrice(int price){
        this.price = price;
        System.out.println(modelName + "'s price is " + price);
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return modelName;
    }


}
