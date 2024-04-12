#include<stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n,a,b;
        scanf("%d %d %d",&n,&a,&b);
        if((a==b && a==n)||(n-(a+b)>1)){
        printf("yes\n");
        }
        else
        {
        printf("no\n");
    }
    }
    return 0;
}