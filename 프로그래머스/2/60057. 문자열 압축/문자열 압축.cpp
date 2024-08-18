#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(string s) {  
    int ans = s.size(); 
    int ssize = s.size(); 
    for(int block = 1; block <= ssize / 2; block++){
        string comp = "";
        string prev = s.substr(0, block);
        int count = 1;
        for(int j = block; j < ssize; j += block){
            string curr = s.substr(j, block);
            if(prev == curr) {
                count++; 
            }
            else {
                if(count > 1) {
                    comp += to_string(count);
                }
                comp += prev; 
                prev = curr;
                count = 1;
            }
        }
        if (count > 1) {
            comp += to_string(count);
        }
        comp += prev;
        ans = min(ans, (int)comp.size()); 
    }
    return ans; 
} 