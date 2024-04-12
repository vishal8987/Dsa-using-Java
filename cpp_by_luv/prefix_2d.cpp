#include<bits/stdc++.h>
using namespace std;
//const N =1e3+10;
//int ar[N][N];
int main()
{
    const int N =1e3+10;
    
  int ar[N][N];
int n;
cin>>n;
for(int i=0;i<=n;i++)
{
    for(int j=0;j<=n;j++){
        cin>>ar[i][j];
    }
}
int q;
cin>>q;
while(q--)
{
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    long long int sum =0;
    for(int i=a;i<=c;i++)
    {
        for(int j=b;j<=d;j++){
        sum+=ar[i][j];
        }
    }
    cout<<sum<<endl;
}
    return 0;
}