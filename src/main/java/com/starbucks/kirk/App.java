package com.starbucks.kirk;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Args size: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println(Joiner.on("--").join(Lists.newArrayList(4,5,3,5,10)));
		
		Sets.newHashSet(4,5,2,1,5,9,10);
		System.out.println("Hello World!");
		
		
	}
}
