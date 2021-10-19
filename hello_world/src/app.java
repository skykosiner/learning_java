public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String Nice = math(6,9,6,9) + "\nNice";
        System.out.println(Nice);
    };

    private static int math(int num1, int num2, int num3, int num4) {
        return num1 * num2 + num3 + num4;
    };
};
