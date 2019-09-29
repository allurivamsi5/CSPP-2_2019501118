import java.util.*;
public class log{
    public static void main(String[] args){
        Card a = new Card();
        a.setAuthor("Tom");
        a.setTitle("Broken heart");
        a.setSubject("love story");
        //a.getAuthor();
        //a.getTitle();
        //a.getSubject();
        //System.out.print(a.getAuthor()+" "+a.getTitle()+" "+a.getSubject());
        Card b = new Card();
        b.setAuthor("steven");
        b.setTitle("Cary");
        b.setSubject("Comdey");
        Card c = new Card();
        c.setAuthor("steven");
        c.setTitle("xyz");
        c.setSubject("adventure");

        CardCatalog r = new CardCatalog();
        r.AddaCard(a);
        r.AddaCard(b);
        r.AddaCard(c);
        r.printCatalog();


    }
}
class Card{
    String Author;
    String Title;
    String Subject;
    Card(){

    }
    Card(String Author,String Title,String Subject){
        this.Author = Author;
        this.Title = Title;
        this.Subject = Subject;
    }
    public void setAuthor(String author){
        this.Author = author;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public void setSubject(String subject){
        this.Subject = subject;
    }
    public String getAuthor(){
        return this.Author;
    }
    public String getTitle(){
        return this.Title;
    }
    public String getSubject(){
        return this.Subject;
    }
    public String toString(){
        return this.Author+" "+this.Title+" "+this.Subject;
    }
}
class CardCatalog{
    int index = 0;
    Card[] CardArray;
    public CardCatalog(){

        CardArray = new Card[10];
    }
    public void AddaCard( Card obj){
        CardArray[index] = obj;
        index++;
    }
    public Card getATitle(String s){
        for(int i=0;i<CardArray.length;i++){
            if(CardArray[i].Title.equals(s)){
                return CardArray[i];
            }
        }return null;
    } 
    public Card getAuthor(String au){
        //Card[] arr = new Card[index];
        //int count = 0;
        for(int i=0;i<CardArray.length;i++){
            if(CardArray[i].Author.equals(au)){
                return CardArray[i];
               // arr[count] = CardArray[i];
                //count++;
            }
        }return null;
    }
    public Card getSubject(String su){
        for(int i=0;i<CardArray.length;i++){
            if(CardArray[i].Subject.equals(su)){
                return CardArray[i];
            }
        }
        return null;
    }
    public void removeTitle(String  ti){
        for(int i = 0; i<CardArray.length;i++){
            if(CardArray[i].Title.equals(ti)){
                CardArray[i]=null;
            }
       }

    }
    public void printCatalog(){
        for(int i = 0; i < CardArray.length;i++){
            if(this.CardArray[i]!=null){
                System.out.println(CardArray[i]);
            }
        }
    }
}

   

    
