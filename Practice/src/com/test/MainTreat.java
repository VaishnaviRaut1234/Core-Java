package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainTreat {

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
        int n = sc.nextInt();
        int[] t = new int[n];
        System.out.println("Enter element");
        for (int i = 0; i < n; i++) 
        {
            t[i] = sc.nextInt();
        }
        //int result = 0;
        int sum = 0;
        int max =0;
        for (int i = 0; i < n; i++) 
        {
            if (t[i]>=sum)
            {
                max++;
                sum += t[i];
            }
        }
        System.out.println(max);
*/
		int n;
		long elm;
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		n = sc.nextInt();
		long sum = 0;
		 System.out.println("Enter element");
		List<Long> v = new ArrayList<Long>();
		for (int i = 0; i < n; ++i) {
			elm = sc.nextLong();
			v.add(elm);
		}
		Collections.sort(v);
		sum = v.get(0);
		for (int i = 1; i < n; ++i) {
			if (v.get(i) >= sum) {
				++cnt;
				sum += v.get(i);
			}
		}
		System.out.println(cnt);
	}

}
