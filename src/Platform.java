public abstract class Platform {

	protected NotificationType typeNotification;
	
	public Platform (NotificationType typeNotify) {
		typeNotification = typeNotify;
		
	}
	
	public abstract void executeNotification ();
}
