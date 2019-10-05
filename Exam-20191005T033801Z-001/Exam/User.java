import java.util.*;

 class Userdetails {
    String userName;
    int noOFconnections;
    String connectionsofUser;

   public  Userdetails(){
        // this.userName = userName;
        // this.noOFconnections = noOFconnections;
        // this.connectionsofUser = connectionsofUser;
    }

    public void setUsername(String userName){
        this.userName = userName;
    }

    public void setNoofconnections(int noOFconnections){
        this.noOFconnections = noOFconnections;
    }

    public void setConnectionsofuser(String connectionsofUser){
        this.connectionsofUser = connectionsofUser;
    }

    public String getUsername(){
        return this.userName;
    }

    public int getNoofconnections(){
        return this.noOFconnections; 
    }

    public String getConnectionsofuser(){
        return this.connectionsofUser;
    }

    public String toString(){
        return userName+" "+noOFconnections+" "+connectionsofUser;
    }

}


public class User{
    public static void main(String[] args){

        Userdetails obj = new Userdetails();

        obj.getUsername();
        obj.getNoofconnections();
        obj.getConnectionsofuser();

        System.out.println(obj);

    }
}