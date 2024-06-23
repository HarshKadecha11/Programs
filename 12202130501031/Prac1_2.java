class Prac1_2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        char ch = args[1].charAt(0);
        int y = Integer.parseInt(args[2]); 
        int res = 0 ; 
        switch(ch) {
            case '+':
                res = x + y;
                System.out.println("Addition of " + x + " and " + y + " is " + res);
                break;
            case '-':
                res = x - y;
                System.out.println("Subtraction of " + x + " and " + y + " is " + res);
                break;
            case '*':
                res = x * y;
                System.out.println("Multiplication of " + x + " and " + y + " is " + res);
                break;
            case '/':
                res = x / y;
                System.out.println("Division of " + x + " and " + y + " is " + res);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}