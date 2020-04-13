package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {


    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int a = 100;
            public void run() {
                System.out.println("Time: " + a);
                a--;
            }
        };
        timer.schedule(timerTask, 0, 1000);
	// the first number is tyme when it start, the second - how long is one step
	// 1000 corresponds to one second
    }
}