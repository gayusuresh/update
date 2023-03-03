package task;

import java.util.HashSet;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1=new Movie("Bahubali","Rajmouli",4.2f,3.1f);
		Movie m2=new Movie("RRR","Rajmouli",4.3f,3.5f);
		Movie m3=new Movie("LionKing","Jon Favreau",4.5f,3.8f);
		Movie m4=new Movie("Avatar","James Cameron",4.6f,3.6f);
		HashSet<Movie>set=new HashSet<Movie>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		for(Movie m:set)
		{
			System.out.println(m);
		}
		System.out.println("=================MovieRating above 4.5 movies");
		for(Movie m:set)
		{
			if(m.getRating()>=4.5 && m.getDuration()>=3.0)
			{
				System.out.println(m.getMovieName());
			}
		}

	}

}
