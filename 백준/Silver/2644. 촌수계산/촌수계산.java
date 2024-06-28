import java.util.*;
import java.io.*;

class Main {

    static int A, B, N, M;
    static boolean [] visited;
    static boolean [][] graph;
    static int ans;

    public static void dfs(int idx, int cnt) {
        visited[idx] = true;

        if(idx == B){
            ans = cnt;
            return;
        }

        for (int i = 1; i <= N; i++)
            if (!visited[i] && graph[idx][i])
                dfs(i, cnt + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        graph = new boolean[N+1][N+1];
        ans = -1;

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        dfs(A, 0);

        bw.write(String.valueOf(ans));

        br.close();
        bw.close();
    }

}