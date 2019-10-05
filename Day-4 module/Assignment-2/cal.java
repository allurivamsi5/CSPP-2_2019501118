interface calculator{
    int add(int a, int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class call implements calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if(b!=0){
            
            return a/b;
        }
        else{
            return 0;
        }
    // public String toString(){
    //     return add+" "+sub+" "+mul+" "+div;
    // }
    }
}
class cal{
    public static void main(String[]args){
        call obj = new call();
        //  obj.add(2,3);
        // obj.sub(2,3);
        // obj.mul(2,3);
        // obj.div(2,4);

        System.out.println(obj.add(2,3));
        System.out.println(obj.sub(2,3));
        System.out.println(obj.mul(2,3));
        System.out.println(obj.div(4,2));
    }
}