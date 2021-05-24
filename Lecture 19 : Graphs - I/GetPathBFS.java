// Code : Get Path - BFS
// Send Feedback
// Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
// Find the path using BFS and print the shortest path available.
// Note:
// 1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 2. E is the number of edges present in graph G.
// 3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
// 4. Save the input graph in Adjacency Matrix.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
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

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GetPathBFS {
	
	
public static ArrayList<Integer> getpathBFS(int edges[][], int sv , int ev) {
		
		Queue<Integer> queue = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean visited[] = new boolean [edges.length];
		
		visited[sv]=true;
		queue.add(sv);
		map.put(sv, -1);
		boolean pathFound = false;
		
		while(!queue.isEmpty()) {
			int vertex = queue.poll();
			
			for(int i = 0; i< edges.length ; i++) {
				if(edges[vertex][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
					map.put(i, vertex);
					
					if(i == ev) {
						//Path Found
					    pathFound = true;
						break;

					}
	
				}
			}
			
		}if(pathFound) {
			ArrayList<Integer> path = new ArrayList<>();
			int vertex = ev;
			while(vertex != -1) {
				path.add(vertex);
				int parent = map.get(vertex);
				vertex = parent ;	
			}  return path;
			
		}else {
			return null;
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		int n;
		int e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();
		int edges[][]= new int [n][n];
		
		for(int i=0; i < e ;i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		
		System.out.println("Enter the Start and End :"); 
		int start = s.nextInt();
		int end =   s.nextInt();
		
		ArrayList<Integer> arrayList  = getpathBFS(edges, start, end);
		if(arrayList!=null)
			for(int i : arrayList) {
				System.out.print(i+" ");
			}

	}

}

