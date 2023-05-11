package ch15.sec04.exam01;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map<key의 타입, 저장할 값의 타입> 을 명시한다.
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size()); //map은 key값이 같은 데이트를 중복 저장 할 수 없다.
		
		//키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();
		//전체 데이터 출력하는 방법1
		
		
		//키를 전부 가져온다.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { //키의 갯수만큼 반복해준다.
			String k = keyIterator.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
		
		//전체 데이터 출력하는 방법2
		
		map.remove("홍길동");
		Set<String> keySet2 = map.keySet();
		Iterator<String> keyIterator2 = keySet.iterator();
		
		while(keyIterator2.hasNext()) { //키의 갯수만큼 반복해준다.
			String k = keyIterator.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
	}

}
