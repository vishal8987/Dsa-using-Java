//array_sum_using recursion;
#include<bits/stdc++.h>
using namespace std;
int main ()
{
    // int t;
    // cin>>t;
    // while(t--)
    // {
        int n=657;
        //cin>>n;
        int digit_sum=0;
        while(n>0){
            int last_digit=n%10;
            digit_sum=digit_sum+last_digit;
            n/10;
        }
        cout<<digit_sum<<endl;
    //}

    return 0;
}