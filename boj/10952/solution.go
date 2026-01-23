package main

import (
	"bufio"
	"fmt"
	"os"
)

func isEndLine(a int, b int) bool {
	return a == 0 && b == 0
}

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var a, b int
	for {
		fmt.Fscan(in, &a, &b)
		if isEndLine(a, b) {
			break
		}

		fmt.Fprintln(out, a+b)
	}
}
