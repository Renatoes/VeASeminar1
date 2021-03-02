package javasem01;
import java.lang.Math;

public class Seminar_1_PART2 {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double x = 0.5 * (gravity*Math.pow(fallingTime,2)) + initialVelocity*fallingTime + initialPosition;
        System.out.println("Pos in " + fallingTime + "sec :" + finalPosition + "x :" + x);
    }
}
//x(t) = 0.5 × a*t^2 + v_0*t + x_0
