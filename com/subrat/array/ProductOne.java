package com.subrat.array;
/*https://practice.geeksforgeeks.org/problems/minimum-steps-to-make-product-equal-to-one/1 */
public class ProductOne {
    public static void main(String[] args) {
    int N=3;
    int arr[]={-2,4,0};
    int res=makeProductOne(arr,N);
        System.out.println(res);
    }
    static int makeProductOne(int[] arr, int N) {
        int num_zero=0;
        int mul=1;
        int step=0;
        // code here
        for(int i=0;i<N;i++){
            if(arr[i]>0){
                step=step+(arr[i]-1);
                mul=mul*1;
            }else if(arr[i]<0){
                step=step+(-1-arr[i]);
                mul=mul*-1;
            }else{
                num_zero++;
                step=step+1;
            }
        }
        if(mul==1 || num_zero>0){
            return step;

        }else{
            return step+=2;
        }
    }
}
