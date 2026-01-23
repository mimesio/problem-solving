package main

import (
	"fmt"
)

func main() {
	var n int
	var line string
	fmt.Scan(&n, &line)

	result := 0
	for i := 0; i < n; i++ {
		result += int(line[i] - '0')
	}
	fmt.Println(result)
}
