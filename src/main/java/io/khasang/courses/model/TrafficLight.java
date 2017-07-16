package io.khasang.courses.model;

public class TrafficLight {
    private int greenTime = 2;
    private int yellowTime = 3;
    private int redTime = 4;

    public String getColorByTime(int time) {
        String answer;
        int timeForCheck = time % (greenTime + yellowTime + redTime);
        if (timeForCheck <= greenTime) {
            answer = "green light";
        } else {
            if (timeForCheck <= (greenTime + yellowTime)) {
                answer = "yellow light";
            } else {
                answer = "red light";
            }
        }
        return answer;
    }

    public void showColorByTime(int time) {
        System.out.println(getColorByTime(time));
    }
}
