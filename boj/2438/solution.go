package main

import (
	"fmt"
	"strings"
)

func main() {
	var n int
	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		line := strings.Repeat("*", i)
		fmt.Println(line)
	}
}
