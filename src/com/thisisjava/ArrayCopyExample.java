package com.thisisjava;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 얕은 복사 -> 같은 객체 참조 주소를 가진 배열.
		for (int i=0; i<newStrArray.length;i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
	
}
