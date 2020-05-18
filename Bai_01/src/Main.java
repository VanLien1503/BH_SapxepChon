public class Main {
    public static void main(String[] args) {
       int arr[]={4,3,5,7,9,2,6,8};

       // sap xep chon
        for (int i=0;i<arr.length-1;i++){
            int arrindex=i;
            int arrmin = arr[i];
            for (int j=i+1;j<arr.length;j++){
                if (arrmin>arr[j]){
                    arrmin=arr[j];
                    arrindex=j;

                }
            }
            if (arrindex!=i){
                arr[arrindex]=arr[i];
                arr[i]=arrmin;
            }
        }
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
