package Contests;

public class AngleBetweenHandsofaClock {
    public double angleClock(int hour, int minute) {

        double hourAngle = (hour % 12) * 30 + minute * 0.5;
        double minuteAngle = minute * 6;
        double angle = Math.abs(hourAngle-minuteAngle);
        if (angle > 180) {
            angle = 360 - angle;
        }return angle;
    }
}
