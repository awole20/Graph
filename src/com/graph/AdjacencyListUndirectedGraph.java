package com.graph;


public class AdjacencyListUndirectedGraph extends UndirectedGraph<Integer> {

	public AdjacencyListUndirectedGraph(int size){
		this.graph = new AdjacencyListDirectedGraph(size);
	}
	
}
