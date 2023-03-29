import java.util.*;

public class DestinationCity {

    public static String destCity(String[][] input) {

        int index;
        HashMap outDegree = new HashMap();
        if (input.length == 1) {
            return input[0][1];
        }
        for (index = 0; index < input.length; index++) {
            if (!outDegree.containsKey(input[index][0])) {
                outDegree.put(input[index][0], 1);
            }
        }
        for (index = 0; index < input.length; index++) {
            if (!outDegree.containsKey(input[index][1])) {
                return input[index][1];
            }
        }
        return input[0][1];
    }

    public static void main(String[] args) {
        String[][] input = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
        System.out.print("Destination city is : " + destCity(input));
    }
}