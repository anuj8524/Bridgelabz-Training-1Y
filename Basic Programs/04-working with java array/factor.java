import java.util.Scanner;
class Factor{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the num = ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int k=0;
	for(int i=1;i<=n;i++){
	if(n%i==0){
	arr[k]=i;
	k++;
	}
	}
	System.out.print("factor of "+n+" is ");
	for(int i=0;i<k;i++){
	System.out.print(arr[i]+" ");
	}
	}
}