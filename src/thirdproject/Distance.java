package thirdproject;

import java.util.Map;
import java.util.TreeMap;

public class Distance {

    public String Distance(double x, double y) {
        Map<Double, String> map = new TreeMap<>();
        double t1 = Math.abs((0.1 * 500) - (x * 500)) + Math.abs((0.1 * 500) - (y * 500));
        map.put(t1, "t1");
        double t2 = Math.abs((0.1 * 500) - (x * 500)) + Math.abs((0.3 * 500) - (y * 500));
        map.put(t2, "t2");
        double t3 = Math.abs((0.1 * 500) - (x * 500)) + Math.abs((0.7 * 500) - (y * 500));
        map.put(t3, "t3");
        double t4 = Math.abs((0.1 * 500) - (x * 500)) + Math.abs((0.9 * 500) - (y * 500));
        map.put(t4, "t4");
        double t5 = Math.abs((0.3 * 500) - (x * 500)) + Math.abs((0.1 * 500) - (y * 500));
        map.put(t5, "t5");
        double t6 = Math.abs((0.3 * 500) - (x * 500)) + Math.abs((0.3 * 500) - (y * 500));
        map.put(t6, "t6");
        double t7 = Math.abs((0.3 * 500) - (x * 500)) + Math.abs((0.7 * 500) - (y * 500));
        map.put(t7, "t7");
        double t8 = Math.abs((0.3 * 500) - (x * 500)) + Math.abs((0.9 * 500) - (y * 500));
        map.put(t8, "t8");
        double t9 = Math.abs((0.7 * 500) - (x * 500)) + Math.abs((0.1 * 500) - (y * 500));
        map.put(t9, "t9");
        double t10 = Math.abs((0.7 * 500) - (x * 500)) + Math.abs((0.3 * 500) - (y * 500));
        map.put(t10, "t10");
        double t11 = Math.abs((0.7 * 500) - (x * 500)) + Math.abs((0.7 * 500) - (y * 500));
        map.put(t11, "t11");
        double t12 = Math.abs((0.7 * 500) - (x * 500)) + Math.abs((0.9 * 500) - (y * 500));
        map.put(t12, "t12");
        double t13 = Math.abs((0.9 * 500) - (x * 500)) + Math.abs((0.1 * 500) - (y * 500));
        map.put(t13, "t13");
        double t14 = Math.abs((0.9 * 500) - (x * 500)) + Math.abs((0.3 * 500) - (y * 500));
        map.put(t14, "t14");
        double t15 = Math.abs((0.9 * 500) - (x * 500)) + Math.abs((0.7 * 500) - (y * 500));
        map.put(t15, "t15");
        double t16 = Math.abs((0.9 * 500) - (x * 500)) + Math.abs((0.9 * 500) - (y * 500));
        map.put(t16, "t16");

        String tower = "t";
        return tower;
    }
}
