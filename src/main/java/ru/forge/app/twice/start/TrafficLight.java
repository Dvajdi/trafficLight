package ru.forge.app.twice.start;

public class TrafficLight extends Thread{
  private boolean isRunning = true;
  private final int greenTime;
  private final int yellowTime;
  private final int redTime;

  public TrafficLight(int greenTime, int yellowTime, int redTime) {
    this.greenTime = greenTime;
    this.yellowTime = yellowTime;
    this.redTime = redTime;
  }

  void stopRunning() {
    isRunning = false;
  }

  public void run(){
    while (isRunning){
      try {
        changeColor("Зеленый",greenTime);
        changeColor("Желтый",yellowTime);
        changeColor("Красный",redTime);
      }catch(InterruptedException e){
        currentThread().interrupt();
        System.out.println("some problem in thread");
     }
    }
  }

  private void changeColor(String color, int time) throws InterruptedException{
    if(isRunning) {
      System.out.println(color);
      for (int i = 0; i < time * 60; i++) {
        if (!isRunning) {
          break;
        }
        sleep(1000);
      }
    }
  }

}
