public class Binary_to_Decimal {
    public static long binarytodecimal(long num) {
        int i = 0;
        long remainder = 0;
        long ans = 0;
        while (num != 0) {
            remainder = num % 10;
            ans = ans + (remainder * (long) Math.pow(2, i));
            num = num / 10;
            i++;
        }
        return ans;
    }

    public static int binarytodecimal1(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static void main(String[] args) {
        long a = binarytodecimal(1111);
        String b=Integer.toString(1111);
        int c=binarytodecimal1(b);
        System.out.println(c);
    }
}
