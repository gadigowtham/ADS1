public class Qu
{
private int[] id;
public Qu(int N)
{
 id = new int[N];
for (int i = 0; i < N; i++) id[i] = i;
}
private int root(int i)
{
while (i != id[i]) i = id[i];
return i;
}
public boolean find(int p, int q)
{
return root(p) == root(q);
}
public void unite(int p, int q)
{
int i = root(p);
 int j = root(q);
 id[i] = j;
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
System.out.println("QUICK UNION");
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