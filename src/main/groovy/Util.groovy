package me.zhihan.glabs

class Util {
	static String hello(String who) {
		"Hello, $who"
	}
}


class UtilMain {
	static void main(String[] args) {
		println(args)
		println Util.hello("world")
	}
}
