package wordle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;


public class CountdownClock {

    Timer timer;
    JFrame window;
    JLabel counterLabel;
    int second;
    int minute;
    int hour;
    DecimalFormat dFormat = new DecimalFormat("00");
    String ddSecond;
    String ddMinute;
    String ddHour;

    Font font1 = new Font("Arial", Font.PLAIN, 70);

    public CountdownClock() {
    window = new JFrame();
    window.setSize(800,600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);


    counterLabel = new JLabel();
    counterLabel.setBounds(300, 230, 400, 100);
    counterLabel.setHorizontalAlignment(JLabel.CENTER);
    counterLabel.setFont(font1);

    window.add(counterLabel);
    window.setVisible(true);

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime now = ZonedDateTime.now(zone);
        ZonedDateTime midnight = now.toLocalDate().plusDays(1).atStartOfDay(zone);
        long secondsLeftTillMidnight = Duration.between(now, midnight).getSeconds();
        secondsLeftTillMidnight = secondsLeftTillMidnight * 1000;
        long midnighthours = TimeUnit.MILLISECONDS.toHours(secondsLeftTillMidnight);
        secondsLeftTillMidnight -= TimeUnit.HOURS.toMillis(midnighthours);
        long midnightminutes = TimeUnit.MILLISECONDS.toMinutes(secondsLeftTillMidnight);
        secondsLeftTillMidnight -= TimeUnit.MINUTES.toMillis(midnightminutes);
        long midnightseconds = Math.round(TimeUnit.MILLISECONDS.toSeconds(secondsLeftTillMidnight));


        second = (int) midnightseconds;
        minute = (int) midnightminutes;
        hour = (int) midnighthours;
        String stringhour = String.valueOf(hour);
        String stringminute = String.valueOf(minute);
        String stringsecond = String.valueOf(second);
        counterLabel.setText(stringhour + ":" + stringminute + ":" + stringsecond);
        countdownTimer();
        timer.start();
        try {
            boolean done = false;
            while (!done) {
                Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
                try {
                    InputStream inStream = s.getInputStream();
                    Scanner in = new Scanner(inStream);
                    String newline = " ";
                    while (in.hasNextLine()) {
                        String line = in.nextLine();
                        newline = line;

                    }
                    if (newline.substring(15,20).equals("04:00")) {
                        System.out.println("Times up");
                        timer.stop();
                        counterLabel.setText("24:00:00");
                        second =0;
                        minute = 0;
                        hour = 24;
                        countdownTimer();
                        timer.start();
                    }
                    try {
                        Thread.sleep(60000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    s.close();
                }
            }
        }
        catch(IOException ioexc)
        {
            ioexc.printStackTrace();
        }

    }
    public void countdownTimer() {
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                ddHour = dFormat.format(hour);
                counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);


                if(second==-1) {
                    second = 59;
                    minute--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
                } if(minute==-1) {
                    minute = 59;
                    hour--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
                }
                if(hour==0 && minute==0 && second==0) {
                    timer.stop();
                }
            }
        });

    }


    public static void main(String[] args) {
        new CountdownClock();
    }
}
