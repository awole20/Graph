package com.bfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.graph.Graph;

public class Bfs {

	private Graph graph;
	
	public Bfs(Graph graph) {
		this.graph = graph;
	}
	
	public List<HashSet<Integer>> execute(Integer start) {
		
		if(start >= this.graph.size()){
			List<HashSet<Integer>> blank = new ArrayList<HashSet<Integer>>();
			return blank;
		}
		
		Set<Integer> thisLayerList = new HashSet<Integer>();
		thisLayerList.add(start);
		return this.execute(thisLayerList, new HashSet<Integer>(), new ArrayList<HashSet<Integer>>(), new ArrayList<Integer>(), 0);
	}
	
	private List<HashSet<Integer>> execute(Set<Integer> thisLayerList, Set<Integer> nextLayerList, List<HashSet<Integer>> ans, List<Integer> discoveredNodes, int layerNumber) {
		if(thisLayerList.isEmpty() && nextLayerList.isEmpty()){
			return ans;
		}
		if(thisLayerList.isEmpty()){
			return this.execute(nextLayerList, new HashSet<Integer>(), ans, discoveredNodes, layerNumber + 1);
		}
		
		Iterator<Integer> it = thisLayerList.iterator();
		Integer newNode = it.next();
		thisLayerList.remove(newNode);
		discoveredNodes.add(newNode);
		
		nextLayerList.addAll(this.graph.getConnectedList(newNode));
		nextLayerList.removeAll(discoveredNodes);
		
		if(ans.size() <= layerNumber){
			ans.add(layerNumber, new HashSet<Integer>());
		}
		ans.get(layerNumber).add(newNode);
		return this.execute(thisLayerList, nextLayerList, ans, discoveredNodes, layerNumber);
	}
	
}
