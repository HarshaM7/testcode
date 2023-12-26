public class testcode {
    public static void main(String[] args) {
        // Replace this with your input time in 12-hour format
        String time12HourFormat = "04:30:45 PM";

        // Call the method to convert time
        String time24HourFormat = convertTo24HourFormat(time12HourFormat);

        System.out.println("Input time (12-hour format): " + time12HourFormat);
        System.out.println("Output time (24-hour format): " + time24HourFormat);
    }

    private static String convertTo24HourFormat(String time12HourFormat) {
        // Extract hours, minutes, and seconds
        int hours = Integer.parseInt(time12HourFormat.substring(0, 2));
        int minutes = Integer.parseInt(time12HourFormat.substring(3, 5));
        int seconds = Integer.parseInt(time12HourFormat.substring(6, 8));

        // Check if it's PM and not noon (12 PM)
        if (time12HourFormat.endsWith("PM") && hours != 12) {
            hours += 12;
        }

        // Check if it's midnight (12 AM)
        if (time12HourFormat.endsWith("AM") && hours == 12) {
            hours = 0;
        }

        // Format the result
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
