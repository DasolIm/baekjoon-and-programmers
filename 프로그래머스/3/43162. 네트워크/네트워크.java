class Solution {
    
    static boolean [][] graph;
    static boolean [] visited;
    
    public static int solution(int n, int[][] computers) {
        
        graph = new boolean[n][n];
        visited = new boolean[n];
        int cnt = 0;
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (computers[i][j] == 1 && i!=j) 
                    graph[i][j] = graph[j][i] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, n);
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public static void dfs(int idx, int n) {
        visited[idx] = true;
        for (int i=0; i<n; i++) {
            if (!visited[i] && graph[idx][i])
                dfs(i, n);
        }
    }
}