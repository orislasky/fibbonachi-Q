import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		int [] fibbonachi = new int [20];
			
			fibbonachi[0]=1;	
			fibbonachi[1]=1;
				for (int i=2; i<fibbonachi.length; i++)
				{
					fibbonachi[i]= (fibbonachi[i-1]+fibbonachi[i-2]);
				}
				for (int j=0; j<fibbonachi.length; j++)
				{
					System.out.println(fibbonachi[j]);
				}
	}

}
