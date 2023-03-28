class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> B;
        int m=2*nums.size();
        for(int i=0; i<m;i++){
            if(i<nums.size()){
                B.push_back(nums[i]);
            }
            else if(i>=nums.size()){
                B.push_back(nums[i-nums.size()]);
            }
        }
        return B;
    }
};
