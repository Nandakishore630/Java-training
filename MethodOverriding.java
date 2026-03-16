public class CharFrequency{
 public static void main(String[] args){
  String s="banana";
  int count=0;
  for(char c:s.toCharArray())
   if(c=='a') count++;
  System.out.println(count);
 }
}