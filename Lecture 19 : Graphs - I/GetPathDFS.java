// Code : Get Path - DFS
// Send Feedback
// Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
// Find the path using DFS and print the first path that you encountered.
// Note:
// 1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 2. E is the number of edges present in graph G.
// 3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
// 4. Save the input graph in Adjacency Matrix.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
// The following line contain two integers, that denote the value of v1 and v2.
// Output Format :
// Print the path from v1 to v2 in reverse order.
// Constraints :
// 2 <= V <= 1000
// 1 <= E <= (V * (V - 1)) / 2
// 0 <= a <= V - 1
// 0 <= b <= V - 1
// 0 <= v1 <= 2^31 - 1
// 0 <= v2 <= 2^31 - 1
// Time Limit: 1 second
// Sample Input 1 :
// 4 4
// 0 1
// 0 3
// 1 2
// 2 3
// 1 3
// Sample Output 1 :
// 3 0 1
// Sample Input 2 :
// 6 3
// 5 3
// 0 1
// 3 4
// 0 3
// Sample Output 2 :



package Graphs1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {
	
	
	public static ArrayList<Integer> getPath( int[][] edges ,int start ,int end, boolean[] visited){
		if(start == end) {
			ArrayList<Integer> ansArrayList = new ArrayList<>();
			ansArrayList.add(start);
			return ansArrayList;
		}
		visited[start] = true;
		for(int i=0;i<edges.length;i++) {

			if(edges[start][i]==1 && !visited[i]) {

				ArrayList<Integer> ans = getPath(edges, i, end, visited);
				if(ans!=null) {
					ans.add(start);
					return ans;
				}

			}

		}
		return null;

	}
	
	
	
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int e = scanner.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<e;i++) {
			int se = scanner.nextInt();
			int ee = scanner.nextInt();
			edges[se][ee] = 1;
			edges[ee][se] = 1;
		}
		
		//System.out.println("Enter the Start and End : ");
		int start = scanner.nextInt();
		int end  = scanner.nextInt();
		boolean[] visited = new boolean[edges.length];
		ArrayList<Integer> ans = getPath(edges, start, end, visited);
		if(ans!=null)
			for(int i : ans) {
				System.out.print(i+" ");
			}

	}

}
