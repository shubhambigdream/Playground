#include<stdio.h>

int main()
{
  int ar[4];
  int i;
  for(i=0;i<4;i++){
  scanf("%d",&ar[i]);}
  int min=ar[0];
  for(i=0;i<4;i++){
  if (ar[i]<min){
  min=ar[i];}}
  printf("%d",min);
  
  
}