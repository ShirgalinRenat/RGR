package kalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		//Расстояние=800
		//Расход топлива на 100 км=7
		//Стоимость топлива=30
		int k1=800,k2=7,k3=30,r1=k2*k3,r2=k1/100;
		int s1=r2*r1,s2=r2*k2;
		int test1=1680;
		int test2=56;
		// проверка
		assertEquals((int)test2,s2);
		//int test2=56;
		//assertEquals((int)test1,s2);
	}

}
