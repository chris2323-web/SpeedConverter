public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

//        hourOfDay = Math.min(0, 23);
//        hourOfDay = Math.max(hourOfDay, 23);

//        return Math.max(hourOfDay,23, Math.min(hourOfDay, 0));

        if ((barking==true) && (hourOfDay < 8) || (hourOfDay > 22))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean b = shouldWakeUp(true, 1);
        System.out.println(b);
        b = shouldWakeUp(false, 2);
        System.out.println(b);
        b = shouldWakeUp(true, 8);
        System.out.println(b);
        b = shouldWakeUp(true, -1);
        System.out.println(b);

    }


}
