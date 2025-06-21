package factoryPattern;


public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}