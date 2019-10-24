package com.adneom;

import java.util.ArrayList;
import java.util.List;

public class PartitionApp {

	public List<List<Integer>> partition(List<Integer> pList, int n) {

		List<List<Integer>> listPortion = new ArrayList<List<Integer>>();
		int start = 0;
		int i = n;

		for (; i < pList.size(); i += n) {
			List<Integer> portion = pList.subList(start, i);
			List<Integer> list = new ArrayList<Integer>();
			list.addAll(portion);
			listPortion.add(list);
			start = i;
		}

		if (i >= pList.size()) {
			List<Integer> portion = pList.subList(start, pList.size());
			List<Integer> list = new ArrayList<Integer>();
			list.addAll(portion);
			listPortion.add(list);
		}
		return listPortion;
	}
}
