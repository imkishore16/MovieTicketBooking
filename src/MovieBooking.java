import java.util.HashMap;
import java.util.*;

public class MovieBooking {
    Scanner sc= new Scanner(System.in);
    public HashMap<String ,List<MovieTimings>> movies;

    MovieBooking() {
        movies=new HashMap<>();
    }
    public HashMap<String,List<MovieTimings>> getMovies()
    {
        return movies;
    }

    public void displayAllMovies()
    {
        Iterator<Map.Entry< String,List<MovieTimings>>> iterator = movies.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,List<MovieTimings>> entry = iterator.next();

            //this consists of a list of same movies but different timings
            List<MovieTimings> differentTimings=entry.getValue();
            System.out.print("MovieTitle: " + entry.getKey() + " Showtimings: " );
            for(int i=0;i<differentTimings.size();i++)
            {
                MovieTimings temp=differentTimings.get(i);
                System.out.print(temp.getShowTimings());
            }
        }
    }
    //add movie to HashMap
    public HashMap<String,List<MovieTimings>> addMovie(MovieTimings movie)
    {
        String title=movie.getTitle();
        if(!movies.containsKey(title))
        {
            movies.put(title,new ArrayList<MovieTimings>());
            movies.get(title).add(movie);
        }
        else //if(movies.containsKey(title))
        {
            movies.get(title).add(movie); // a movie with new timings will be added
        }
        return movies;
    }

    public List<List<Integer>> bookMovie(MovieTimings movie){
        movie.viewSeats();
        List<Integer> rows=new ArrayList<>();
        List<Integer> cols=new ArrayList<>();
        while(true)
        {
            System.out.println("Enter the seat number or enter exit ");
            String seatNumber=sc.nextLine();
            if(seatNumber.equals("exit"))
                break;

            int row=seatNumber.charAt(0)-65;
            int col=Character.getNumericValue(seatNumber.charAt(1));
            rows.add(row);
            cols.add(col);

        }
        return new ArrayList<>(Arrays.asList(rows,cols));
    }

    //return the movie to the user
    public MovieTimings bookMovie(String title,int choice)
    {
        MovieTimings movie= movies.get(title).get(choice);
        return movie;
    }

    public double calcualteBill(MovieTimings movie,List<List<Integer>> seatsSelected )
    {
        double price = movie.getprice();
        double total = price*seatsSelected.get(0).size();
        return total;
    }






    public List<MovieTimings> selectMovie(String title)
    {
        return movies.get(title);
    }


    public void displayTimings(List<MovieTimings> movieTimingsList)
    {
        for(int i=0;i<movieTimingsList.size();i++)
        {
            System.out.println(i+1+" --> "+ movieTimingsList.get(0).getShowTimings());
        }
    }



}
