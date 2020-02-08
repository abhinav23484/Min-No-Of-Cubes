import java.util.*;
public class MinOfCubed{
	 static int minCubes(int x) {
		//create an array to store the result of subproblem
		int minCube[]=new int[x+1];
		//minCube{i]=min. number of cubes that sum upto i
		//intiialisation
		minCube[0]=0;
		minCube[1]=1;
		
		for(int i=2;i<=x;i++)
		{
			//max number of cubes that sum up to i is equal to i
			minCube[i]=i;
			
			for (int j=1;j*j*j<=i;j++)
			{
				//select the minimum value of i by using already computed values
				minCube[i]=Math.min(minCube[i],1+minCube[i-j*j*j]);
			}
		
			}
		return minCube[x];
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("The min number of cubes are:-");
		System.out.println(minCubes(x));
		sc.close();
	}
	
}
