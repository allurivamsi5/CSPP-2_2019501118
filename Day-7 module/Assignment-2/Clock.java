/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    int h;
    int m;
    String hr;

    public Clock(int h, int m) {
        this.h = h;
        this.m = m;

    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        this.hr = s;

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return (this.h+":"+this.m);

    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if(this.h<that.h){
            return true;
        }else if ((this.h == that.h)&&(this.m < that.m)){
            return true;
        }else{
            return false;
        }

        
    }

    // private void check() {
        
    // }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if(this.m>0 && this.m<59){
            this.m +=1;
        }else{
            this.h +=1;
        }
        
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if(this.m+delta>59){
            int a = delta/60;
            int b = this.h+a;
            if(b > 23){
                int c = b/24;
                int d = this.h + c;
            }else{
               int rem = delta % 60;
                int e = this.m+rem;
                
            }

        }else{
            this.m+=delta;
        }
        if(this.m == 60){
            this.m = 0;
            this.h +=1;
        }
        if(this.h == 24){
            this.h = 0;
        }

        
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}