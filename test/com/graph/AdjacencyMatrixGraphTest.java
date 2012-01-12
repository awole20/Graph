package com.graph;


public class AdjacencyMatrixGraphTest extends GraphTest {

	@Override
	Graph initGraph(int size){
		return new AdjacencyMatrixGraph(size);
	}
	
}
