import java.util.ArrayList;
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length < 2) return a;
        int [] firstHalf = new int [a.length / 2];
        int [] secondHalf = new int [a.length - firstHalf.length];
        for (int i = 0; i < a.length; i++) {
            if (i < firstHalf.length) {
                firstHalf [i] = a[i];
            }
            else {
                for (int j = 0; j < secondHalf.length; j++) {
                    secondHalf[j] = a[i++];
                }
            }
        }
        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);
        return join (firstHalf, secondHalf);
    }

    public static int[] join(int[] firstArr, int[] secondArr) {
        int [] resArr = new int[firstArr.length + secondArr.length];
        int i = 0, j = 0, k = 0;
        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] <= secondArr[j]) {
                resArr[k++] = firstArr[i++];
            }
            else {
                resArr[k++] = secondArr[j++];
            }
        }
        while (i < firstArr.length) {
            resArr[k++] = firstArr[i++];
        }
        while (j < secondArr.length) {
            resArr[k++] = secondArr[j++];
        }
        return resArr;
    }
}

public class Printer1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4};
        } 
        else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}