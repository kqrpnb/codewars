package codewars;
// kata: https://www.codewars.com/kata/55fd2d567d94ac3bc9000064

public class RowSumOddNumbers {

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));
    }
    public static int rowSumOddNumbers(int n) {
        return n*n*n;
    }
    public static int rowSumOddNumbersAlt(int n) {


        int num1 = -1;
        int num2 = -1;
        int inner = 0;
        int outer = 0;
        int sumLastRow = 0;

        for (int i = n; i>0; i--) {
            for (int j = i-1; j>0; j--) {
                num1 += 2;
                inner += num1;
            }
            for (int j = i; j>0; j--) {
                num2 += 2;
                outer += num2;
            }

            sumLastRow = outer - inner;
        }
        return sumLastRow;
    }
}