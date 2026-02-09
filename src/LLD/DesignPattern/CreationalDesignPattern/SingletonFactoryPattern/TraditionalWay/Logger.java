package LLD.DesignPattern.CreationalDesignPattern.SingletonFactoryPattern.TraditionalWay;

public class Logger {
    public  void log(String message, boolean isError){
       if(isError){
           System.err.println(message);
       }else{
           System.out.println(message);
       }
    }
}
