import java.util.Scanner;
class Multiply{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the num = ");
	int n=sc.nextInt();
	int arr[]=new int[4];
	int l=0;
	for(int i=6;i<=9;i++){
	arr[l]=n*i;
	l++;
	}
	l=0;
	for(int i=6;i<=9;i++){
	System.out.println(n+"*"+i+"="+arr[l]);
	l++;
	}
	}
}