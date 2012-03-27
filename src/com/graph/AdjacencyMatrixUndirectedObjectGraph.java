package com.graph;

import java.util.List;

public class AdjacencyMatrixUndirectedObjectGraph<k> extends UndirectedGraph<k> {

	public AdjacencyMatrixUndirectedObjectGraph(List<k> listObjects){
		this.graph = new AdjacencyMatrixDirectedObjectGraph<k>(listObjects);
	}
	
}
