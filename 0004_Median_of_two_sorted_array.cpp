class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
	
	//declare a vector a and insert array nums1 and nums2 into it
        vector <int> a;
		
		//insert nums1 array elements into an array a
        for(int i=0; i<nums1.size(); i++){
        	a.push_back(nums1[i]);
		}
		
		//insert nums2 array elements into an array a
        for(int i=0; i<nums2.size(); i++){
        	a.push_back(nums2[i]);
		}
		
		//Now sort the array a
		sort(a.begin(), a.end());
		
		//declare an double n
		double n;
		
		//Case 1: if Array a elements has even number of elements then median n is--->
		if(a.size()%2==0){
			n = (double(a[a.size()/2]) + double(a[(a.size()/2)-1]))/2;
		}
		
		//Case 2: if array a has odd number of elements then median n is--->
		else{
			n = double(a[(a.size()-1)/2]);
		}
		return n;
    }
};