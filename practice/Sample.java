public class Sample{
    public static void main(String[] args){
        Book a = new Book();
        a.setTitle("Tom");
        a.setAuthor("AV");
        a.setPages(999);
        a.getTitle();
        a.getAuthor();
        a.getPages();
        System.out.println(a.getTitle() +" "+a.getAuthor()+" "+a.getPages());

        

    }
}
class Book{
    String title;
    String author;
    int pages;
    Book (){


       // this.title = title;
       // this.author = author;
       // this.pages = pages;
 }

    
    public void setTitle(String title){
        this.title = title;

    } 
    public void setAuthor(String author){
         this.author = author;
    }
    public  void setPages(int pages){
         this.pages = pages;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPages(){
        return this.pages;
    }
    
}