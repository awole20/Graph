package com.graph;


public class AdjacencyMatrixUndirectedGraph extends IntUndirectedGraph{
	
	public AdjacencyMatrixUndirectedGraph(int size){
		this.graph = new AdjacencyMatrixDirectedGraph(size);
	}

}
