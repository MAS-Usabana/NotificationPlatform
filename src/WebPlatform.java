
public class WebPlatform extends Platform{
	
	public WebPlatform(NotificationType typeNotify) {
		super(typeNotify);
		// TODO Auto-generated constructor stub
	}
	
	public void executeNotification () {
		System.out.println("WEB PLATFORM");
		typeNotification.notifyUser();
	}

}
