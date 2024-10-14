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

        public ArrayList<Integer> getEdges(int v) {
            return edges[v];
        }

        public void addEdge(int from, int to) {
            getEdges(from).add(to);
        }

        public int getVcnt() {
            return edges.length - 1;
        }
    }

    static class Ruler {
        private static final int SKIPPED = 0;
        private static final int SELECTED = 1;
        private static final int STATUS_CNT = 2;
        private static final int ROOT = 1;
        private static final int VIRTUAL_NODE = 0;

        private Tree tree;
        private int[][] dp;

        public Ruler(Tree tree) {
            this.tree = tree; // 따로 할당하진 않는다. (new 없음)
            this.dp = new int[tree.getVcnt() + 1][STATUS_CNT];
        }

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
