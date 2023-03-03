package task;

public class Movie 
{
	private String movieName;
	private String director;
	private float rating;
	private float duration;
	public Movie()
	{
		
	}
	
	

	public Movie(String movieName, String director, float rating, float duration) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
		this.duration = duration;
	}

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", director=" + director + ", rating=" + rating + ", duration="
				+ duration + "]";
	}
}
