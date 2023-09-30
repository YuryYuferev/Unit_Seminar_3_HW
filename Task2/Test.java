package Task2;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.runTests();
    }

    public void runTests() {
        // Проверка чисел, находящихся в интервале
        System.out.println(numberInInterval(30));    // true
        System.out.println(numberInInterval(50));    // true
        System.out.println(numberInInterval(99));    // true

        // Проверка чисел, находящихся вне интервала
        System.out.println(numberInInterval(10));    // false
        System.out.println(numberInInterval(24));    // false
        System.out.println(numberInInterval(101));   // false
    }

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}