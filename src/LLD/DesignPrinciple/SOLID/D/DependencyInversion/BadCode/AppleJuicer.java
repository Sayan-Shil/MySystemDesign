package LLD.DesignPrinciple.SOLID.D.DependencyInversion.BadCode;

public class AppleJuicer {
    Apple apple;

    AppleJuicer(Apple apple) {
        this.apple = apple;
    }

    public void makeJuice(){
        System.out.println(apple.extract());
    }


    static void main() {
        AppleJuicer appleJuicer = new AppleJuicer(new Apple());
        appleJuicer.makeJuice();
    }
}
