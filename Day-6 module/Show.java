import java.util.Arrays;
class BookedClass {
    /**.
     * patron p is used
     */
    public Patron p;
    /**.
     * seats is used.
     */
    private String[] seats;
    BookedClass(final Patron patron, final String[] s) {
        this.p = patron;
        this.seats = s;
    }
    public String toString() {
        return p.name + " " + p.phone + " " + Arrays.toString(seats);
    }
}
class Show {
    /**.
     * name is used.
     */
    public String name;
    /**.
     * datetime is used.
     */
    public String dateTime;
    /**.
     * seats is used.
     */
    public String[] seats;
    /**.
     * ten is a magicnumber
     */
    public final int tenTen = 10;
    /**.
     * booked will be type bookedclass array.
     */
    private BookedClass[] booked = new BookedClass[tenTen];
    /**.
     * size is used.
     */
    private int size;
    Show(final String n, final String dt, final String[] s) {
        this.name = n;
        this.dateTime = dt;
        this.seats = s;
        this.size = 0;
    }
    public String toString() {
        return this.name + " " + this.dateTime + " " + Arrays.toString(seats);
    }
    public void bookAShow(final Patron p, final String[] s) {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (seats[i].equals(s[j])) {
                count++;
                }
            }
        }
        if (count == s.length) {
             booked[size++] = new BookedClass(p, s);
             System.out.println("Booked");
        }
    }
    public void printTickets(final Patron p) {
        for (int i = 0; i < this.size; i++) {
            if (p.equals(booked[i].p)) {
                System.out.println(booked[i]);
            }
        }
    }
}
