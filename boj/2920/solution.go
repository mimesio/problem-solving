package main

import "fmt"

func getSequenceName(seq [8]int) string {
	isAscending := true
	for i := 1; i < 8; i++ {
		if seq[i] != 1 {
			isAscending = false
		}
	}
	if isAscending {
		return "ascending"
	}

	isDescending := true
	for i := 1; i < 8; i++ {
		if seq[i] != -1 {
			isDescending = false
		}
	}
	if isDescending {
		return "descending"
	}

	return "mixed"
}

func main() {
	var notes, seq [8]int

	for i := 0; i < 8; i++ {
		fmt.Scan(&notes[i])
	}

	for i := 7; i > 0; i-- {
		seq[i] = notes[i] - notes[i-1]
	}
	fmt.Println(getSequenceName(seq))
}
