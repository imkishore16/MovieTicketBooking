public class Payment {
    int userId;
    MovieTimings movie;
    int paymentId;
    double total;
    boolean status;
    Payment(int userId,MovieTimings movie,double total){
        this.movie=movie;
        paymentId=1;
        this.total=total;
        this.status=false;
    }

    public void printReciept()
    {
        System.out.println("USERID" +  userId);
        System.out.println("PAYMENT " +paymentId);
        System.out.println("TOTAL" + total);
    }

}
