import java.util.Scanner;
public class MethPrac {

	public static void main(String[] args) {
		retEvenNos();
		retOddNos();
		retSquareNos();
		System.out.println(sumNum(765,156));
		System.out.println(prodNum(20,24));
		System.out.println(revNum(2566));
		swap(4,5);
		System.out.println("Max:"+max(34,65));
		System.out.println("Min:"+min(34,65));
		System.out.println("Factorial:"+fact(10));
		System.out.println("Max of three:"+maxThree(7,54,32));
		System.out.println("Min of three:"+minThree(7,54,32));
	}


	public static void retEvenNos()
	{ 
		int startNum,nextNum,count=0;
		Scanner console=new Scanner(System.in);
		System.out.println("Print n even Nos.:");
		System.out.println("Enter a number:");
		startNum=console.nextInt();
		System.out.println("Enter the next set to be printed:");
		nextNum=console.nextInt();
		console.close();
		do {
			if(startNum%2==0) {
				startNum+=2;
			} else {
				startNum+=1;
			}
			System.out.println(startNum);
			count++;
		}while(count<nextNum);
	}
	public static void retOddNos() { 
		int startNum,nextNum,count=0;
		Scanner console=new Scanner(System.in);
		System.out.println("Print n Odd Nos.:");
		System.out.println("Enter a number:");
		startNum=console.nextInt();
		System.out.println("Enter the next set to be printed:");
		nextNum=console.nextInt();
		console.close();
		do {
			if(startNum%2==0) {
				startNum+=1;
			} else {
				startNum+=2;
			}
			System.out.println(startNum);
			count++;
		}while(count<nextNum);
	}
	public static void retSquareNos() { 
		int startNum,nextNum,sq,count=0;
		Scanner console=new Scanner(System.in);
		System.out.println("Print n Square Nos.:");
		System.out.println("Enter a number:");
		startNum=console.nextInt();
		System.out.println("Enter the next set to be printed:");
		nextNum=console.nextInt();
		console.close();
		do {
			startNum+=1;
			sq=startNum*startNum;
			System.out.println(sq);
			count++;
		}while(count<nextNum);
	}

	public static int sumNum(int c,int d) {
		return (c+d);
	}
	public static int prodNum(int c,int d) {
		return (c*d);
	}

	public static int revNum(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10;
			rev=rev+(num%10);
			num/=10;
		}
	return rev;
	}

	public static void swap(int a,int b)
	{
		int temp;
		System.out.println("Before swap: a:"+a+" "+"b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap: a:"+a+" "+"b:"+b);
	}
	public static int max(int a,int b)
	{
		if(a>b) {
		
			return a;
		}
		else {
		
			return b;
		}
	}
	public static int min(int a,int b)
	{
		if(a<b) {
		
			return a;
		}
		else {
		
			return b;
		}
	}
	public static int fact(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
		fact=fact*i;
		}
		return fact;
	}
	public static int maxThree(int a,int b,int c)
	{
		if(a>b && a>c) {
			return a;
		}else 
				if(b>a && b>c) {
					return b;
			}else
				return c;
	}
	public static int minThree(int a,int b,int c)
	{
		if(a<b && a<c) {
			return a;
		}
		else 
			if(b<a && b<c) {
			return b;
		}else
			return c;
	}
}
