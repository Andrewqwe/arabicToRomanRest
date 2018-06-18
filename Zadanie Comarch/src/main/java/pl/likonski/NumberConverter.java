package pl.likonski;

import java.util.Map;
import java.util.TreeMap;

public class NumberConverter {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    public enum ConversionTypes{
        ROMAN,HEX
    }
    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String convertNumber( int num, ConversionTypes type) {
        if (type == null) {
            return "Conversion type is null";
        }

        switch (type) {
            case HEX:
                return Integer.toHexString(num);
            case ROMAN: {
                if (num < 0) {
                    return "Negative numbers are not supported";
                }
                return arabicToRoman(num);
            }
            default:
                return "Unknown type of conversion";
        }
    }

    private static String arabicToRoman(int num){
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            Map.Entry<Integer, String> entry = map.floorEntry(num);
            num = num - entry.getKey();
            stringBuilder.append(entry.getValue());
        }
        return stringBuilder.toString();
    }
}
