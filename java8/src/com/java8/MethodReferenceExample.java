package com.java8;

import java.util.*;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<WordFreq> list = new ArrayList<>();
		
		list.add(new WordFreq("akash more", 2));
		list.add(new WordFreq("hasrshil", 3));
		list.add(new WordFreq("mustejab", 1));
		list.add(new WordFreq("akash patole", 2));
		list.add(new WordFreq("suraj", 3));
		list.add(new WordFreq("akash timande", 1));
		
//		Collections.sort(list, (wf1, wf2) -> {
//			if(wf1.freq != wf2.freq) {
//				return wf1.freq - wf2.freq;
//			}
//			else {
//				return wf1.word.compareTo(wf2.word);
//			}
//		});
		
		Comparator<WordFreq> comaparator = ReferneceHelper :: comparatorHelper;
		Collections.sort(list, comaparator);
		
		for(WordFreq wf : list) {
			System.out.println(wf.word + ", " + wf.freq);
		}
		
	}

}

class WordFreq{
	String word;
	int freq;
	
	public WordFreq(String word, int freq) {
		this.word = word;
		this.freq = freq;
	}
}

class ReferneceHelper{
	public static int comparatorHelper(WordFreq wf1, WordFreq wf2) {
		if(wf1.freq != wf2.freq) {
			return wf1.freq - wf2.freq;
		}
		else {
			return wf1.word.compareTo(wf2.word);
		}
	}
}
