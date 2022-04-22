#include<stdio.h>
void merge(int arr[],int l,int r,int m)
{
    
}
void mergesort(int arr[],int l,int r)
{
    if(l<r)
    {
        int m=l+(r-1)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
void printarray(int A[],n)

{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d",A[i]);
    }
    printf("\n");
}
void main()
{
    int a[]={2,4,1,5,7,3,8,9,4};
    int size=sizeof(arr)/sizeof(a[0]);
    printf("given arr is :\n");
    printarray(a,size);
    mergesort(a,0,size);
    printf("\n Sorted array is:\n");
    printarray(a,size);

}