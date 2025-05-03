package com.nt.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer,String> map=new Hashtable<Integer,String>();	//keep any thing in place of hashtable keep hashmap,treemap,linkedhashmap same all
		map.put(5050, "Hyderabad");
		map.put(6050, "Chennai");
		map.put(8050, "Kerala");
		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key);
		}
		
		Collection<String> values=map.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		System.out.println(map.get(5050));
		
		
		
		for(Integer key:keys) {
			System.out.println(key+">>>>>"+map.get(key));
		}
		
		System.out.println(map);
		
		//map.remove(5050);
		//System.out.println(map);
		
		System.out.println(map.containsKey(6050));
		System.out.println(map.containsValue("Hyderabad"));
		map.put(8050,"Mumbai");
		map.putIfAbsent(8080, "Gujarat");
		map.replace(8080, "Kolkata");
		System.out.println(map);
		System.out.println(map.size());
		//map.clear();
		Set<Entry<Integer,String>> entries=map.entrySet();
		for(Entry<Integer,String> entry:entries) {
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+">>>>>>"+value);
		}
		
	}
}
