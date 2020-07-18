import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            String input=scanner.nextLine();
            char[]arr=input.toCharArray();
            reverse(arr,0,arr.length);
            int fan=0;
            int zheng=0;
            for (int i = 0; i <=arr.length ; i++) {
                if (i==arr.length||arr[i]==' '){
                    zheng=i-1;
                    reverse(arr,fan,zheng );
                    fan=i+1;

                }
            }
            System.out.println(String.valueOf(arr));
        }
    }

    private static void reverse(char[] arr, int f, int z) {
    int i=f;
    int j=z;
    while (i<j){
        char tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
        i++;
        j--;
    }
    }
}
