package com.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListUndirectedGraph implements UndirectedGraph {

	private class ConnectedNode{
		public int node;
		public int distance;
		ConnectedNode(int node, int distance){
			this.node = node;
			this.distance = distance;
		}
	}
	
	private int size;
	
	private List<ConnectedNode>[] adjacencyList;
	
	@SuppressWarnings("unchecked")
	public AdjacencyListUndirectedGraph(int size) {
		this.size = size;
		this.adjacencyList = (ArrayList<ConnectedNode>[])new ArrayList[size];
		for(int i = 0; i < size; i++){
			this.adjacencyList[i] = new ArrayList<ConnectedNode>();
		}
	}

	@Override
	public void connect(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		connect(vertex1, vertex2, 1);
	}

	@Override
	public void connect(int vertex1, int vertex2, int distance) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		this.adjacencyList[vertex1].add(new ConnectedNode(vertex2, distance));
		this.adjacencyList[vertex2].add(new ConnectedNode(vertex1, distance));
	}

	@Override
	public List<Integer> getConnectedList(int vertex) {
		checkIndexOutOfBounds(vertex);
		List<Integer> list = new ArrayList<Integer>();
		
		List<ConnectedNode> connectedList = this.adjacencyList[vertex];
		for(int i = 0; i < connectedList.size();i++){
			list.add(connectedList.get(i).node);
		}
		
		return list;
	}

	@Override
	public Integer getDistance(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		List<ConnectedNode> connectedList = this.adjacencyList[vertex1];
		for(int i = 0; i < connectedList.size();i++){
			if(connectedList.get(i).node == vertex2){
				return connectedList.get(i).distance;
			}
		}
		return null;
	}

	@Override
	public boolean isConnected(int vertex1, int vertex2) {
		checkIndexOutOfBounds(vertex1);
		checkIndexOutOfBounds(vertex2);
		List<ConnectedNode> connectedList = this.adjacencyList[vertex1];
		for(int i = 0; i < connectedList.size();i++){
			if(connectedList.get(i).node == vertex2){
				return true;
			}
		}
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
