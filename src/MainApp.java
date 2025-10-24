public class MainApp {
    public static void main(String[] args){
        TaxiTicket ticket = new TaxiTicket("Alung", "Donwtown", "Airport", 50.0, 30.0, 60.0);

        ticket.detailedInfo();

        ticket.checkStatus();

        ticket.displayRoute();
        ticket.displayEstimatedDuration();

        ticket.slowdown(20);
        ticket.speedUp(15);
    }
}
