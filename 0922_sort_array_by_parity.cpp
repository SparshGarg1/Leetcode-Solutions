class Solution {
public:

vector<int> sortArrayByParityII(vector<int>& nums) {
    int n = nums.size();
    vector<int> ans;
    vector<int> even;
    vector<int> odd;
    
    for(int i=0; i<n; i++){
        if(nums[i]%2 == 0)
            even.push_back(nums[i]);
        else
            odd.push_back(nums[i]);
    }
    
    int i=0;
    while(i != n){
        if(i%2 == 0){
            ans.push_back(even.back());
            even.pop_back();
        }
        else{
            ans.push_back(odd.back());
            odd.pop_back();
        }
        
        i++;
    }
    return ans;
    
}
};