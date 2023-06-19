package subjects.commandLineArgument;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        args = new String[]{"10", "-3", "55","0","14"};
        System.out.println(Arrays.toString(args));


        int max = Integer.MIN_VALUE;

        if (args.length == 0) {
            System.err.println("Usage: java Max <numbers>");
            return;
        }

        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);


    }
}
