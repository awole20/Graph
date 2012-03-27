package com.graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedObjectGraph<k> implements DirectedGraph{

	private IntDirectedGraph graph;
	private List<k> objectList = new ArrayList<k>();
	
	public DirectedObjectGraph(List listObjects){
		this.objectList = listObjects;
		this.graph = new AdjacencyListDirectedGraph(this.objectList.size());
	}
	
	public void connect(k vertex1, k vertex2) {
		this.connect(vertex1, vertex2, 1);
	}
	
	public void connect(k vertex1, k vertex2, int distance) {
		int vertex1pos = this.objectList.indexOf(vertex1);
		int vertex2pos = this.objectList.indexOf(vertex1);
		try{
			this.graph.connect(vertex1pos, vertex2pos, distance);
		} catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException("Node not found");
		}
		
	}
	
	public boolean isConnected(k vertex1, k vertex2){
		int vertex1pos = this.objectList.indexOf(vertex1);
		int vertex2pos = this.objectList.indexOf(vertex1);
		try{
			return this.graph.isConnected(vertex1pos, vertex2pos);
		} catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException("Node not found");
		}
	}
	
	@Override
	public List<Integer> getConnectedList(int vertex) {
		return this.graph.getConnectedList(vertex);
	}
	@Override
	public Integer getDistance(int vertex1, int vertex2) {
		return this.graph.getDistance(vertex1, vertex2);
	}
	@Override
	public boolean isConnected(int vertex1, int vertex2) {
		return this.graph.isConnected(vertex1, vertex2);
	}
	@Override
	public int size() {
		return this.graph.size();
	}
	@Override
	public void connect(int vertex1, int vertex2) {
		this.graph.connect(vertex1, vertex2);
	}
	@Override
	public void connect(int vertex1, int vertex2, int distance) {
		this.graph.connect(vertex1, vertex2, distance);
		
	}
	
	
}
