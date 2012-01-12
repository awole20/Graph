package com.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph {

	private int[][] adjacencyMatrix;

	private int size;
	
	public AdjacencyMatrixGraph(int size) {
		this.size = size;
		adjacencyMatrix = new int[this.size][this.size];
	}

	@Override
	public void connect(int vertex1, int vertex2) {
		connect(vertex1, vertex2, 1);
	}

	@Override
	public void connect(int vertex1, int vertex2, int distance) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		adjacencyMatrix[vertex1][vertex2] = distance;
		adjacencyMatrix[vertex2][vertex1] = distance;
	}
	
	@Override
	public List<Integer> getConnectedList(int vertex) {
		checkIndexOutOfBounds(vertex);
		List<Integer> connectedList = new ArrayList<Integer>();
		for(int i = 0; i < this.size; i++){
			if(this.adjacencyMatrix[vertex][i] > 0){
				connectedList.add(i);
			}
		}
		return connectedList;
	}

	@Override
	public Integer getDistance(int vertex1, int vertex2) {
		if(isConnected(vertex1, vertex2)){
			return adjacencyMatrix[vertex1][vertex2];
		}
		return null;
	}
	
	@Override
	public boolean isConnected(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		return adjacencyMatrix[vertex1][vertex2] > 0;
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
