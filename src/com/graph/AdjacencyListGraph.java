package com.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph implements Graph {

	private int size;
	
	private List<Integer>[] adjacencyList;
	
	public AdjacencyListGraph(int size) {
		this.size = size;
		this.adjacencyList = (ArrayList<Integer>[])new ArrayList[size];
		for(int i = 0; i < size; i++){
			this.adjacencyList[i] = new ArrayList<Integer>();
		}
	}

	@Override
	public void connect(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		
	}

	@Override
	public void connect(int vertex1, int vertex2, int distance) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);

	}

	@Override
	public List<Integer> getConnectedList(int vertex) {
		checkIndexOutOfBounds(vertex);
		return this.adjacencyList[vertex];
	}

	@Override
	public Integer getDistance(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		return null;
	}

	@Override
	public boolean isConnected(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		return false;
	}

	@Override
	public int size() {
		return this.size;
	}

	private void checkIndexOutOfBounds(int index) {
		if(index >= this.size){
			throw new IndexOutOfBoundsException("attempted to access node " + index + " but size of graph is " + this.size);
		}
	}
	
}
