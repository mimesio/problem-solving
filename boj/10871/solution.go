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

	var n, x, a int
	fmt.Fscan(in, &n, &x)
	for i := 0; i < n; i++ {
		fmt.Fscan(in, &a)

		if a < x {
			fmt.Fprintf(out, "%d ", a)
		}
	}
}
