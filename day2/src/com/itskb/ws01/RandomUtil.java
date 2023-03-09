package com.itskb.ws01;

import java.util.Random;

public class RandomUtil {
	
	public int getRandomInt1(int from, int to) {
			// Math.random() // 0~1의 난수 생성, 1은 포함안됨.
			// Math.rendom()*(to-from) // to-from이 3이라면 0~2.999...
			int su = (int) (Math.random()*(to-from+1))+from;
			return su;
	}

	public int getRandomInt2(int from, int to) {
			Random r = new Random();
			int su = r.nextInt(to-from+1)+from;
			return su;
	}
}
