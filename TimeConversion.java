public class TimeConversion {

    public static void main(String[] args) {
//        String s = "12:34:24PM";
//        String s = "12:01:00AM";
        String s = "02:04:00PM";
//        String s = "04:00:01AM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {
        StringBuilder str = new StringBuilder();
        CharSequence amPM = s.substring(s.length()-2);
        String time = s.substring(0, s.length()-2);

        if (s.equals("12:00:00AM")) {
            return "00:00:00";
        }

        String hours = time.substring(0, 2);
        int hoursInt = Integer.parseInt(hours);
        String rest = time.substring(2);

        if (amPM.equals("PM")) {
            if (hoursInt != 12) {
                hoursInt += 12;
            }
            str.append(hoursInt);
        } else if (amPM.equals("AM")) {
            if (hoursInt == 12) {
                str.append("00");
            } else if (hoursInt < 10) {
                str.append('0');
                str.append(hours.charAt(1));
            } else {
                str.append(hoursInt);
            }
        }
        str.append(rest);



        return str.toString();
    }
}
