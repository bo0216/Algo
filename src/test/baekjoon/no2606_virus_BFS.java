package test.baekjoon;

import java.util.*;

public class no2606_virus_BFS {
	static int v,e;
	static ArrayList<ArrayList<Integer>> a;
	static boolean[] check1;
	static boolean[] check2;
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start); //start지점 큐에 삽입 
		check1[start] = true; //start 지점 방문하였음
		while(!queue.isEmpty()) { 
			int now = queue.remove(); 
			System.out.print(now + " "); 
			for(int t : a.get(now)) { 
				if(check1[t]) continue;
				check1[t] = true;
				queue.add(t);
			}
		}
				
	}
	
	public static void dfs(int start) {
		check2[start] = true;
		System.out.print(start+" ");
		for(int t : a.get(start)) {
			if(check2[t])
				continue;
		dfs(t);
			
		}
	
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		v = scan.nextInt();
		e = scan.nextInt();
		int start = scan.nextInt();
		
		a = new ArrayList<>();
		check1 = new boolean[v+1]; 
		check2 = new boolean[v+1];
	
		
		for(int i=0; i<=v; i++) {
			a.add(new ArrayList<>());
		}
		
		for(int i=0; i<e; i++) {
			int t = scan.nextInt();
			int f = scan.nextInt();
			a.get(t).add(f);
			a.get(f).add(t);
		}
		
		for(int i=0; i<=v; i++) {
			a.get(i).sort(null);
		}
		
		
		dfs(start);
		System.out.println();
		bfs(start);
		
		scan.close();
}

}
