package ua.com.alevel.util;

public final class AccelerationUtil {
    private static final double GRAVITY_CONST = 6.6720 * Math.pow(10, -11);

    public static double freeFallAcceleration(double radius, double weight) {
        return GRAVITY_CONST * weight / Math.pow(radius, 2);
    };
}
