package com.graph;


public class AdjacencyMatrixUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	protected IntUndirectedGraph initGraph(int size){
		return new AdjacencyMatrixUndirectedGraph(size);
	}
	
}
