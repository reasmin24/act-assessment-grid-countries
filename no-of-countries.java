import java.util.*;

class Solution {
    public int solution(int[][] A) {
        if (A == null || A.length == 0) return 0;
        
        int n = A.length;
        int m = A[0].length;
        boolean[][] visited = new boolean[n][m];
        int countries = 0;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    countries++;
                    dfs(A, visited, i, j, dx, dy);
                }
            }
        }
        
        return countries;
    }
    
    private void dfs(int[][] A, boolean[][] visited, int row, int col, int[] dx, int[] dy) {
        int n = A.length;
        int m = A[0].length;
        int color = A[row][col];
        
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{row, col});
        visited[row][col] = true;
        
        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int x = cell[0];
            int y = cell[1];
            
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && A[nx][ny] == color) {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}