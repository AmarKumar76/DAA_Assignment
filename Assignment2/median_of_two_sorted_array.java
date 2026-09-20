package Assignment2;

public class median_of_two_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length,n = nums2.length;
        int mergedarr[] = new int [m+n];
        int i =0,j=0;
        int k =0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mergedarr[k++]=nums1[i];
                i++;
            }else{
                mergedarr[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            mergedarr[k++]=nums1[i];
            i++;
        }
        while(j<n){
            mergedarr[k++]=nums2[j];
            j++;
        }
        int x = m+n;
        if(x%2==0){
            return (mergedarr[(x-1)/2]+mergedarr[x/2])/2.0;
        }else{
            return mergedarr[x/2];
        }
        
    }
}
