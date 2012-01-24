package com.bfs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.graph.AdjacencyListUndirectedGraph;
import com.graph.UndirectedGraph;

public class TestBfs {

	private Bfs bfs;
	
	@Before
	public void setUp() {
		UndirectedGraph undirectedGraph = new AdjacencyListUndirectedGraph(10);
		undirectedGraph.connect(0, 1, 1);
		undirectedGraph.connect(0, 2, 2);
		undirectedGraph.connect(0, 3, 3);
		undirectedGraph.connect(0, 4, 4);
		undirectedGraph.connect(0, 5, 6);
		undirectedGraph.connect(0, 6, 1);
		undirectedGraph.connect(6, 7, 1);
		undirectedGraph.connect(7, 8, 1);
		undirectedGraph.connect(8, 5, 1);
		undirectedGraph.connect(8, 4, 2);
		this.bfs = new Bfs(undirectedGraph);
	}
	
	@Test
	public void testBfs() {
		HashSet<Integer> zeroLayer = this.createSet(1);
		HashSet<Integer> oneLayer = this.createSet(0);
		HashSet<Integer> twoLayer = this.createSet(2, 3, 4, 5, 6);
		HashSet<Integer> threeLayer = this.createSet(7, 8);
		List<HashSet<Integer>> answer = this.createList(zeroLayer, oneLayer, twoLayer, threeLayer);
		assertEquals(answer, bfs.execute(1));
	}
	
	private HashSet<Integer> createSet(int...ints) {
		HashSet<Integer> retVal = new HashSet<Integer>();
		for(Integer i : ints) {
			retVal.add(i);
		}
		return retVal;
	}
	
	private List<HashSet<Integer>> createList(HashSet<Integer>...hashSets) {
		List<HashSet<Integer>> retVal = new ArrayList<HashSet<Integer>>();
		for(HashSet<Integer> i : hashSets) {
			retVal.add(i);
		}
		return retVal;
	}

}
