package arrayExmpl;

public class FindSmallestNumber {

    public static void main(String[] args) {

        int arr[]={9,5,8,10};

        int S=arr[0];

        for(int i=0;i<arr.length;i++){
            if(S>arr[i]){
                S=arr[i];
            }
        }
        System.out.println("Smallest : "+S);
    }
}
