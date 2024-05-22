class Solution {
public:
    bool isPalindrome(int x) {
        int val = x;
        long ans=0;
        while(x!=0){
        int rem = x%10;
        x = x/10;
        ans = (ans*10)+rem;
        }
        if(val<0){
            return false;
        }
        else if(ans == val){
            return true;
        }
        else{
            return false;
        }
    }
};