package lastLab;
import java.util.*;
public class Process {
	Vector v = new Vector();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of processes");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0;i<n;i++)
		{
			System.out.println("Process " +i +"Burst Time");
			Process p = new Process();
			p.burst_time = s.nextInt();
			v.add(p);
		}
		v.sort(new Comparator() {
			public int compare(Object a, Object b) {
				return ((process)a).burst_time - ((process)b);
			}
		} );
		
		int c = 0;
		for(int i = 0;i<v.size();i++)
		{
			
		}
		
	}

}
