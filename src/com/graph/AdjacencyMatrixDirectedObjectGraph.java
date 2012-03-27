package com.graph;

import java.util.List;

public class AdjacencyMatrixDirectedObjectGraph<k> extends DirectedObjectGraph<k> {

	public AdjacencyMatrixDirectedObjectGraph(List<k> listObjects){
		this.objectList = listObjects;
		this.graph = new AdjacencyMatrixDirectedGraph(this.objectList.size());
	}
			
}
