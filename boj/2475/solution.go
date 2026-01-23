package main

import "fmt"

func main() {
	var temp int

	sum := 0
	for i := 0; i < 5; i++ {
		fmt.Scan(&temp)
		sum += temp * temp
	}
	fmt.Println(sum % 10)
}
