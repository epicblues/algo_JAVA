package com.thisisjava.chap12.waitnotifyex2;

public class ProducerThread extends Thread {
	private DataBox dataBox;

	public DataBox getDataBox() {
		return dataBox;
	}

	public void setDataBox(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 3; i++) {
			dataBox.setData("Data - " + i);

		}
	}
}
