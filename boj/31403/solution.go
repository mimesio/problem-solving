package main

import (
	"fmt"
	"strconv"
)

func main() {
	var a, b, c string
	fmt.Scan(&a, &b, &c)

	parsedA, _ := strconv.ParseInt(a, 10, 64)
	parsedB, _ := strconv.ParseInt(b, 10, 64)
	parsedC, _ := strconv.ParseInt(c, 10, 64)
	parsedD, _ := strconv.ParseInt(a+b, 10, 64)

	fmt.Println(parsedA + parsedB - parsedC)
	fmt.Println(parsedD - parsedC)
}
