//import java.util.Date;
public class mydhar{
    public static void main(String[] args){
        
      //  person family[] = {"Av","Avp"};

        person Av = new person();
        Av.setName("vamsi");
        Av.setDob("06/08/1997");
        Av.setId(123456);

        person father = new person();
        father.setName("badari");
        father.setDob("19/07/1987");
        father.setId(6328422);

        //vamsi.setFamily(family);
        person mother = new person();
        mother.setName("rani");
        mother.setDob("24/09/1989");
        mother.setId(782383929);

        Av.family[0] = father;
        Av.family[1] = mother;

        System.out.println("name ="+Av.name+",dob= "+Av.dob+",id= "+Av.id+" is connected to "+Av.family[0]+","+Av.family[1]);
       // System.out.println(Avp);

    }
}
class person{
    String name;
    String dob;
    int id;
    person[] family = new person[2] ;
    person(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setId(int id){
        this.id = id;
    }
    // public void setFamily([] family){
    //     this.family = family;
    // }
    public String getName(){
        return this.name;
    }
    public String getDob(){
        return this.dob;
    }
    public int getId(){
        return this.id;
    }
    // public person getFamily(){
    //     return this.family;
    // }
    public String toString(){
        return name+ " " + dob + " " + id; 
    }
   
 }
// class aadharlog{
//     person[] arr;
// }