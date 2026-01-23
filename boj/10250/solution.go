package main

import (
	"bufio"
	"fmt"
	"os"
)

func getBestRoom(h int, n int) (int, int) {
	y := (n-1)%h + 1
	x := (n-1)/h + 1
	return y, x
}

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var t int
	fmt.Fscan(in, &t)

	for i := 0; i < t; i++ {
		var h, w, n int
		fmt.Fscan(in, &h, &w, &n)

		y, x := getBestRoom(h, n)
		fmt.Printf("%d%02d\n", y, x)
	}
}
