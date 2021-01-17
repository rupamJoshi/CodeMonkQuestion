import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
class Inversion
{
public static void main(String arg[]) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n=Integer.parseInt(br.readLine());
	while(n>0)
	{
		
	int size= Integer.parseInt(br.readLine());
	int array[][]= new int[size][size];
	
	for(int i=0;i<size;i++)
	{
	String temp[] = br.readLine().split(" ");
	int j=0;
	for(String c : temp)
	{
	array[i][j]=Integer.parseInt(c);
	j++;
	}
	}


	int count=0;
	for(int p=0;p<size;++p)
        {
        for(int q=0;q<size;++q)
        {
        for(int x=p;x<size;++x)
	{
	for(int y=q;y<size;++y)
	{
		System.out.println(array[x][y] +" "+array[p][q]);
		if(array[x][y]<array[p][q])
		{
		count++;
		}
	}
	}
        }
        }

	System.out.println("Result -> "+ count);
	n--;
}
}
}
