package com.ryan.workstealing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamApp {

	static List<Transaction> transactions = new ArrayList<>();

	static {
		transactions.add(new Transaction(1, Transaction.STANDBY, 0.93));
		transactions.add(new Transaction(2, Transaction.GROCERY, 3.72));
		transactions.add(new Transaction(3, Transaction.SHOPPING, 22.93));
		transactions.add(new Transaction(4, Transaction.GROCERY, 440.93));
	}

	public static void main(String[] args) {
		priorTo8();
		version8();
	}


	private static void priorTo8() {

		List<Transaction> groceryTransactions = new ArrayList<>();
		for(Transaction t: transactions){
			if(t.getType() == Transaction.GROCERY){
				groceryTransactions.add(t);
			}
		}
		Collections.sort(groceryTransactions, new Comparator<Transaction>(){
			public int compare(Transaction t1, Transaction t2){
				return t2.getValue().compareTo(t1.getValue());
			}
		});

		List<Integer> transactionIds = new ArrayList<>();
		for(Transaction t: groceryTransactions){
			transactionIds.add(t.getId());
		}

		System.out.println(transactionIds);
	}

	private static void version8() {

		System.out.println(transactions.stream()
				.filter(t -> t.getType() == Transaction.GROCERY)
				.sorted(new Comparator<Transaction>() {
					@Override
					public int compare(Transaction o1, Transaction o2) {
						return o1.getValue().compareTo(o2.getValue());
					}
				})
				.map(Transaction::getId).toArray());
	}
}
