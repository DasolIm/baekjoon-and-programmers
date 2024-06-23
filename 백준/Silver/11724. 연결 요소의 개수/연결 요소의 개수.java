import java.io.*;
import java.util.*;

class Main {

    static final int MAX = 1010;
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    static int ans;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st2.nextToken());
            y = Integer.parseInt(st2.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        ans = 0;

        for (int i=1; i<=N; i++) {
            if (!visited[i]) {
                dfs(i);
                ans++;
            }
        }

        bw.write(String.valueOf(ans));

        br.close();
        bw.close();
    }

    public static void dfs(int idx) {
        visited[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i])
                dfs(i);
        }
    }
}