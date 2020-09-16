package Lab0;
import java.lang.Math;

public class Main {

    /**
     *  A three-digit number is given. Print the number obtained by reading the original number from right to left.
     * @param data
     * @return reverse number
     */
    public static int integer(int data){//653
        return data/100+data/10%10*10+data%10*100;
    }

    /**
     *  Three integers are given: A, B, C. Check if statement is true: "Each of the numbers A, B, C is positive."
     * @param three numbers
     * @return true or false
     */
    public static boolean booleanMethod(int data1, int data2, int data3){
        if (data1>0 && data2>0 && data3>0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *  Three numbers are given. Find the smallest one.
     * @param three numbers
     * @return number
     */
    public static int ifMethod(int data1, int data2, int data3){
        if (data1<data2 && data1<data3){
            return data1;
        }
        else if(data2<data3){
            return data2;
        }
        else{
            return data3;
        }
    }
    /**
     *  An integer N (> 0) is given. Find a product 1.1 · 1.2 · 1.3 · ...
     * @param number
     * @return factorial
     */
    public static int forMethod(int data1){
        int fact=1;
        for (int i=2;i<=data1;i++){
            fact*=i;
        }
        return fact;
    }

    /**
     *  An integer N (> 1) is given. Print the largest of the integers K,
     *  for which the sum 1 + 2 +… + K will be less than or equal to N, and this sum itself.
     * @param number
     * @return array
     */
    public static int[] whileMethod(int data1){
        int i=1,sum = 0;
        int res[] = {1,1};
        while (i<=data1){
            sum+=i;
            if(sum>data1){
                res[0] = i - 1;
                res[1] = sum - i;
                return res;
            }
            i++;
        }
        return res;
    }

    /**An array A of size N (N is an even number) is given.
     * Print its elements with even numbers in ascending order of numbers: A2, A4, A6,…, AN.
     * Do not use the conditional operator.
     * @param number
     * @return array
     */
    public static int[] arrayMethod(int data1){
        int i=1,sum = 0;
        int res[] = {1,1};
        while (i<=data1){
            sum+=i;
            if(sum>data1){
                res[0] = i - 1;
                res[1] = sum - i;
                return res;
            }
            i++;
        }
        return res;
    }

    /**The elements of the circle are numbered as follows:
     * 1 - radius R, 2 - diameter D = 2 · R, 3 - length L = 2 · p · R, 4 - area of the circle S = p · R2.
     * Given the number of one of these elements and its value.
     * Print the values of other elements of this circle (in the same order). As n use 3.14.
     * @param numbers
     * @return array
     */
    public static float[] caseMethod(int num, float data){
        float res[] = {0,0,0,0};
        switch (num){
            case 1:
                res[0] = data;
                res[1] = data*2f;
                res[2] = data*2f*3.14f;
                res[3] = data*data*3.14f;
                return res;
            case 2:
                res[0] = data/2f;
                res[1] = data;
                res[2] = data*3.14f;
                res[3] = data*data*3.14f/4;
                return res;
            case 3:
                res[0] = data/2f/3.14f;
                res[1] = data/3.14f;
                res[2] = data;
                res[3] = data*data/4f/3.14f;
                return res;
            case 4:
                res[0] = (float)Math.sqrt(data/3.14f);
                res[1] = (float)Math.sqrt(data/3.14f*4f);
                res[2] = (float)Math.sqrt(data/3.14f)*2f*3.14f;
                res[3] = data;
                return res;
            default:
                return res;
        }
    }

    /**
     * You are given an integer N and a set of N numbers.
     * Find the smallest positive number from the given set.
     * If there are no positive numbers in the set, then output 0.
     * @param numbers
     * @return reverse number
     */
    public static int minmaxMethod(int N, int[] data){
        int max=0;
        for (int i=0;i<N;i++){
            if (data[i]>max)max = data[i];
        }
        return max;
    }

    /**
     * You are given an array A of size N (N is an even number).
     * Print its even-numbered elements in ascending order of numbers: A2, A4, A6,…, AN.
     * Do not use the conditional operator.
     * @param numbers
     * @return numbers
     */
    public static int[] arrayMethod(int[] data){
        int intArray[];    //declaring array
        intArray = new int[data.length/2];  // allocating memory to array
        for (int i=1;i<data.length;i+=2){
            intArray[i/2] = data[i];
        }
        return intArray;
    }

    /**
     * Given a matrix of size M r N. Print its elements in the following order:
     * first column from top to bottom, second column from bottom to top, third column from top to bottom, fourth column from bottom to top, etc.
     * @param numbers
     * @return numbers
     */
    public static int[][] matrixMethod(int n, int m, int[][] data){
        int array[][];    //declaring array
        array = new int[n][m];  // allocating memory to array
        for (int i=0;i<n;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = data[i][j];
                }
            }
            else{
                for (int j = 0; j < m; j++) {
                    array[i][j] = data[i][m-j-1];
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
    //    System.out.println(integer(391));
    //   System.out.println(booleanMethod(1,2,-3));
    //   System.out.println(ifMethod(1,2,3));
    //   System.out.println(forMethod(10));
    //   int a[] = whileMethod(16);
    //   System.out.println(a[0] + " " + a[1]);
    //    float a[] = caseMethod(4,1f);
    //    System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
    //    int a[] = {1,2,3};
    //    System.out.println(minmaxMethod(3,a));
    //        int a[] = {1,2,3,4,5,6};
    //        int b[] = arrayMethod(a);
    //        for(int i=0;i<b.length;i++)System.out.println(b[i]);
        int a[][] = {{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
        int b[][] = matrixMethod(4,3,a);
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 3; j++) {System.out.print(b[i][j]);}
            System.out.println();}
    // write your code here
    }
}
