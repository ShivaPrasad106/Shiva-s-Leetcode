class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n1,n2=len(nums1),len(nums2)
        a,b=nums1,nums2
        total=n1+n2
        half=total//2
        if n2<n1:
            return self.findMedianSortedArrays(nums2,nums1)
        l,r=0,n1-1
        while True:
            m1=(l+r)//2
            m2=half-m1-2
            l1=a[m1] if m1>=0 else float('-inf')
            r1=a[m1+1]if m1+1<n1 else float('inf')
            l2=b[m2]if m2>=0 else float('-inf')
            r2=b[m2+1]if m2+1<n2 else float('inf')
            if l1<=r2 and l2<=r1:
                if total%2:
                    return min(r1,r2)
                else:
                    return (min(r1,r2)+max(l1,l2) )/ 2
            elif l1>r2:
                 r=m1-1
            else:
                l=m1+1
