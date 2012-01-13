package com.dijkstra;

import java.util.List;

import com.graph.Graph;

public class Dijkstra {

	public static final int INFINITY = Integer.MAX_VALUE;

	private List<Integer> visited;

	private Graph graph;
	
	public Dijkstra(Graph graph){
		this.graph = graph;
	}
	
	public int findMinimumPath(int source, int destination) {
		if(!graph.isConnected(source, destination)){
			return Dijkstra.INFINITY;
		}
		return graph.getDistance(source, destination);
	}

	
	
}
