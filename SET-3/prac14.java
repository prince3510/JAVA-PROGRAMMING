import java.util.*;

class Date {
    int year;
    int month;
    int day;
    Scanner S1 = new Scanner(System.in);

    void getDate() {
        day = S1.nextInt();
    }

    void getMonth() {
        month = S1.nextInt();
    }

    void getYear() {
        year = S1.nextInt();
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);

    }

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
}

class prac14 {
    public static void main(String[] args) {
        Date d1 = new Date(28, 07, 2005);
        d1.displayDate();
        System.out.print("\nName : PRINCE MALAVIYA_23DCS057 ");

    }
}