
package com.esjay;
import java.util.Scanner;
/**
 * Created by Suvajit on 29/04/17.
 */
public class WeightedUndirectedGraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int V = scan.nextInt();
        System.out.println("Enter the number of edges");
        int E = scan.nextInt();
        int[][] adjM = new int[V][V];
        double[][] Weight = new double[V+1][V+1];
        for (int i = 0; i < V; i++) {
            for (int j = 0; i < V; i++) {
                adjM[i][j] = 0;
            }
        }
        System.out.println("Enter the edges and their weights");

        for (int i = 0; i < E; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            double w = scan.nextDouble();
            adjM[u - 1][v - 1] = 1;
            adjM[v - 1][u - 1] = 1;
            Weight[u - 1][v - 1] = w;
            Weight[v - 1][u - 1] = w;

        }

        System.out.println();
        System.out.println("The adjacency matrix representation of the graph is as follows :" + "\n");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjM[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        dfs(adjM, visited, V, 0);
        boolean[] newVisited = visited;

        int flag = 0;
        for (int k = 0; k < V; k++) {
            if (!newVisited[k])
                flag = 1;
        }
        if (flag == 1) {
            System.out.println("The graph is not connected\n");
            KruskalAlgorithm.kruskal(Weight, V);
        }
        else {
            System.out.println("The graph is connected\n");
            prims(Weight, V);
        }

    }

    public static boolean[] dfs(int[][] adjM, boolean[] visited, int ver, int i) {

        visited[i] = true;
        for (int j = 0; j < ver; j++) {
            if (!visited[j] && adjM[i][j] == 1)
                dfs(adjM, visited, ver, j);
        }

        return visited;

    }
    //The complexity is O(n*n),because in the worst case scenario, we have to traverse through the whole row for all rows in the matrix until we find an edge.

    public static void prims(double[][] W, int V) {
        System.out.println("Implementing Prim's algorithm ");
        int mst[] = new int[V];
        double key[] = new double[V];

        // To represent set of vertices not yet included in MST
        Boolean mstSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Double.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        mst[0] = -1;

        for (int j = 0; j < V - 1; j++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++)

                if (W[u][v] != 0 && mstSet[v] == false && W[u][v] < key[v]) {
                    mst[v] = u;
                    key[v] = W[u][v];
                }
        }
        printMST(mst, V, W);
       // Time Complexity of the above program is O(V2)

    }

    public static int minKey(double key[], Boolean mstSet[]) {

        double min = Double.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < key.length; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    public static void printMST(int mst[], int V, double W[][]) {
        double[][] MSTweight = new double[V][V];

        System.out.println();
        System.out.println("Minimum spanning tree in adjacency matrix representation" + "\n");
        for (int i = 1; i < V; i++) {

                MSTweight[mst[i]][i] = W[i][mst[i]];
                MSTweight[i][mst[i]] = W[i][mst[i]];

        }

        for (int i = 0; i < V; i++) {

            for (int j = 0; j < V; j++) {

                System.out.print(MSTweight[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
