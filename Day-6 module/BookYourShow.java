class BookYourShow {
    /**.
     * ten is a magic number.
     */
    private final int ten = 10;
    /**.
     * shows is an array
     */
    private Show[] shows = new Show[ten];
    /**.
     * size is used
     */
    private int size = 0;
    public void addAShow(final Show show) {
        shows[size++] = show;
    }
    public Show getAShow(final String name, final String dateTime) {
        for (int i = 0; i < this.size; i++) {
            if (shows[i].name.equals(name)
            && shows[i].dateTime.equals(dateTime)) {
                return shows[i];
            }
        }
        return null;
    }
 }
