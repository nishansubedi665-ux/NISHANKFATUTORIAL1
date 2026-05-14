class Operator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;


        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));


        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
    }
}
