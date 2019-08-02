#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int i=0;
  while(str[i]!='\0'){
  if(str[i]!='a' && str[i]!='e' && str[i]!='i' && str[i]!='o' && str[i]!='u' && str[i]!='I'&&str[i]!='A' && str[i]!='E' && str[i]!='O' && str[i]!='U'  ){
  printf("%c",str[i]);}
  i++;}
  
  return 0;
}