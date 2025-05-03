package com.nt.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePractice {

	public static void main(String[] args) {
		//insertion and deletion can be possible by both ends
		//Addition-offer,add,offerfirst,offerlast,addfirst,addlast
		//retrieval-peek,peekfirst,peeklast
		//removal-poll,remove,pollfirst,polllast,
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("Banana");
		ad.addFirst("cherry");
		ad.addLast("apple");
		ad.offerFirst("kiwi");
		ad.offer("pear");
		ad.offerLast("mango");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
		System.out.println(ad.size());
	}
	

}
