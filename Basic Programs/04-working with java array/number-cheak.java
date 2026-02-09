import java.util.Scanner;
class NumberCheak{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the number = ");
	int n[]=new int[5];
	for(int i=0;i<5;i++){
	n[i]=sc.nextInt();
	if(n[i]<0){
	System.out.println("negative");
	}
	else if(n[i]==0){
	System.out.println("zero");
	}
	else{
	System.out.print("positive ");
	if(n[i]%2==0){
	System.out.println("and even");
	}
	else{
	System.out.println("and odd");
	}
	}
	}
	if(n[0]>n[4]){
		System.out.println("first is tha greater ");
	}
	else if(n[0]==n[4]){
		System.out.println("equal");
	}
	else{
		System.out.println("first is the smaller ");
	}
	}
}