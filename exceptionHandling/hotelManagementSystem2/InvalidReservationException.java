package exceptionHandling.hotelManagementSystem2;

public class InvalidReservationException extends Exception{
	public InvalidReservationException(String message) {
        super(message);
    }
}
