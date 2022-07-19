package Ch7_OOP2.Inheritance;

public class IceCream {
    String name = this.getClass().getSimpleName();
    private String[] flavor;
    String color;
    int price;
    String manufacturer;

    IceCream(){
        System.out.println("IceCream Instance");
    }

    IceCream(String color, String[] flavor){
        this.color = color;
        this.flavor = flavor;
    }

    void freezing(){
        System.out.println(name + "is freezing.");
    }

    void melting(){
        System.out.println(name + "is melting.");
    }

    public String toString(){
        System.out.println("Ice Cream Name : " + name);
        return name;
    }

    void setFlavor(String[] newFlavor){
        flavor = newFlavor;
        for(int i=0; i< newFlavor.length; i++){
            System.out.print(newFlavor[i]);
            if(i != newFlavor.length-1) System.out.print(", ");
        }
        System.out.println();
    }


}
