package designingClasses.classes;


public class TimeClient {



    public static void main(String[] args) {
        //Time time = new Time();
        Time time = new Time(11, 59, 59.9);

        System.out.println(time);
        System.out.println(time.getHour());
        System.out.printf("%02d:%02d:%04.1f\n",
                time.getHour(), time.getMinute(), time.getSecond());


        Time time1 = new Time(9, 30, 0.0);
        Time time2 = time1;
        Time time3 = new Time(9, 30, 0.0);


        System.out.println(time1.equals(time3));


        Time startTime = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);

        Time endTime = Time.add(startTime, runningTime);

        System.out.println(endTime.toString());

        Time endTime2 = startTime.add(runningTime);

        System.out.println(endTime2.toString());
    }



}
