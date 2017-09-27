package example;

public class DaysOfWeek {
	public String getDayName(int dayNumber){
		String dayName = null;
		switch (dayNumber){
			case 0:
				dayName = "Monday";
				break;
			case 1:
				dayName = "Tuesday";
				break;
			case 2:
				dayName = "Wednesday";
				break;
			case 3:
				dayName = "Thursday";
				break;
			case 4:
				dayName = "Friday";
				break;
			case 5:
				dayName = "Saturday";
				break;
			case 6:
				dayName = "Sunday";
				break;
			default:
				throw new IllegalArgumentException("dayNumber is not valid");
		}
		return dayName;
	}
}
