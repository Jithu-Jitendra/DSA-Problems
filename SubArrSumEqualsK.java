package com.basicProblems;

import java.util.HashMap;
import java.util.Scanner;

class SubArrSumEqualsK {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int prefSum = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];

            if (hm.containsKey(prefSum - k)) {
                cnt += hm.get(prefSum - k);
            }

            hm.put(prefSum, hm.getOrDefault(prefSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        SubArrSumEqualsK obj1 = new SubArrSumEqualsK();

        int ans = obj1.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + ans);

        sc.close();
    }
}