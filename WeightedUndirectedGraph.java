
package com.esjay;
import java.util.Scanner;
/**
 * Created by Suvajit on 29/04/17.
 */
public class WeightedUndirectedGraph {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int V = scan.nextInt();
        System.out.println("Enter the number of edges");
        int E = scan.nextInt();
        int[][] adjM = new int[V][V];
        double[][] b = new double[V][V];
        for(int i =0;i<V;i++)
        {
            for(int j =0;i<V;i++)
            {
                adjM[i][j]=0;
            }
        }
        System.out.println("Enter the edges and their weights");

        for(int i =0;i<E;i++)
        {
          int u = scan.nextInt();
          int v = scan.nextInt();
          double w = scan.nextDouble();
           adjM[u-1][v-1] = 1;
           adjM[v-1][u-1] = 1;
           b[u-1][v-1] = w;
           b[v-1][u-1] = w;
        }
        System.out.println();
        System.out.println("The adjacency matrix representation of the graph is as follows :"+"\n");
         for(int i =0;i<V;i++)
        {
            for(int j =0;j<V;j++)
            {
                System.out.print(adjM[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        matrix(adjM);

    }

    public static void matrix(int a[][])
    {
        int ver = a.length;
        boolean[] visited = new boolean[ver];
        for(int i =0;i<ver;i++)
        visited[i] = false;
        dfs(a, visited, ver, 0);
        boolean[] newVisited = visited;

        int flag = 0;
        for (int k = 0; k < ver; k++) {
            if (!newVisited[k])
                flag = 1;
        }
        if (flag == 1)
            System.out.println("The graph is not connected");
        else
            System.out.println("The graph is connected");

    }

    public static boolean[] dfs(int[][] adjM,boolean[] visited,int ver,int i) {

        visited[i] = true;
        for (int j = 0; j < ver; j++) {
            if (!visited[j] && adjM[i][j] == 1)
                dfs(adjM, visited, ver, j);
        }

        return visited;

    }
}
