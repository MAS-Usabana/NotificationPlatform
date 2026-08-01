
public class MobilePlatform extends Platform{
	public MobilePlatform(NotificationType typeNotify) {
		super(typeNotify);
		// TODO Auto-generated constructor stub
	}
	
	public void executeNotification () {
		System.out.println("MOBILE PLATFORM");
		typeNotification.notifyUser();
	}

}
