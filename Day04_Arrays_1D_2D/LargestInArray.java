public class LargestInArray{
 public static void main(String[] args){
  int[] arr={3,7,2,9,5};
  int max=arr[0];
  for(int i:arr) if(i>max) max=i;
  System.out.println(max);
 }
}