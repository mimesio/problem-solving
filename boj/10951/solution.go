package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	for {
		var a, b int
		_, err := fmt.Fscan(in, &a, &b)
		if err != nil {
			break
		}
		fmt.Fprintln(out, a+b)
	}
}
