package switches;

public class Switch_PickADay {

	public static void main(String[] args) {

		int day = 1;
		String dayString;

		switch (day) {
		case 1:
			dayString = "Sunday";
			break;
		case 2:
			dayString = "Monday";
			break;
		case 3:
			dayString = "Tuesday";
			break;
		case 4:
			dayString = "Wednesday";
			break;
		case 5:
			dayString = "Thursday";
			break;
		case 6:
			dayString = "Friday";
			break;
		case 7:
			dayString = "Saturday";
			break;
		default:
			dayString = "Invalid day";

		}
		System.out.println(dayString);
	}

}
