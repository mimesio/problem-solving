package boj.p2108;

import java.util.*;
import java.io.*;

class Main {

    static int N;
    static int[] nums;
    static Map<Integer, Integer> frequencyMap = new HashMap<>();

    public static int getMean() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        float mean = sum / (float) N;

        return Math.round(mean);
    }

    public static int getMedian() {
        return nums[(N-1)/2];
    }

    public static int getRange() {
        int min = nums[0];
        int max = nums[N-1];

        return max-min;
    }

    public static int getMode() {
        initializeFrequencyMap();
        int maxFrequency = getMaxFrequency();
        List<Integer> modeCandidate = getModeCandidate(maxFrequency);

        Integer[] arr = modeCandidate.toArray(new Integer[0]);
        Arrays.sort(arr);

        if (arr.length == 1) return arr[0];
        else  return arr[1];
    }

    private static void initializeFrequencyMap() {
        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
    }

    private static int getMaxFrequency() {
        int maxFrequency = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
            }
        }

        return maxFrequency;
    }

    private static List<Integer> getModeCandidate(int maxFrequency) {
        List<Integer> modeCandidate = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeCandidate.add(entry.getKey());
            }
        }

        return modeCandidate;
    }

    public static void solve() {
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();

        sb.append(getMean()).append('\n')
                .append(getMedian()).append('\n')
                .append(getMode()).append('\n')
                .append(getRange()).append('\n');

        System.out.print(sb.toString());
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}