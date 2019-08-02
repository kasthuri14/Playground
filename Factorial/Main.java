#include<stdio.h>
#include<math.h>
int main()
{
	//your code here
  long int  fact=1,i,n;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact  * i;
  }
  printf("%ld",fact);
  
}