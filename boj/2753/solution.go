package main

import "fmt"

func isLeapYear(year int) bool {
	if year%4 != 0 {
		return false
	}
	if year%100 == 0 && year%400 != 0 {
		return false
	}
	return true
}

func main() {
	var year int
	fmt.Scan(&year)

	if isLeapYear(year) {
		fmt.Println(1)
	} else {
		fmt.Println(0)
	}
}
