package wordle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class SimpleTimer {

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

    public SimpleTimer() {
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

        counterLabel.setText("00:00:00");
        second =0;
        minute = 0;
        hour = 0;
        SimpleTimer();
        timer.start();
    }
    public void SimpleTimer() {
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second++;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                ddHour = dFormat.format(hour);
                counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);


                if(second==60) {
                    second = 0;
                    minute++;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
                } if(minute==60) {
                    minute = 0;
                    hour++;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
                }

            }
        });

    }


    public static void main(String[] args) {
        new SimpleTimer();
    }
}
