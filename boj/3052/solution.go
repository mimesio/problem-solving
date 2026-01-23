package main

import "fmt"

func main() {
	var num int
	var check [42]bool

	for i := 0; i < 10; i++ {
		fmt.Scan(&num)
		check[num%42] = true
	}

	result := 0
	for i := 0; i < 42; i++ {
		if check[i] {
			result++
		}
	}
	fmt.Println(result)
}
