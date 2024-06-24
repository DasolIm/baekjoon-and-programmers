import java.util.*;
import java.io.*;

class Main {

    static final int MAX = 1000010;
    static int N, M, R;
    static boolean [] visited;
    static int [] ans;
    static ArrayList<Integer>[] graph;
    static int order;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        ans = new int[MAX];
        visited = new boolean[MAX];
        order = 1;

        graph = new ArrayList[MAX];
        for (int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[y].add(x);
            graph[x].add(y);
        }

        for (int i=1; i<=N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(R);

        for(int i = 1; i <=N; i++){
            bw.write(String.valueOf(ans[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static void dfs(int idx) {
        visited[idx] = true;
        ans[idx] = order;
        order++;

        for (int i=0; i<graph[idx].size(); i++) {
            if (!visited[graph[idx].get(i)]) dfs(graph[idx].get(i));
        }
    }
}