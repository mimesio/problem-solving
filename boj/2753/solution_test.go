package main

import "testing"

func Test_isLeapYear(t *testing.T) {
	type args struct {
		year int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{"min value", args{1}, false},
		{"max value", args{4000}, true},
		{"4 value case", args{4}, true},
		{"100 value case", args{100}, false},
		{"400 value case", args{400}, true},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isLeapYear(tt.args.year); got != tt.want {
				t.Errorf("isLeapYear() = %v, want %v", got, tt.want)
			}
		})
	}
}
