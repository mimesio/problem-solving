package main

import (
	"bufio"
	"fmt"
	"os"
)

func getScore(line string) int {
	result, succeed := 0, 0
	for i := 0; i < len(line); i++ {
		switch line[i] {
		case 'O':
			succeed++
			result += succeed
		case 'X':
			succeed = 0
		}
	}
	return result
}

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var t int
	fmt.Fscan(in, &t)
	for i := 0; i < t; i++ {
		var line string
		fmt.Fscan(in, &line)
		fmt.Fprintln(out, getScore(line))
	}
}
