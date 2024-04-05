package lessn_4;

public class Task {
    public static void main(String[] args) {
        // rN % 5 fizz
        // rN % 3 buzz
        // rN % 5 и 3 fizzBuzz

        int random = 16;

        if (random % 5 == 0) {
            System.out.print("fizz");
        } else {
            System.out.print("something today not fizz");
        }

        System.out.print(random % 2 == 0 ? "buzz" : "something today not buzz");
    }
}
