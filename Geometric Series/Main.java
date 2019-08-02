import java.util.*;
import java.lang.Math;
class Main{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
  int a=1;
  int b=1;
  int c[]=new int[n];
  c[0]=1;
  c[1]=1;
  for(int i=2;i<n;i++){
  if(i%2==0){
  c[i]=2*a;
  a=c[i];}
  else{
    c[i]=3*b;
    b=c[i];
  }}
  System.out.print(c[n-1]);

                 }}