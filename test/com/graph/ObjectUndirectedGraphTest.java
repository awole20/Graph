package com.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public abstract class ObjectUndirectedGraphTest {

	@Test
	public void testEmptyGraphHasNoElements(){
		UndirectedGraph<String> graph = initGraph(createList());
		assertEquals(0, graph.size());
	}
	
	@Test
	public void testNonemptyGraphHasElements(){
		UndirectedGraph<String> graph = initGraph(createList("one"));
		assertEquals(1, graph.size());
		graph = initGraph(createList("one","two"));
		assertEquals(2, graph.size());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectingVertexMaxBounds(){
		UndirectedGraph<String> graph = initGraph(createList("one"));
		graph.connect("one","two");
		fail();
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConnectionCheckVertexMaxBounds(){
		UndirectedGraph<String> graph = initGraph(createList("two"));
		graph.isConnected("one","two");
		fail();
	}
	
	@Test
	public void testNonConnectedVertices(){
		UndirectedGraph<String> graph = initGraph(createList("one","two"));
		assertEquals(false, graph.isConnected("one","two"));
	}
	
	@Test
	public void testConnectingTwoVertices(){
		UndirectedGraph<String> graph = initGraph(createList("one","two"));
		graph.connect("one","two");
		assertEquals(true, graph.isConnected("one","two"));
		assertEquals(true, graph.isConnected("two","one"));
	}
	
	@Test
	public void testGetConnectedVertexList(){
		UndirectedGraph<String> graph = initGraph(createList("one","two","three","four"));
		graph.connect("one","two");
		graph.connect("one","three");
		graph.connect("one","four");
		List<String> connectedComponentsZero = createList("two","three","four");
		assertEquals(connectedComponentsZero, graph.getConnectedList("one"));
		List<String> connectedComponentsOne = createList("one");
		assertEquals(connectedComponentsOne, graph.getConnectedList("two"));
	}
	
	@Test
	public void testGetDistanceBetweenUnconnectedComponents(){
		UndirectedGraph<String> graph = initGraph(createList("one","two"));
		assertEquals(null, graph.getDistance("one","two"));
	}
	
	@Test
	public void testGetDistanceBetweenComponents(){
		UndirectedGraph<String> graph = initGraph(createList("one","two"));
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
	
	protected abstract UndirectedGraph<String> initGraph(List<String> nodes);
	
}
