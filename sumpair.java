import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
class SumPair{
public static void main(String[] arg)
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try{
String[] strArray= br.readLine().split(" ");
int sum=Integer.parseInt(br.readLine());
int array[]=new int[strArray.length];
int i=0;
for(String a : strArray)
{
array[i]=Integer.parseInt(a);
i++;
}
HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();

for(i=0;i<strArray.length;i++)
{
Integer temp=map.get(array[i])!=null ? map.get(array[i])+1 : 1;
map.put(array[i],temp);
}

int tcount=0;
for(i=0;i<strArray.length;i++)
{
tcount += map.get(sum-array[i])!=null ? map.get(sum-array[i]) : 0;
if(sum-array[i] == array[i])
{
tcount--;
}
}
System.out.println(tcount/2);

}
catch(Exception e)
{
System.out.println("sdfsdf"+e);
}
}

}
