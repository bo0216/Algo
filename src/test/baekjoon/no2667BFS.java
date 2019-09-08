package test.baekjoon;
import java.util.*;


public class no2667BFS {
	static class pos{
		int x;
		int y;
		
		pos(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static int[] solution(int n,int[][] picture) {
		
		int visit[][] = new int[n][n];
		
		int mx[] = {-1,0,1,0};
		int my[] = {0,-1,0,1};
		
		int numberOfArea = 0;
		int CountArea = 0;
		
		ArrayList<Integer> CountAreas = new ArrayList<>();
		ArrayList<Integer> answerList = new ArrayList<>();
		
		Queue<pos> queue = new LinkedList<pos>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(picture[i][j]!=0 && visit[i][j]==0) {
					CountArea = 0;
					numberOfArea++;
					
					visit[i][j] = picture[i][j];
					queue.add(new pos(i,j));
					
					while(!queue.isEmpty()) {
						pos now = queue.poll();
						CountArea++;
						
						for(int k=0; k<4; k++) {
							int tx = now.x + mx[k];
							int ty = now.y + my[k];
							
							
							if(tx<0 || ty<0 || tx>=n || ty>=n)
								continue;
							if(picture[tx][ty]==0 || visit[tx][ty]!=0)
								continue;
							if(picture[tx][ty]!=picture[now.x][now.y])
								continue;
							 
							
							visit[tx][ty] = picture[tx][ty];
							queue.add(new pos(tx,ty));
						
						}
					}
					CountAreas.add(CountArea);
					Collections.sort(CountAreas);
					
				}
			}
		}
		
		answerList.add(numberOfArea);
		
		for(int i=0; i<CountAreas.size(); i++) {
			answerList.add(CountAreas.get(i));
		}
		
		int[] answer = new int[answerList.size()];
		int size = 0;
		for(int temp : answerList) {
			answer[size++] = temp;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int picture[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			
			for(int j=0; j<input.length(); j++) {
				picture[i][j] = input.charAt(j) - '0';
				
			}
		}
		
		int[] a = solution(n,picture);
		for(int i : a) {
			System.out.println(i);
		}
		
		
		
	}
}
