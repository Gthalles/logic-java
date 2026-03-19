import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;

public class Printer {
    void write(String msg, Integer output) {
        System.out.println(msg + " (Output: " + output.toString() + ")");
    }

    void write(String msg, Integer[] output) {
        System.out.println(msg + " (Output: " + Arrays.toString(output) + ")");
    }

    void write(String msg, LinkedHashSet<Integer> output) {
        System.out.println(msg + " (Output: " + output + ")");
    }

    void write(String msg, Map<?, ?> output) {
        System.out.println(msg + " (Output: " + output + ")");
    }

    void write(String msg, String output) {
        System.out.println(msg + " (Output: " + output + ")");
    }

    void write(String msg, boolean output) {
        System.out.println(msg + " (Output: " + output + ")");
    }
}
