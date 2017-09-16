public class Main {

	public static void main(String args[])throws IOException
	{
		String g;
	int n,i;
	BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Number of Students:");
	g=d.readLine();
	n=Integer.parseInt(g);
	Academic a[] = new Academic[10];
	for(i=0;i<n;i++)
	{
	a[i]=new Academic();
	System.out.println("Enter the detail of student" +(i+1));
	a[i].getdetail();
	}
		for(i=0;i<n;i++)
		a[i].printdetail();
}
		

}
