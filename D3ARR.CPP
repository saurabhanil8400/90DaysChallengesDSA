Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]



class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
           int n=nums.size();
         vector<int> duplicate;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                duplicate.push_back(nums[i]);
            }
        }
        
        
        return duplicate;
        
    }
};