package ru.forge.app.twice.start;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game {
  public static final int GREEN_TIME=2;
  public static final int YELLOW_TIME=3;
  public static final int RED_TIME=5;

  public static void main(String[] args) {
    startWorkTrafficLight(GREEN_TIME,YELLOW_TIME,RED_TIME);
  }

  private static void startWorkTrafficLight(int greenTime,int yellowTime, int redTime){
    System.out.println("\t\t!!\t\tДля прерывания или изменения работы светофора нажмите Enter\t\t!!");
    TrafficLight trafficLight = new TrafficLight(greenTime, yellowTime, redTime);
    trafficLight.start();
    stopOrChangeGame(trafficLight);
  }

  private static void changePropertiesAndStartWorkTrafficLight(){
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    System.out.print("введите время работы зеленого цвета светофора,мин: ");
    int greenTime = getTimeFromKeyboard(reader);
    System.out.print("введите время работы желтого цвета светофора,мин: ");
    int yellowTime = getTimeFromKeyboard(reader);
    System.out.print("введите время работы красного цвета светофора,мин: ");
    int redTime = getTimeFromKeyboard(reader);

    startWorkTrafficLight(greenTime,yellowTime,redTime);
  }

  private static void stopOrChangeGame(TrafficLight trafficLight){
    try{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      reader.readLine();
      trafficLight.stopRunning();
      changePropertiesAndStartWorkTrafficLight();
    }catch(Exception e){
      e.printStackTrace();
    }

  }

  private static int getTimeFromKeyboard(BufferedReader reader){
    int time=0;
    boolean isNotRightInputValue;
    do {
      try {
        isNotRightInputValue=false;
        time = Integer.parseInt(reader.readLine());
      } catch (Exception e) {
        System.out.println("Введите число, пожалуйста");
        isNotRightInputValue=true;
      }
    }while(isNotRightInputValue);
    return time;
  }
}
