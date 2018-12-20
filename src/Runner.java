import java.util.Arrays;

public class Runner {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[][] diverseArr2D = {{3,6,7,3},{2,5,6,3},{3,6,2,11},{12,1,3,5}};
        int[][] nondiverseArr2D = {{1,1,1,1},{1,1,1,1},{1,2,1,1},{1,1,3,4}};
        System.out.println("1D Array Sum: " + arraySum(arr));
        System.out.println("First 2D Array Row Sums: " + Arrays.toString(rowSums(diverseArr2D)));
        System.out.println("Is the first 2D array diverse: " + isDiverse(diverseArr2D));
        System.out.println("Second 2D Array Row Sums: " + Arrays.toString(rowSums(nondiverseArr2D)));
        System.out.println("Is the second 2D array diverse: " + isDiverse(nondiverseArr2D));
    }


    public static int arraySum(int[] arr){
        int sum = 0;
        for(int cheese: arr){
            sum+=cheese;
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D){
        int[] sumArr = new int[arr2D.length];
        for(int i =0; i < arr2D.length;i++){
            sumArr[i] = arraySum(arr2D[i]);
        }
        return sumArr;
    }
    public static boolean isDiverse(int[][] arr2D){
        int[]sumArr = rowSums(arr2D);
        for (int i = 0; i < sumArr.length;i++){
            for(int j = i+1; j < sumArr.length;j++){
                if(sumArr[i] == sumArr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
