package LLD.DesignPrinciple.SOLID.I.InterfaceSeggregationProblem.BadCode;

public class Main {
    public static void main(String[] args) {
        Machine machine = new BasicPrinter();
        machine.print();
        try{
            machine.fax();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            machine.scan();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
