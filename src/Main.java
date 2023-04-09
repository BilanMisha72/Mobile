public class Main {
    public static void main(String[] args) {

        int remainder = 200; //остаток
        int payment = 1300; //платеж
        int percent = 0;
        if (payment > 1000) {
            percent = 1;
        }
        int bonus = (payment / 100) * percent;

        int balance = (remainder + payment + bonus);
        System.out.println(balance);
    }

}
