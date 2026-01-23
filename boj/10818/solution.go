package main

import (
	"bufio"
	"fmt"
	"os"
	"slices"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var n, temp int
	var li []int
	fmt.Fscan(in, &n)

	for i := 0; i < n; i++ {
		fmt.Fscan(in, &temp)
		li = append(li, temp)
	}
	fmt.Fprintf(out, "%d %d", slices.Min(li), slices.Max(li))
}
