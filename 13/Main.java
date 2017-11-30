package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {


    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int a = 100;
            public void run() {
                System.out.println("Время: " + a);
                a--;
            }
        };
        timer.schedule(timerTask, 0, 800);//первое число - когда он
//запуститься, второе - через сколько будет повторяться

    }
}
