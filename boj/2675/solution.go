package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var t int
	fmt.Fscan(in, &t)

	for i := 0; i < t; i++ {
		var n int
		var s string
		fmt.Fscan(in, &n, &s)

		for j := 0; j < len(s); j++ {
			fmt.Fprint(out, strings.Repeat(string(s[j]), n))
		}
		fmt.Fprintln(out)
	}
}
