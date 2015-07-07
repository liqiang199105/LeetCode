package BasicAlgorithms;

/**
 * Created by liqiang on 15-7-6.
 */
public class MergeSorting {
    public static void main(String []args){
        int []arr = {2, 1, 4, 5, 7, 100, 20, 35};
        int []arrTmp = new int[arr.length];
        MergeSorting mergeSorting = new MergeSorting();
        mergeSorting.mergeSort(arr, arrTmp, 0, arr.length - 1);
        for(int i = 0; i < arr.length - 1; i++ ){
            System.out.println(arrTmp[i]);

        }

    }
    public void mergeSort(int []arr, int[] arrTmp, int left, int right){
        if (left < right){
            int middle = (left + right) >>  1;
            mergeSort(arr, arrTmp, left, middle);
            mergeSort(arr, arrTmp, middle + 1, right);
            merge(arr, arrTmp, left, right, middle);
        }

    }
    public void merge(int []arr, int []arrTmp, int left, int right, int middle){
        // 将数组存入临时数组
        for(int i = left; i < right; i++){
            arrTmp[i] = arr[i];
        }
        int index1 = left;
        int index2 = right + 1;
        int i = left;
        while (index1 < left && index2 < right){
            arr[i++] = (arrTmp[index1]  < arrTmp[index2]) ? arrTmp[index1] : arrTmp[index2];
        }
        while (index1 <= middle){
            arr[i++] = arrTmp[index1++];
        }
        while (index2 <= right){
            arr[i++] = arrTmp[index2++];
        }
    }
}
