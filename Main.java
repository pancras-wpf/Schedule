package 日程表;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(10,20));
        System.out.println(myCalendar.book(15,30));
        System.out.println(myCalendar.book(30,40));

    }
}

class MyCalendar {
    ArrayList<int[]> date = new ArrayList<>();
    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        if(start >= end)
            return false;
        for (int i = 0; i < date.size(); i++) {
            if ((start >= date.get(i)[0] && start < date.get(i)[1]) || (end > date.get(i)[0] && end <= date.get(i)[1]) || (start <= date.get(i)[0] && end >= date.get(i)[1]))
                return false;
        }
        int[] mycalender = new int[]{start,end};
        date.add(mycalender);
        return true;
    }
}
