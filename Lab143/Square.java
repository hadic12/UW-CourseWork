public class Square
{
 public static void main (String [] args){
     mark1(3);
     mark1(22.7648);
     mark1(45.2);
 }
 
 public static void mark1(int a){
     System.out.println(a);
 }
 
  public static void mark1(double b){
     System.out.println(b);
 }
 
  public static void mark1(float c){
     System.out.println(c);
 }
 
 public static int mark2(int a){
     int sq = a * a;
     return sq;
 }
 
 public static double mark2(double b){
     double sq = b * b;
     return sq;
 }
 
 public static float mark2(float c){
     float sq = c * c;
     return sq;
 }
}
