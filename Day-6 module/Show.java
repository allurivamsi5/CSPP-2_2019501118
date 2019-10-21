class Show{
    String movieName;
    String dateTime;
    String[] seats;
    Show(String movie, String dateTime, String[] seats){
        this.movieName = movie;
        this.dateTime = dateTime;
        this.seats = seats;
    }
    public String getMovieName(){
		return this.movieName;
	}

	public String getDateTime(){
		return this.dateTime;
	}
}