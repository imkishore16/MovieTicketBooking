import java.util.ArrayList;
import java.util.List;

public class User {
    int userId;
    String email;
    String password;
    List<Movie> history;
    User(){
        history=new ArrayList<>();
    }
    public int userId()
    {
        return userId;
    }
    //book movie

    //run the userCLI here to start the booking process

}
