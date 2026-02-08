package LLD.DesignPrinciple.SOLID.D.DependencyInversion.BadCode;

public class MangoJuicer {
    Mango mango;

    MangoJuicer(Mango mango) {
        this.mango = mango;
    }

    public void makeJuice(){
        System.out.println(mango.extract());
    }


    static void main() {
        MangoJuicer mangoJuicer = new MangoJuicer(new Mango());
        mangoJuicer.makeJuice();
    }
}
