package com.graph;


public class AdjacencyListUndirectedGraph extends IntUndirectedGraph {

	public AdjacencyListUndirectedGraph(int size){
		this.graph = new AdjacencyListDirectedGraph(size);
	}
	
}
