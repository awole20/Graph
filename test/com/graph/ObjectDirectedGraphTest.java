package com.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public abstract class ObjectDirectedGraphTest {

	@Test
	public void testEmptyGraphHasNoElements(){
		DirectedGraph<String> graph = initGraph(createList());
		assertEquals(0, graph.size());
	}
	
	@Test
	public void testNonemptyGraphHasElements(){
		DirectedGraph<String> graph = initGraph(createList("one"));
		assertEquals(1, graph.size());
		graph = initGraph(createList("one","two"));
		assertEquals(2, graph.size());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectingVertexMaxBounds(){
		DirectedGraph<String> graph = initGraph(createList("one"));
		graph.connect("one","two");
		fail();
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectionCheckVertexMaxBounds(){
		DirectedGraph<String> graph = initGraph(createList("two"));
		graph.isConnected("one","two");
		fail();
	}
	
	@Test
	public void testNonConnectedVertices(){
		DirectedGraph<String> graph = initGraph(createList("one","two"));
		assertEquals(false, graph.isConnected("one","two"));
	}
	
	@Test
	public void testConnectingTwoVertices(){
		DirectedGraph<String> graph = initGraph(createList("one","two"));
		graph.connect("one","two");
		assertEquals(true, graph.isConnected("one","two"));
		assertEquals(false, graph.isConnected("two","one"));
	}
	
	@Test
	public void testGetConnectedVertexList(){
		DirectedGraph<String> graph = initGraph(createList("one","two","three","four"));
		graph.connect("one","two");
		graph.connect("one","three");
		graph.connect("one","four");
		List<String> connectedComponentsZero = createList("two","three","four");
		assertEquals(connectedComponentsZero, graph.getConnectedList("one"));
		List<String> connectedComponentsOne = createList();
		assertEquals(connectedComponentsOne, graph.getConnectedList("two"));
	}
	
	@Test
	public void testGetDistanceBetweenUnconnectedComponents(){
		DirectedGraph<String> graph = initGraph(createList("one","two"));
		assertEquals(null, graph.getDistance("one","two"));
	}
	
	@Test
	public void testGetDistanceBetweenComponents(){
		DirectedGraph<String> graph = initGraph(createList("one","two"));
		graph.connect("one","two", 5);
		assertEquals(new Integer(5), graph.getDistance("one","two"));
	}
	
	private List<String> createList(String...strings){
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < strings.length; i++){
			list.add(strings[i]);
		}
		return list;
	}
	
	protected abstract DirectedGraph<String> initGraph(List<String> nodes);
	
}
