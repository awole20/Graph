package com.graph;


public class AdjacencyListUndirectedGraph extends UndirectedGraph {

	public AdjacencyListUndirectedGraph(int size){
		this.graph = new AdjacencyListDirectedGraph(size);
	}
	
}
