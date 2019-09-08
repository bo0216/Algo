package test.kakao;
import java.util.*;

public class coloringBook {
	
	static class Pos{
		int x;
		int y;
		
		public Pos(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static public int[] solution(int m,int n,int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		
		int mx[] = {-1,0,1,0};
		int my[] = {0,1,0,-1};
		
		int[] answer = new int[2];
		
		int visited[][] = new int[m][n];  
		
		Queue<Pos> queue = new LinkedList<Pos>();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(picture[i][j] != 0 && visited[i][j] == 0) { //색칠되어있고 방문 안했으면.
					numberOfArea++;
					int nowAreaCount = 0;
					
					visited[i][j] = picture[i][j];
					queue.add(new Pos(i,j)); //pos queue에 넣어줌
					
				while(!queue.isEmpty()) {
					Pos now = queue.poll(); //현재위치 = queue첫번째 값 받아오기 
					nowAreaCount++; //넓이 하나 추가 
					
					for(int k=0; k<4; k++) { //상하좌우 비교 
						int tx = now.x + mx[k];
						int ty = now.y + my[k];
						
						if(tx<0 || ty<0 || tx>=m || ty>=n) // 영역 넘어가는지 확인  
							continue;
						
						if(visited[tx][ty] != 0 || picture[tx][ty] == 0) // 방문을 했거나, 색칠이 안되어 있는 경 
							continue;
						if(picture[tx][ty] != picture[now.x][now.y]) // 체크하는 좌표의 색상과 현재좌표의 색상이 다른경우 
							continue;
						
						visited[tx][ty] = picture[tx][ty]; //현재좌표 방문함 체크.                                                                                                                      
						queue.add(new Pos(tx,ty));
					}
				} //while
				
				maxSizeOfOneArea = Math.max(maxSizeOfOneArea, nowAreaCount);
				
				} //for
			} // j for
		} // i for
		
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		
		return answer;
	}
	public static void main(String[] args) {
		int a[] = new int[2];
		int pic[][] = { {1,1,1,0},
						{1,2,2,0},
						{1,0,0,1},
						{0,0,0,1},
						{0,0,0,3},
						{0,0,0,3}
						};
		
		a = solution(6,4,pic);
		
		for(int i=0; i<2 ;i++) {
			System.out.println(a[i]);
		}
		
 	}
}
