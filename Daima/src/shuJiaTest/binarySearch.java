package shuJiaTest;

public class binarySearch {
public static int binarySearch(int[] arr,int toFind){
   int left=0;
   int right=arr.length-1;
   while (left<right){
       int mid=(left+right)/2;
       if (toFind>arr[mid]){
           left=mid+1;
       }else if (toFind<arr[mid]){
           right=mid-1;
       }else {
           return mid;
       }
   }
   return -1;
}
}
