package com.java.Study.Chap17;

import java.util.stream.IntStream;

public class Sample10 {
	public static void main(String[] args) {
		//직렬 스트림->단일 스레드
		long processTime1 = System.currentTimeMillis();
		IntStream.range(65, 74).forEach(x -> System.out.println(Thread.currentThread().getClass()+" - "+(char)x));
		System.out.println("직렬 스트림 출력시간:"+(System.currentTimeMillis()-processTime1));
		//병렬 스트림->ForkJoinWorkerThread와 함께 처리.
		long processTime2 = System.currentTimeMillis();
		IntStream.range(65, 74).parallel().forEach(x->System.out.println(Thread.currentThread().getClass()+" - "+(char)x));
		System.out.println("병렬 스트림 출력시간:"+(System.currentTimeMillis()-processTime2));
	}
}
