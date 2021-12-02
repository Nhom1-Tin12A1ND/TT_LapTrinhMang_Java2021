/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6lab5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class myObject {

    boolean flag = false;
    DateFormat df;
    int second;

    public synchronized void thoiGian() {
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        df = new SimpleDateFormat("HH:mm:ss");
        String format = df.format(new Date());
        System.out.println(format);
        second = Calendar.getInstance().get(Calendar.SECOND);
        flag = true;
        notifyAll();
    }

    public synchronized void kiemtra() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (second % 2 == 0) {
            System.out.println("giây số " + second + " là số chẵn");
        } else {
            System.out.println("giây số" + second + " là số lẻ");
        }
        flag = false;
        notifyAll();
    }
}
