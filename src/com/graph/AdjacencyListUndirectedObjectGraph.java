package com.graph;

import java.util.List;

public class AdjacencyListUndirectedObjectGraph<k> extends UndirectedGraph<k> {

	public AdjacencyListUndirectedObjectGraph(List<k> listObjects){
		this.graph = new AdjacencyListDirectedObjectGraph<k>(listObjects);
	}
	
}
