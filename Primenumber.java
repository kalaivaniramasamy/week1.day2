package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		
		int Input =13;
		boolean flag = true;
		for(int i=2;i<=Input/2;i++)
		{
			if(Input%i==0)
			{
			flag=false;
			break;
		    }
		}
		if(flag) 
		{
			System.out.println("prime number");
			}
		else {
			System.out.println("not prime number");
		}
	}

}