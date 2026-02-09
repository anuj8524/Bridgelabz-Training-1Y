import java.util.Scanner;
class SumOfNumber{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the num = ");
	double n[]=new double[10];
	double sum=0.0;
	for(int i=0;i<10;i++){
		n[i]=sc.nextDouble();
		if(n[i]<1){
			break;
		}
		sum=sum+n[i];
	}
	System.out.println("sum = "+sum);
	}
}