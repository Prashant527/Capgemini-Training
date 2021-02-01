import java.util.Arrays;  
class BubbleSort{

    public int[] bubbleSort(int arr[]) {
        int i,j,size,temp;
        size=arr.length;
        for(i=0;i<size-1;i++){
            for(j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        return arr;
        
        
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}