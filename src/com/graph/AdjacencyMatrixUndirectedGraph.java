package com.graph;


public class AdjacencyMatrixUndirectedGraph extends UndirectedGraph<Integer>{
	
	public AdjacencyMatrixUndirectedGraph(int size){
		this.graph = new AdjacencyMatrixDirectedGraph(size);
	}

}
