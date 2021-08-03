package dataStructures;

class VariousSorting{
	//Bubble Sort : O(n^2)
	public int[] bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swapping=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapping=true;
					swap(arr,j,j+1);
				}
			}
			if(!swapping)
				break;
		}
		return arr;
	}
	void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	//Insertion Sort : O(n^2)        
	public int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	
	//Selection Sort
	public int[] selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			if(min!=i) {
				swap(arr,min,i);
			}
		}
		return arr;
	}
	
	public void display(int[] arr) {
		for(int num:arr)
			System.out.print(num+" ");
	}
}
public class Sorting {

	public static void main(String[] args) {
		int[] arr= {2,43,1,34,90,67,12};
		VariousSorting obj=new VariousSorting();
		//obj.bubbleSort(arr);
		//obj.insertionSort(arr);
		obj.selectionSort(arr);
		obj.display(arr);
		

	}

}
