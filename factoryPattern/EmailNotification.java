package factoryPattern;
public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}