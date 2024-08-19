#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string is_suffix) {
    if (my_string.length() >= is_suffix.length()
         && my_string.substr(my_string.length()-is_suffix.length()) == is_suffix) 
        return 1;
    else return 0;
}