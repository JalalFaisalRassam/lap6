public class exe2 {
    public static void main(String[] args) {
        int sum1=0,sum2=0,sum3=0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0)
                sum1+=i;
            else
                sum2+=i;

        }
        System.out.println("the even sum is  "+sum1);
        System.out.println("the odd sum is  "+sum2);
    }

}
