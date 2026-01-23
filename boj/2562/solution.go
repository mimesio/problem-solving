package main

import "fmt"

func getMaxValueAndIndex(nums [9]int) (int, int) {
	max, index := 0, 0
	for i := 0; i < 9; i++ {
		if max < nums[i] {
			max = nums[i]
			index = i
		}
	}
	return max, index + 1
}

func main() {
	var nums [9]int
	for i := 0; i < 9; i++ {
		fmt.Scan(&nums[i])
	}

	max, i := getMaxValueAndIndex(nums)
	fmt.Printf("%d\n%d", max, i)
}
