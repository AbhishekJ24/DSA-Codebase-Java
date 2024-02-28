package Math;

import java.math.BigInteger;

public class WaterAndJugProblem {
    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if ((jug1Capacity + jug2Capacity) < targetCapacity)
            return false;
        BigInteger b1 = new BigInteger(jug1Capacity + "");
        BigInteger b2 = new BigInteger(jug2Capacity + "");
        BigInteger b = b1.gcd(b2);
        if (targetCapacity % b.intValue() == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canMeasureWater(1000,3000,6000));
    }
}