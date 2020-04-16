package model;

public class BinaryCalculator {

    public String binaryAdd(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }


    public String binarySubtract(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) - Integer.parseInt(b, 2));
    }


    public String binaryMultiply(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }


    public String binaryDivide(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) / Integer.parseInt(b, 2));
    }

}
