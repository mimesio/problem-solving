package main

import "fmt"

func main() {
	var a, b, c int
	var result [10]int
	fmt.Scan(&a, &b, &c)

	mul := a * b * c
	for mul > 0 {
		result[mul%10]++
		mul /= 10
	}

	for i := 0; i <= 9; i++ {
		fmt.Println(result[i])
	}
}
