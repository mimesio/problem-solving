package main

import "fmt"

func main() {
	var line string
	fmt.Scan(&line)

	var alphabet [26]int
	for i := 0; i < 26; i++ {
		alphabet[i] = -1
	}

	for i := 0; i < len(line); i++ {
		alp := line[i] - 'a'
		if alphabet[alp] == -1 {
			alphabet[alp] = i
		}
	}

	for i := 0; i < 26; i++ {
		fmt.Printf("%d ", alphabet[i])
	}
}
