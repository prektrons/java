
class Prime {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3;
        for (num1 = 1; num1 < 101; num1++)
            System.out.println(num1);
        for (num2 = 1; num2 < 101; num1++)
            System.out.println(num2);
        num3 = num2 % num1;
        if (num3 == 0)
            System.out.println("The prime numbers are " + num1);
        else
            System.out.println("The prime numbers are " + (num1 += 1));
    }
}