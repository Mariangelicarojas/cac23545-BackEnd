package ar.com.codoacodo.interfaces.log;

public class LogManager {
	
	public static ILog getLogger(String target) {
		ILog i;
		switch (target) {
		case "A": {
			i= new FsLog();
			break;
		}
		case "B": {
			i= new EmailLog();
			break;
		}
		case "C": {
			i= new SmsLog();
			break;
		}
		default:
			i = null;
		}
		
		return i;
	}

}
