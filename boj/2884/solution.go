package main

import "fmt"

func minusMinutes(h int, m int, minutes int) (int, int) {
	adjustedH, adjustedM := h, m-minutes
	if adjustedM < 0 {
		adjustedH -= 1
		adjustedM += 60
	}
	if adjustedH < 0 {
		adjustedH += 24
	}
	return adjustedH, adjustedM
}

func main() {
	var h, m int
	fmt.Scan(&h, &m)

	adjustedH, adjustedM := minusMinutes(h, m, 45)
	fmt.Printf("%d %d", adjustedH, adjustedM)
}
