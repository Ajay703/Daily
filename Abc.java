import java.util.*;
public class Abc {
	Scanner sc=new Scanner(System.in);
	void demo() {
		System.out.println("enter the no :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	if((a<b)||(b==c)) {
		System.out.println("true condition ");
	}
	else
		System.out.println("false condition");
}

	void arthmatic() {
		System.out.println("enter the no for addition ");
int e=sc.nextInt();
int f=sc.nextInt();
		int d=e+f;
		System.out.println("the addition if three no is :"+d);
	}
	void reverse() {
	System.out.println("enter the no for reverse :");
		int rev=0,rem;
		int g=sc.nextInt();
		while(g>0) {
			rem=g%10;
			rev=rev*10+rem;
			g=g/10;
		}
		System.out.println("the reverse no is :"+rev);
	}
	void swap() {
		System.out.println("enter the no for swapping :");
		int z;
		int h=sc.nextInt();
		int i=sc.nextInt();
		System.out.println("before swapping :"+h+" "+i);
		z=h;
		h=i;
		i=z;
		System.out.println("after swapping :"+h+" "+i);
	}
	void swap2() {
		System.out.println("enter the no for swaping :");
		int j=sc.nextInt();
		int k=sc.nextInt();
		System.out.println("before swapping "+j+" "+k);
		j=j+k;
		k=j-k;
		j=j-k;
		System.out.println("after the swapping :"+j+" "+k);
	}
	void fact(int fact1) {
		System.out.println("the factorial of no is "+fact1);
	}
	void sum() {
		System.out.println(" the  sum of factorial is  :"+fact2());
	}
	int fact2() {
		System.out.println("enter the no for factorial :");
		int l=sc.nextInt();
		int fact1=1;
		int sum=0;
		for(int m=1;m<=l;m++) {
			fact1=fact1*m;
			sum=sum+m;
		}
		fact(fact1);
return sum;		
			
		}	
public static void main(String[] args) {
Abc a1=new Abc();

a1.demo();
a1.arthmatic();
a1.reverse();
a1.swap();
a1.swap2();
a1.sum();
}

}