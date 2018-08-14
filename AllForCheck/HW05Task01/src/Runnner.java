import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;


public class Runnner {

	public static void main(String[] args) {
		List <Integer> listArray = new ArrayList<>();
		List <Integer> listLinked = new LinkedList<>();
		Set <Integer> setHash = new HashSet<>();
		Set <Integer> setTree = new TreeSet<>();
		addListArray(listArray);
		addListLinked(listLinked);
		addSetHash(setHash);
		addSetTree(setTree);
	}
	
	
	
	public static void addListArray(List list) {
		long timeAddListArray = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}

		System.out.println("TimeAddListArray: " + (System.currentTimeMillis() - timeAddListArray));
		long timeSearchListArray = System.currentTimeMillis();
		list.get(555555);
		System.out.println("TimeSearchListArray: " + (System.currentTimeMillis() - timeSearchListArray));
		long timeRemoveListArray = System.currentTimeMillis();
		list.remove(666666);
		System.out.println("TimeRemoveListArray: " + (System.currentTimeMillis() - timeRemoveListArray));

		
	}
	public static void addListLinked(List list) {
		long timeAddListLinked = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		System.out.println("TimeAddListLinked: " + (System.currentTimeMillis() - timeAddListLinked));
		long timeSearchListLinked = System.currentTimeMillis();
		list.get(555555);
		System.out.println("TimeSearchListLinked: " + (System.currentTimeMillis() - timeSearchListLinked));
		long timeRemoveListLinked = System.currentTimeMillis();
		list.remove(666666);
		System.out.println("TimeRemoveListLinked: " + (System.currentTimeMillis() - timeRemoveListLinked));
	}
	
	public static void addSetHash(Set set) {
		long timeAddSetHash = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			set.add(i);
		}
		System.out.println("TimeAddSetHash: " + (System.currentTimeMillis() - timeAddSetHash));
		long timeSearchSetHash = System.currentTimeMillis();
//		System.out.println(set.(555555));
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			if(iter.next().equals(555555)) {
				System.out.println("TimeSearchSetHash: " + (System.currentTimeMillis() - timeSearchSetHash));
			}
		}
		long timeRemoveSetHash = System.currentTimeMillis();
		set.removeAll(set);
		System.out.println("TimeRemoveSetHash: " + (System.currentTimeMillis() - timeRemoveSetHash));
	}
	
	public static void addSetTree(Set set) {
		long timeAddSetTree = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			set.add(i);
		}
//		System.out.println(set);
		System.out.println("TimeAddSetTree: " + (System.currentTimeMillis() - timeAddSetTree));
		long timeSearchSetTree = System.currentTimeMillis();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			if(iter.next().equals(555555)) {
				System.out.println("TimeSearchSetTree: " + (System.currentTimeMillis() - timeSearchSetTree));
			}
		}

		long timeRemoveSetTree = System.currentTimeMillis();
		set.remove(666666);
		System.out.println("TimeRemoveSetTree: " + (System.currentTimeMillis() - timeRemoveSetTree));
	}
}
