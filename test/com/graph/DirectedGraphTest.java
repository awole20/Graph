package com.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public abstract class DirectedGraphTest {
	@Test
	public void testEmptyGraphHasNoElements(){
		DirectedGraph<Integer> graph = initGraph(0);
		assertEquals(0, graph.size());
	}
	
	@Test
	public void testNonemptyGraphHasElements(){
		DirectedGraph<Integer> graph = initGraph(1);
		assertEquals(1, graph.size());
		graph = initGraph(2);
		assertEquals(2, graph.size());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectingVertexMaxBounds(){
		DirectedGraph<Integer> graph = initGraph(1);
		graph.connect(0,1);
		fail();
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectionCheckVertexMaxBounds(){
		DirectedGraph<Integer> graph = initGraph(1);
		graph.isConnected(0,1);
		fail();
	}
	
	@Test
	public void testNonConnectedVertices(){
		DirectedGraph<Integer> graph = initGraph(2);
		assertEquals(false, graph.isConnected(0,1));
	}
	
	@Test
	public void testConnectingTwoVertices(){
		DirectedGraph<Integer> graph = initGraph(2);
		graph.connect(0,1);
		assertEquals(true, graph.isConnected(0,1));
		assertEquals(false, graph.isConnected(1,0));
	}
	
	@Test
	public void testGetConnectedVertexList(){
		DirectedGraph<Integer> graph = initGraph(4);
		graph.connect(0,1);
		graph.connect(0,2);
		graph.connect(0,3);
		List<Integer> connectedComponentsZero = createList(1,2,3);
		assertEquals(connectedComponentsZero, graph.getConnectedList(0));
		List<Integer> connectedComponentsOne = createList();
		assertEquals(connectedComponentsOne, graph.getConnectedList(1));
	}
	
	@Test
	public void testGetDistanceBetweenUnconnectedComponents(){
		DirectedGraph<Integer> graph = initGraph(2);
		assertEquals(null, graph.getDistance(0,1));
	}
	
	@Test
	public void testGetDistanceBetweenComponents(){
		DirectedGraph<Integer> graph = initGraph(2);
		graph.connect(0,1, 5);
		assertEquals(new Integer(5), graph.getDistance(0,1));
	}
	
	private List<Integer> createList(Integer...integers){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < integers.length; i++){
			list.add(integers[i]);
		}
		return list;
	}
	
	protected abstract DirectedGraph<Integer> initGraph(int size);
}
