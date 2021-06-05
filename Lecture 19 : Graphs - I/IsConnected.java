// Code : Is Connected ?
// Send Feedback
// Given an undirected graph G(V,E), check if the graph G is connected graph or not.
// Note:
// 1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 2. E is the number of edges present in graph G.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
// Output Format :
// The first and only line of output contains "true" if the given graph is connected or "false", otherwise.
// Constraints :
// 0 <= V <= 1000
// 0 <= E <= (V * (V - 1)) / 2
// 0 <= a <= V - 1
// 0 <= b <= V - 1
// Time Limit: 1 second
// Sample Input 1:
// 4 4
// 0 1
// 0 3
// 1 2
// 2 3
// Sample Output 1:
// true
// Sample Input 2:
// 4 3
// 0 1
// 1 3 
// 0 3
// Sample Output 2:
// false 
// Sample Output 2 Explanation
// The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from vertices 0,1,3 to vertex 2. 




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    
    
    public static void DFS(int edges [][], int sv, boolean visited[]) {
		//System.out.println(sv);
		visited[sv] = true;
		int n = edges.length;
		
		for(int i = 0; i < n ; i++) {
			if(edges[sv][i] == 1 && !visited[i]) {
				DFS( edges, i,  visited);
			}
		}
		
	}
	
	
	
	public static boolean isConnected(int edges [][] ,int sv) {               
		boolean visited [] = new boolean [edges.length];
		
				DFS( edges, sv,  visited);
				
				for(int i = 0; i < edges.length; i++) {
					if(!visited[i]) {
						return false;	
					}
				}  return true;
				
			}

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        int n;
		int e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();
        
        if(n == 0 ) {
            System.out.print("true");
            return;
        }        
		int edges[][]= new int [n][n];
		
		for(int i = 0; i < e ; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		
		//System.out.println("Enter the Start :");
		
		int start = 0;
	
		
		System.out.print(isConnected(edges , start));

	}

}
