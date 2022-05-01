public class OddEven {

    public String IsOddOrEven(int num) {
        if (num % 2 == 0) {
            return "Odd";
        }
        else if (num % 2 != 0) {
            return "Even";
        }
        else {
            return "Undefined";
        }
    }
}
