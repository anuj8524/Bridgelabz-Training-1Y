import java.util.Scanner;
class Vote{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int age[]=new  int[10];
	System.out.println("enter the age of 10 students ");
	for(int i=1;i<=10;i++){
	System.out.print("enter the age of "+i+" student ");
	age[i]=sc.nextInt();
	if(age[i]>=18){
	System.out.println("The student with the age " + age[i] + " can vote.");
	}
	else if(age[i]<0){
	System.out.println("Invalid age");
	}
	else{
	System.out.println("The student with the age " + age[i] + " cannot vote.");
	}
	}
	}
}