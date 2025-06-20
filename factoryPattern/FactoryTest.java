package factoryPattern;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter notification type (EMAIL / SMS / PUSH): ");
        String type = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(type);
        if (notification != null) {
            notification.notifyUser("Your order has been shipped!");
        } else {
            System.out.println("Invalid notification type entered.");
        }

        scanner.close();
    }
}
