class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
	int i,size,flag=0;
	size=arr.length;
	for(i=0;i<size;i++){
		if(arr[i]==toCheckValue){
		    flag=1;
		    break;
		}
		else{
		    flag=0;
		}
	}
	if(flag==1)
	 return true;
	else
	 return false;
}
}

public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,1,19,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
		SearchArray obj1=new SearchArray();
		System.out.println(obj1.searchArray(arr,valueToCheck));
	}
}
   
   