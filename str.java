//lentgth of the string 
class str{
  public static void main(String[] args) {
    String s="NihalTonape";
   char[] c=s.toCharArray();
   int count=0;
   for (char ch: c ) {
     count++;
   }System.out.println(count);
  }
}