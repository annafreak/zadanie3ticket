

class cinemaTicket{
    String name;
    int seatNumber;
    double price;
    boolean reservation;
    public cinemaTicket(String name, int seatNumber, double price){
        this.name = name;
        this.seatNumber = seatNumber;
        this.price = price;


    }
    public void ticketReservation(  boolean reservation){
    System.out.println("Ticket Reservation "+ name + " " +reservation);

    }
    public void cancelReservation( boolean reservation){
        System.out.println("Cancel Reservation "+ name + " " +reservation);

    }
    public void display(){
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Reservation: " + reservation);


    }

}

public class Main {
    public static void main(String[] args) {
        cinemaTicket c = new cinemaTicket("ts pmo",23,36);
        cinemaTicket c2 = new cinemaTicket("ts gon gng",15,22);
        c.ticketReservation(true);
        c.display();
        c.cancelReservation(true);
        c.display();
        c2.ticketReservation(true);
        c2.display();
        c2.cancelReservation(true);
        c2.display();




    }
}