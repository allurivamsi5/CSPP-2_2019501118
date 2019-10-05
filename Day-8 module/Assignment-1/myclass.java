public class myclass{
    public static void main(String[] args){
        // first method - passing parameters in constructor and without using setter,getters.
       // BankAccount obj = new BankAccount("12345678864",4567380);
        //System.out.println(obj.toString());

        // second method - without passing parameters in constructor and using setters,getters.
        BankAccount obj = new BankAccount();
        obj.setAccountNo("1234567895443");
        obj.setBalance(456740);

        System.out.println(obj.toString());


    }

}
class BankAccount{
    String accountno;
    double balance;
   // BankAccount(String a,double b){
        // this.accountno = a;
        // this.balance = b;

   // }
   BankAccount(){

   }
        

    public void setAccountNo(String accountno){
        this.accountno = accountno;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountNo(){
        return this.accountno;
    }
    public double getBalance(){
        return this.balance;
   }
    public String toString(){
        return accountno+" "+balance;
    }
}
class CheckingAccount extends BankAccount{
    double extralimit;
    CheckingAccount(){
        
    }

}
class SavingsAccount extends BankAccount{

}
class COD extends BankAccount{

}