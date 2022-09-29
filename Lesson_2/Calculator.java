public class Calculator {

    public int calculate(int num1, int num2, char sign) {
        int result = 0;
        switch(sign) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = sub(num1, num2);
                break;
            case '*':
                result = mul(num1, num2);
                break;
            case '/':
                result = div(num1, num2);
                break;
            case '^':
                result = pow(num1, num2);
                break;
            case '%':
                result = mod(num1, num2);
                break;
        }
        return result;
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int sub(int num1, int num2) {
        return num1 - num2;
    }

    private int mul(int num1, int num2) {
        return num1 * num2;
    }

    private int div(int num1, int num2) {
        return num1 / num2;
    }

    private int pow(int num1, int num2) {
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }

    private int mod(int num1, int num2) {
        return num1 % num2;
    }
}