/**
 * 
 */

public class List extends AbstractList {
    public void add(int item){
        resize();
        this.list[this.size++] = item;
    }
    
    public void set(int index, int item) {
            // TODO
            // Your code goes here.
            list[index] = item;
        }
    
    
    
    
}