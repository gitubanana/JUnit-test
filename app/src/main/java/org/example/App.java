package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class App {
    static class Tree {
        private ArrayList<Integer>[] edges;

        public Tree(int vCnt) {
            edges = new ArrayList[vCnt + 1];
            for (int v = 1; v <= vCnt; ++v) {
                edges[v] = new ArrayList<>();
            }
        }

        private boolean isPoppable(char start, char end) {
            return (start == '(' && end == ')')
                    || (start == ')' && end == '(');
        }

        public int getMaxDepth() {
            int maxDepth = 0;
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); ++i) {
                char end = str.charAt(i);

                if (!stack.isEmpty()) {
                    char start = stack.pop();

                    if (isPoppable(start, end)) {
                        continue;
                    }

                    stack.push(start);
                }

                stack.push(end);
                maxDepth = Math.max(maxDepth, stack.size());
            }

            if (stack.isEmpty()) {
                return maxDepth;
            }

            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        System.out.print(new Parenthesis(br.readLine()).getMaxDepth());
    }
}
