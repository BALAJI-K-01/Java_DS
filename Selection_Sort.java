package Java_DS;

public class Selection_Sort {
    public static void main(String[] args) {
    
    
    int arr[] = {9,5,2,7,8};

    for(int i=0;i<arr.length;i++){

        int min = arr[i];
        int index = i;

        for(int j=i;j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
                index =j;
            }
        }
//Swapping
        int temp = arr[i];
        arr[i] = min;
        arr[index] = temp;
    }
    for(int a:arr){
        System.out.print(a+", ");
    }
}
}
