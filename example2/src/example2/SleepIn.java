package example2;

public class SleepIn{
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new SleepIn().sleepIn(false, true));
		System.out.println(new SleepIn().sleepIn(true, true));
		System.out.println(new SleepIn().sleepIn(false, false));
		System.out.println(new SleepIn().sleepIn(true, false));
	}
}