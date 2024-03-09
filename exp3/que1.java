package exp3;

class Date {
    private int year, date, hrs, min, sec;
    private int month;

    void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    void setDate(int year, int month, int date, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }

    void setDate(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    void display() {
        System.out.println(date + "/" + month + "/" + year + " Time: " + hrs + ":" + min + ":" + sec);
    }

    Date() {
        year = 2000;
        month = 1;
        date = 01;
        hrs = 00;
        min = 00;
        sec = 00;
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.display();
        d1.setDate(2005, 3, 31);
        d1.display();
        d1.setDate(2004, 4, 30, 4, 40);
        d1.display();
        d1.setDate(2003, 5, 21, 6, 20, 32);
        d1.display();
    }
}
