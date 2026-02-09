import java.util.Scanner;
class EvenAndOdd{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number = ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int even[]=new int[n/2+1];
	int odd[]=new int[n/2+1];
	System.out.print("enter the number of array ");
	int e=0;
	int o=0;
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		if(arr[i]%2==0){
			even[e]=arr[i];
			e++;
		}
		else{
			odd[o]=arr[i];
			o++;
		}
	}
	System.out.print("even number ");
	for(int i=0;i<e;i++){
		System.out.print(even[i]+" ");
	}
	System.out.println();
	System.out.print("odd number ");
	for(int i=0;i<o;i++){
		System.out.print(odd[i]+" ");
	}
	
	}
}