package model;

public class HexadecimalCalculator {

    public String hexadecimalAdd(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a, 16) + Integer.parseInt(b, 16));
    }


    public String hexadecimalSubtract(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a, 16) - Integer.parseInt(b, 16));
    }


    public String hexadecimalMultiply(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a, 16) * Integer.parseInt(b, 16));
    }


    public String hexadecimalDivide(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a, 16) / Integer.parseInt(b, 16));
    }

}
