import java.util.Arrays;
public class paytm{
    public static void main(String[]args){
       // operation obj = new operation();
        String sum = operation.add();
       // int sub = operation.sub();
        //int[] arr = new int[10];

        System.out.println(sum);

    }
}
class  operation{
    static  String []  x ;
     static String y;
    operation(String [] x,String y){
        this.x[0] = x;
        this.y=y;
    }
    
    // public static int sub(){
    //    return x-y;
    // }
    public static void addqst(String x){
        x = x + 2;
        
    }
    public   String toString(){
        return (x+" "+y);
    }

}