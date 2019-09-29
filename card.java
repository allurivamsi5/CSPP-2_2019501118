public class sample{
    public static void main(String[] args){
        Card a = new Card();
        a.setAuthor("Tom");
        a.setTitle("Broken heart");
        a.setSubject("love story");
        a.getAuthor();
        a.getTitle();
        a.getSubject();
        System.out.println(a.getAuthor()+" "+a.getTitle()+" "+a.getSubject);



    }
}
class Card{
    String author;
    String title;
    String subject;
    Card(){

    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getSubject(){
        return this.subject;

    }
        


}