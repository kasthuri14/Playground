#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float hyp,opp,adj;
  scanf("%f%f",&opp,&adj);
  hyp=sqrt((adj*adj)+(opp*opp));
  printf("%0.2f",hyp);
  return 0;
}