package kotik1;

public class Kotik {
    static int count = 0;

    public static int liveAnotherDay() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {

            int num = liveAnotherDay();
            System.out.println(num);
        }

    }
}




