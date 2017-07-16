package io.khasang.courses.model;

public class TrafficLight {
    private int greenTime;
    private int yellowTime;
    private int redTime;

    public TrafficLight(int greenTime, int yellowTime, int redTime) {
        this.greenTime = greenTime;
        this.yellowTime = yellowTime;
        this.redTime = redTime;
    }

    private String getColorByTime(int time) {
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
