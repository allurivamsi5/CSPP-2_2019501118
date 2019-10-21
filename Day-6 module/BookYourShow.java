class BookYourShow{
    Show[] shows;
    int noOfMovies;
    BookYourShow(){
        shows = new Show[5];
        noOfMovies = 0;
    }
    public void addAShow(Show show){
		shows[noOfMovies++] = show;
	}

}