import java.util.Arrays;
import java.util.LinkedHashSet;

public class Printer {
    void write(String msg, Integer output) {
        IO.println(msg + " (Output: " + output.toString() + ")");
    }

    void write(String msg, Integer[] output) {
        IO.println(msg + " (Output: " + Arrays.toString(output) + ")");
    }

    void write(String msg, LinkedHashSet<Integer> output) {
        IO.println(msg + " (Output: " + output + ")");
    }
}
