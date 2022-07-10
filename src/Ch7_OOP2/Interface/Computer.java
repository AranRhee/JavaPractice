package Ch7_OOP2.Interface;

public class Computer {
    public void turnOn(){
        System.out.println("Turn On");
    }

    public void turnOff(){
        System.out.println("Turn Off");
    }

    public void charging(int currentBattery){
        if(currentBattery/10 < 10) {
            System.out.println("충전중입니다.");
        }
    }
}
