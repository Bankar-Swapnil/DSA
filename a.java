import java.util.*;

public class a {

    public static boolean isTriangular(int num) {
        int n = (int) Math.sqrt(2 * num);
        return n * (n + 1) / 2 == num;
    }

    public static int moneyForWorkers(List<Integer> weights, int N, int K) {
        Set<Integer> triangularNumbers = new HashSet<>();
        for (int i = 1; i <= Collections.max(weights); i++) {
            triangularNumbers.add(i * (i + 1) / 2);
        }

        int consecutiveCycles = 0;
        int totalMoney = 0;

        while (consecutiveCycles < K) {
            List<Integer> selectedBoxes = new ArrayList<>(weights.subList(0, N));
            int minBox = Collections.min(selectedBoxes);
            int minIndex = selectedBoxes.indexOf(minBox);
            weights.remove(minIndex);
            weights.add(minBox);

            if (!triangularNumbers.contains(minBox)) {
                consecutiveCycles = 0;
                totalMoney += minBox;
            } else {
                consecutiveCycles++;
            }
        }

        return totalMoney;
    }

    public static void main(String[] args) {
        List<Integer> weights = Arrays.asList(7, 3, 6, 9, 10, 2, 4, 11, 5, 12, 17, 1);
        int N = 3;
        int K = 2;
        int result = moneyForWorkers(new ArrayList<>(weights), N, K);
        System.out.println(result);
    }
}