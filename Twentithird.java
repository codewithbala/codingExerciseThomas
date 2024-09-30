public class Twentithird {
    //Write a program to merge two sorted arrays.
    public static int[] mergeArrays(int[] ar1, int[] ar2) {
        int[] ans = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        int n1 = ar1.length;
        int n2 = ar2.length;

        while (i < n1 && j < n2) {

            if (ar1[i] < ar2[j])
                ans[k++] = ar1[i++];
            else
                ans[k++] = ar2[j++];
        }

        while (i < n1)
            ans[k++] = ar1[i++];

        while (j < n2)
            ans[k++] = ar2[j++];

        return ans;
    }

}
