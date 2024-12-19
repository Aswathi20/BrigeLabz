package logicalprograms;

public class CouponNumbers {

   
    public static int getDistinctCoupons(int N) {
        int[] coupons = new int[N];  
        int randomCount = 0;  
        int distinctCount = 0;  

         
        for (int i = 0; distinctCount < N; i++) {
            randomCount++;  
            int coupon = i % N;   

            
            boolean isDuplicate = false;
            for (int j = 0; j < distinctCount; j++) {
                if (coupons[j] == coupon) {
                    isDuplicate = true;  
                    break;
                }
            }

            
            if (!isDuplicate) {
                coupons[distinctCount] = coupon;
                distinctCount++;
            }
        }

        return randomCount;  
    }

    public static void main(String[] args) {
        int N = 10;  
        int totalAttempts = getDistinctCoupons(N);

        System.out.println("Total attempts made to collect " + N + " distinct coupons: " + totalAttempts);
    }
}
