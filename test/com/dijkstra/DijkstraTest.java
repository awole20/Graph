package com.dijkstra;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.graph.AdjacencyListUndirectedGraph;
import com.graph.UndirectedGraph;


public class DijkstraTest {

	Dijkstra dijkstra;
	
	@Before
	public void setUpGraph(){
		UndirectedGraph undirectedGraph = new AdjacencyListUndirectedGraph(10);
		undirectedGraph.connect(0, 1, 1);
		undirectedGraph.connect(0, 2, 2);
		undirectedGraph.connect(0, 3, 3);
		undirectedGraph.connect(0, 4, 4);
		undirectedGraph.connect(0, 5, 4);
		dijkstra = new Dijkstra(undirectedGraph);
	}
	
	@Test
	public void testTwoUnconnectedComponentsHaveDistanceOfInfinity(){
		assertEquals(Dijkstra.INFINITY, dijkstra.findMinimumPath(0, 6));
	}
	
	@Test
	public void testConnectedNeighbors(){
		assertEquals(1, dijkstra.findMinimumPath(0, 1));
	}
	
	@Test
	public void testConnectedThroughCommonNode(){
		assertEquals(3, dijkstra.findMinimumPath(1, 2));
	}
	
}
