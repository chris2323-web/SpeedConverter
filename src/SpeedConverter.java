public class SpeedConverter {

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");

        }
        else
        {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "km/h= "+ milesPerHour +
                    "mi/h");
        }

    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    private int limit;
    private int speed;

    public SpeedConverter(int limit, int speed) {
        this.limit = limit;
        this.speed = speed;
    }
}
