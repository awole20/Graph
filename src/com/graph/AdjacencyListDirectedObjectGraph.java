package com.graph;

import java.util.List;

public class AdjacencyListDirectedObjectGraph<k> extends DirectedObjectGraph<k> {

	public AdjacencyListDirectedObjectGraph(List<k> listObjects){
		this.objectList = listObjects;
		this.graph = new AdjacencyListDirectedGraph(this.objectList.size());
	}
	
}
