public class Qs
{
private int[] id;

public Qs(int N)
{
	id=new int[N];
	for(int i=0;i<N;i++)
	{
		id[i]=i;
	}
}
public boolean connected(int p,int q)
{
	if(id[p]==id[q])
	{
	return true;
	}
	else
	{
		return false;
	}
	
}
public void union(int p,int q)
{
	int pid=id[p];
	int qid=id[q];
	
	for(int i=0;i<id.length;i++)
	{
		if(id[i]==pid)
		{
			id[i]=qid;
		}
	}
}

public void print()
{
	for(int i=0;i<id.length;i++)
	{
		System.out.print("\t"+id[i]);
	}
	System.out.print("\n");
}
public static void main(String[] args)
{
System.out.println("QUICK FIND");
Qs q = new Qs(10);
q.union(9,0);
q.print();
q.union(3,4);
q.print();
q.union(5,8);
q.print();
q.union(7,2);
q.print();
q.union(2,1);
q.print();
q.union(5,7);
q.print();
q.union(0,3);
q.print();
q.union(4,2);
q.print();
System.out.println(q.connected(9,0));
System.out.println(q.connected(2,4));
System.out.println(q.connected(7,2));
System.out.println(q.connected(5,6));
}
}

	