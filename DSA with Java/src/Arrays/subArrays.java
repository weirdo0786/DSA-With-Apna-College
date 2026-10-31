package Arrays;
public class subArrays {
    static void main(String[] args) {
                int[] arr = {2,4,6,8,10};
                int n = arr.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print("(");
                        for (int k = i; k <= j; k++) {
                            System.out.print(arr[k] + " ");
                        }
                        System.out.print(")");
                        System.out.println();
                    }
                }
    }
}
