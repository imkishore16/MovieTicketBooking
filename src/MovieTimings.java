import java.util.ArrayList;
import java.util.*;

public class MovieTimings extends Movie{
//    final int MAX_SEATS=500;
    private int capacity;
    private String screenName;
    private String showTimings;
    private String seats[][];
    // different prices depending upont he time of the day
    private double price;

    MovieTimings(String screenName,String showTimings)
    {
        this.capacity=26*9;
        this.screenName=screenName;
        this.showTimings=showTimings;
        seats= new String[26][9];
        for(int i=0;i<seats.length;i++)
        {
            int ascii=65+i;
            char x=(char)ascii;
            for(int j=0;j<seats[0].length;j++)
            {
                seats[i][j]+=x;
                seats[i][j]+=String.valueOf(j);
            }
        }
    }

    public void viewSeats()
    {
        int rows=seats.length;
        int cols=seats[0].length;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(seats[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public void bookSeats(List<Integer> rows,List<Integer> cols)
    {
        for(int i=0;i<rows.size();i++)
        {
            if(!seats[rows.get(i)][cols.get(i)].equals("NA"))
                seats[rows.get(i)][cols.get(i)]="NA";
        }
    }

    public String getShowTimings()
    {
        return showTimings;
    }

    public double getprice()
    {
        return price;
    }
}


