/*The approach used here is to store based on the key value pair */
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Age {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }
        int b = scan.nextInt();
        if (b <= 10) {
            map.put(0, (map.get(1)) + 1);
        } else {
            map.put(b / 10, (map.get(b / 10)) + 1);
        }
        System.out.println("AgeGrp - Total number of People");
        System.out.println("1-10" + "  " + map.get(0));
        System.out.println("11-20" + "  " + map.get(1));
        System.out.println("21-30" + " " + map.get(2));
        System.out.println("31-40" + "  " + map.get(3));
        System.out.println("41-50" + "  " + map.get(4));
        System.out.println("51-60" + "  " + map.get(5));
        System.out.println("61-70" + "  " + map.get(6));
        System.out.println("71-80" + "  " + map.get(7));
        System.out.println("81-90" + "  " + map.get(8));
        System.out.println("91-100" + "  " + map.get(9));

    }
}