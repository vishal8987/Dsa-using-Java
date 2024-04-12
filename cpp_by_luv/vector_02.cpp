#include<bits/stdc++.h>
using namespace std;
void printvect(vector<string>v){
    cout<<" size:"<<v.size()<<" "<<endl;
    for(int i=0;i<v.size();i++)
    {
        cout<<v[i]<<" ";
    }
    //v.push_back(2);
    cout<<endl;
}
int main()
{
   // vector<int>v;
    /*int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        int x;
        cin>>x;
         printvect(v);
        v.push_back(x);
    }*/
   // printvect(v);
       // v.push_back(7);
    /*printvect(v);
    v.pop_back();*/
  //  v.push_back(6);
  /* vector<int >v2=v;
    v2.push_back(5);
    printvect(v);
    printvect(v);
    printvect(v2);*/
    vector<string>v;
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        int s;
        cin>>s;
        v.push_back(s);
    }
    printvect(v);
    return 0;
}