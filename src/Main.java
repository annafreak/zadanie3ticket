
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
        if(reservation == true){
            System.out.println("You have reserved the cinema");
        }else{
            System.out.println("You have not reserved the cinema");
        }


    }
    public void cancelReservation( boolean reservation){
        if(reservation == true){
            System.out.println("you have canceled the cinema");
        }else{
            System.out.println("You have not canceled the cinema");
        }


    }
    public void display(){
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);



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
