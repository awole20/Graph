package com.graph;

import java.util.List;

public class UndirectedObjectGraph<k> extends UndirectedGraph<k> {

	public UndirectedObjectGraph(List<k> listObjects){
		this.graph = new DirectedObjectGraph<k>(listObjects);
	}
	
}
