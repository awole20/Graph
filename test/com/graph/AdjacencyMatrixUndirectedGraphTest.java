package com.graph;


public class AdjacencyMatrixUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	UndirectedGraph initGraph(int size){
		return new AdjacencyMatrixUndirectedGraph(size);
	}
	
}
