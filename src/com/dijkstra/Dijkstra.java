package com.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.graph.Graph;

public class Dijkstra {

	private class DiscoveredNode implements Comparable<DiscoveredNode> {
		public int node;
		public int distance;
		public boolean visited = false;
		DiscoveredNode(int node, int distance){
			this.node = node;
			this.distance = distance;
		}
		@Override
		public int compareTo(DiscoveredNode o) {
			return this.distance - o.distance;
		}
	}
	
	public static final int INFINITY = Integer.MAX_VALUE;
	
	private Graph graph;
	
	public Dijkstra(Graph graph){
		this.graph = graph;
	}
	
	public int findMinimumPath(int source, int destination) {
		Map<Integer, DiscoveredNode> visited = new HashMap<Integer, DiscoveredNode>(this.graph.size());
		for(int i = 0; i < this.graph.size(); i++){
			visited.put(i, new DiscoveredNode(i, Dijkstra.INFINITY));
			if(i == source){
				visited.get(i).distance = 0;
			}
		}
		return findMinimumPath(source, destination, visited);
	}
	
	private int findMinimumPath(int source, int destination, Map<Integer, DiscoveredNode> discoveredNodeMap){
		
		if(source == destination){
			return discoveredNodeMap.get(destination).distance;
		}
		
		List<DiscoveredNode> sortedList = new ArrayList<DiscoveredNode>(discoveredNodeMap.values());
		Collections.sort(sortedList);
		
		DiscoveredNode temp = null;
		for(int i = 0; i < sortedList.size(); i++){
			temp = sortedList.get(i);
			if(!temp.visited){
				break;
			}
		}
		
		if(temp == null){
			return Dijkstra.INFINITY;
		}
		
		System.out.println("temp is: " + temp.node + " with distance: " + temp.distance);
		
		temp.visited = true;
		List<Integer> listOfConnected = this.graph.getConnectedList(temp.node);
		for(int i = 0; i < listOfConnected.size(); i++){
			
			if(discoveredNodeMap.get(new Integer(listOfConnected.get(i))).visited){
				continue;
			}
			discoveredNodeMap.get(listOfConnected.get(i)).distance = temp.distance + this.graph.getDistance(temp.node, listOfConnected.get(i));
			
		}
		
		return findMinimumPath(temp.node, destination, discoveredNodeMap);
	}

	
	
}
