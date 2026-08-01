
public class DeskPlatform extends Platform{
	
	public DeskPlatform(NotificationType typeNotify) {
		super(typeNotify);
		// TODO Auto-generated constructor stub
	}
	
	public void executeNotification () {
		System.out.println("DESKTOP PLATFORM");
		typeNotification.notifyUser();
	}

}
