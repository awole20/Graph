package com.graph;


public class AdjacencyMatrixUndirectedGraph extends UndirectedGraph{
	
	public AdjacencyMatrixUndirectedGraph(int size){
		this.graph = new AdjacencyMatrixDirectedGraph(size);
	}

}
