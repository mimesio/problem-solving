package main

import "testing"

func Test_minusMinutes(t *testing.T) {
	type args struct {
		h       int
		m       int
		minutes int
	}
	tests := []struct {
		name  string
		args  args
		want  int
		want1 int
	}{
		{"default case", args{13, 50, 45}, 13, 5},
		{"negative minute case", args{13, 00, 45}, 12, 15},
		{"negative hour case", args{00, 10, 45}, 23, 25},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got, got1 := minusMinutes(tt.args.h, tt.args.m, tt.args.minutes)
			if got != tt.want {
				t.Errorf("minusMinutes() got = %v, want %v", got, tt.want)
			}
			if got1 != tt.want1 {
				t.Errorf("minusMinutes() got1 = %v, want %v", got1, tt.want1)
			}
		})
	}
}
