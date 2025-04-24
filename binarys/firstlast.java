package binarys;

public class firstlast {
    class Solution {
        public static int lowbound(int[]arr, int x)
        {
            int n=arr.length,st=0, end=n-1;
            int ans=-1;
            while(st<=end)
            {
                int mid= st+(end-st)/2;

                if (arr[mid]>=x)
                {
                    ans=mid;
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            }

            return ans;
        }
        public static int upperbound(int []arr, int x)
        {
            int st=0,end=arr.length-1;
            int ans= -1;
            while (st<=end)
            {
                int mid=st+(end-st)/2;
                if (arr[mid]>x)
                {
                    ans=mid;
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            return ans;
        }
        public int[] searchRange(int[] arr, int x) {
            int n=arr.length;

            int [] ans={-1,-1};
            if (n==0) return ans;
            int lb=lowbound(arr,x);

            if (lb==n || lb==-1 || arr[lb]!=x) return ans;

            int ub=  upperbound(arr,x);

            if (ub==-1)
            {
                if (n==1)
                {
                    ans[0]=0;
                    ans[1]=0;
                }
                else if(n==2)
                {
                    ans[0]=0;
                    ans[1]=ub;
                }

            }

            else{
                ans[0]=lb;

                ans[1]=upperbound(arr,x)-1;
            }

            return ans;


        }
    }
}
