package com.graph;

import java.util.ArrayList;
import java.util.List;

public abstract class DirectedObjectGraph<k> implements DirectedGraph<k>{

	protected DirectedGraph<Integer> graph;
	protected List<k> objectList = new ArrayList<k>();
	
	@Override
	public void connect(k vertex1, k vertex2) {
		this.connect(vertex1, vertex2, 1);
	}
	
	@Override
	public void connect(k vertex1, k vertex2, int distance) {
		int vertex1pos = this.objectList.indexOf(vertex1);
		int vertex2pos = this.objectList.indexOf(vertex2);
		
		try{
			this.graph.connect(vertex1pos, vertex2pos, distance);
		} catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException("Node not found");
		}
	}
	
	@Override
	public boolean isConnected(k vertex1, k vertex2){
		int vertex1pos = this.objectList.indexOf(vertex1);
		int vertex2pos = this.objectList.indexOf(vertex2);
		try{
			return this.graph.isConnected(vertex1pos, vertex2pos);
		} catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException("Node not found");
		}
	}

	@Override
	public List<k> getConnectedList(k vertex) {
		List<k> connectedValues = new ArrayList<k>();
		int vertexPos = this.objectList.indexOf(vertex);
		List<Integer> positionList = this.graph.getConnectedList(vertexPos);
		for(int i = 0; i < positionList.size(); i++){
			connectedValues.add(this.objectList.get(positionList.get(i)));
		}
		return connectedValues;
	}

	@Override
	public Integer getDistance(k vertex1, k vertex2) {
		int vertex1pos = this.objectList.indexOf(vertex1);
		int vertex2pos = this.objectList.indexOf(vertex2);
		
		return this.graph.getDistance(vertex1pos, vertex2pos);
	}

	@Override
	public int size() {
		return this.graph.size();
	}
	
	
}
