package Graphs1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversal {
	
	public static void printBFSHelper(int edges[][], int sv ,boolean visited[]) {
		
		Queue<Integer> pendingVertices = new LinkedList<>();
		visited[sv]=true;
		pendingVertices.add(sv);
		
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print( currentVertex + " ");
			for(int i = 0; i < edges.length; i++) {
				if(edges[currentVertex][i] == 1 && !visited[i]) {
					// i is unvisited neighbor of currentVertex
					pendingVertices.add(i);
					visited[i]=true;

				}
			}
		}
		
		
	
		
	}
	
	

	public static void printBFS (int edges[][]) {
		
		boolean visited [] = new boolean [edges.length];
		for(int i = 0 ; i < edges.length; i++) {
			if(!visited[i]) {
				printBFSHelper(edges, i , visited);
			}
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
		
		printBFS(edges);
		


	}

}
