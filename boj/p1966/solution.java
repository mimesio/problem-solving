package boj.p1966;

import java.util.*;
import java.io.*;

class Main {

    static int testcase;
    static StringBuilder output = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int n, target;
        File[] files;
        while (testcase --> 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            target = Integer.parseInt(st.nextToken());
            files = new File[n];

            // init files
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());
                files[i] = new File(i, priority);
                files[i].name = i;
            }

            solve(n, target, files);
        }
    }

    private static void solve(int n, int target, File[] files) {
        Queue<File> queue = new ArrayDeque<>();
        int[] priorities = new int[n];
        int idx = 0;

        for (File f : files) {
            queue.offer(f);
            priorities[idx++] = f.priority;
        }

        Arrays.sort(priorities);

        int order = 0;

        outer: while (!queue.isEmpty()) {
            if (queue.peek().priority == priorities[idx-1]) {
                File f = queue.poll();
                order++;
                idx--;
                if (f.name == target) {
                    output.append(order).append("\n");
                    break outer;
                }
                else continue;
            }
            else {
                 File f = queue.poll();
                 queue.offer(f);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(output.toString());
    }
}

class File {
    public int name;
    public int priority;

    public File(int name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}





