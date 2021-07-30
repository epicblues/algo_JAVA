package com.thisisjava.chap12.waitnotifyex2;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			System.out.println("데이터가 없습니다. 입력 대기중....");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: " + data);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			System.out.println("데이터가 존재합니다. 출력 대기중....");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();

	}
}
