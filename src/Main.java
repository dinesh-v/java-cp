import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/contests/adobe-codiva/challenges/camera-purchase/problem
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] brands = new int[n];
        for (int brands_i = 0; brands_i < n; brands_i++) {
            brands[brands_i] = in.nextInt();
        }
        int[] prices = new int[n];
        for (int prices_i = 0; prices_i < n; prices_i++) {
            prices[prices_i] = in.nextInt();
        }
        int totalBuyers = in.nextInt();
        for (int currentBuyer = 0; currentBuyer < totalBuyers; currentBuyer++) {
            int d = in.nextInt();
            int[] cameras = new int[d];
            for (int cameras_i = 0; cameras_i < d; cameras_i++) {
                cameras[cameras_i] = in.nextInt();
            }
            int k = in.nextInt();
            // Case 3: If user's choice is to buy only 1 camera and it's node in store
            if (cameras.length == 0 || !contains(brands, cameras[0])) {
                System.out.println(-1);
            } else { // Case 1: User chooses one brand only & we have it in store
                List<Integer> entireBrandList = new ArrayList<>();
                for (int camera : cameras) {
                    if (contains(brands, camera)) {
                        List<Integer> myList = getPrices(brands, prices, camera);
                        if (myList != null) entireBrandList.addAll(myList);
                    }
                }
                if (entireBrandList.size() == 0) System.out.println(-1);
                else {
                    Collections.sort(entireBrandList);
                    if (k > entireBrandList.size()) System.out.println(-1);
                    else
                        System.out.println(entireBrandList.get(k - 1));
                }
            }
        }
        in.close();
    }

    private static boolean contains(int[] array, int key) {
        if (array.length == 0) return false;
        for (int anArray : array) {
            if (anArray == key) return true;
        }
        return false;
    }

    private static List<Integer> getPrices(int[] brands, int[] prices, int cameraBrand) {
        if (brands.length == 0) return null;
        List<Integer> myChoicePrices = new ArrayList<>();
        for (int i = 0; i < brands.length; i++) {
            if (brands[i] == cameraBrand) myChoicePrices.add(prices[i]);
        }
        return myChoicePrices;
    }
}
