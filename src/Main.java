import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        MovieBooking booking= new MovieBooking();
        //add movies
        MovieTimings movie=new MovieTimings("Screen 1","10:15 PM");
        movie.setTitle("Oppenhiemer");
        movie.setDirector("Nolan");
        movie.setDuration("3 hrs");
        movie.setGenre(Genre.documentry);

        MovieTimings movie2=new MovieTimings("Screen 2","6:30 PM");
        movie.setTitle("Oppenhiemer");
        movie.setDirector("Nolan");
        movie.setDuration("3 hrs");
        movie.setGenre(Genre.documentry);

        MovieTimings movie3=new MovieTimings("Screen 1","10:30 AM");
        movie.setTitle("Inception");
        movie.setDirector("Nolan");
        movie.setDuration("3 hrs");
        movie.setGenre(Genre.documentry);

        MovieTimings movie4=new MovieTimings("Screen 2","3:30 PM");
        movie.setTitle("Inception");
        movie.setDirector("Nolan");
        movie.setDuration("3 hrs");
        movie.setGenre(Genre.documentry);

        booking.addMovie(movie);
        booking.addMovie(movie2);
        booking.addMovie(movie3);
        booking.addMovie(movie4);

        System.out.println(booking.getMovies());
        booking.displayAllMovies();



//        //all under user cli
//        // give booking to the user
//
//        booking.displayAllMovies();
//        System.out.println("Enter Movie title");
//        String title=sc.nextLine();
//        //display the show timings alone
//        List<MovieTimings> movieTimingsList=booking.selectMovie(title);
//
//        //disply the movie timings again
//        booking.displayTimings(movieTimingsList);
//        System.out.println("please select a timing from the above choices ");
//        System.out.println("Please enter a number");
//        int choice=sc.nextInt();
//
//        // now i have the show name name and timings now i  have to return the movieTimings to the user
//        MovieTimings movieToBeBooked=booking.bookMovie(title,choice);
//        List<List<Integer>> seatsSelected=booking.bookMovie(movieToBeBooked);
//
//        //calcbill
//        double total=booking.calcualteBill(movieToBeBooked,seatsSelected);
//
//        //now payment
//        //using a temporaty userID since i am not usign a database or cookies
//
//        Payment pay= new Payment(1,movieToBeBooked,total);
//        PaymentPortal portal = new PaymentPortal();
//        boolean status=portal.makePayment(pay);
//        if(status)
//        {
//            pay.printReciept();
//            //after payment bookt the seats as NA
//            movieToBeBooked.bookSeats(seatsSelected.get(0),seatsSelected.get(1));
//        }




    }
}
