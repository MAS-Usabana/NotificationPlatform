import java.util.Scanner;

public class NotificationsPlatform {

	public static void main (String []  args) {
		
		Scanner sc = new Scanner (System.in);
		
	    System.out.println("\n===============================");
	    System.out.println(" Notification Platform");
	    System.out.println("===============================");
	    System.out.println("Welcome");
	    
        while (true) {

            System.out.println("\nSelect notification type");
            System.out.println("1. Alert");
            System.out.println("2. Warning");
            System.out.println("3. Message");
            System.out.println("4. Confirmation");
            System.out.println("0. Exit");

            int option = sc.nextInt();

            if (option == 0) {
                System.out.println("Good Bye!");
                break;
            }

            NotificationType notification;

            switch (option) {

                case 1:
                    notification = new Alert();
                    break;

                case 2:
                    notification = new Warning();
                    break;

                case 3:
                    notification = new Message();
                    break;

                case 4:
                    notification = new Confirmation();
                    break;

                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            System.out.println("\nSelect platform");

            System.out.println("1. Mobile");
            System.out.println("2. Web");
            System.out.println("3. Desktop");

            int platformOption = sc.nextInt();

            Platform platform;

            switch (platformOption) {

                case 1:
                    platform = new MobilePlatform(notification);
                    break;

                case 2:
                    platform = new WebPlatform(notification);
                    break;

                case 3:
                    platform = new DeskPlatform(notification);
                    break;

                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            System.out.println();
            platform.executeNotification();
            
            System.out.print("\nDo you want to send another notification? (Y/N): ");
            String answer = sc.next().trim().toUpperCase();

            if (!answer.equals("Y")) {
                System.out.println("\nThanks for using Notification Platform.");
                break;
            }

        }

        sc.close();
    }
}
