package com.syf.study;

class ThreadSleep extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("run 5i:"+i);
				//sleep�����õ�ǰ�̴߳�����״̬��Ϊ����״̬�����ʱ�䵽�ڻ�ص�����״̬��
				//sleep�����ͷŵ�ǰ�̵߳���
				Thread.sleep(5000);
				
				
				//�����̼߳以��Ӱ�죬�����߳��쳣ֻ��try catch���� throw�׳��쳣
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


/**
 * Thread.sleep(������);
 * @author Administrator
 *
 */
public class ThreadDemo005Sleep {
	public static void main(String[] args) {
		System.out.println("�����߳̿�ʼ main5");
		ThreadSleep c=new ThreadSleep();
		//����һ���߳��ǵ���start����������run����
		//1.run�����������߳̽���ִ�еģ�û���������߳�
		//2.start�����˶��߳�
		c.start();
		System.out.println("�����߳��Ѿ����� main5");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("main5 () i:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
	}
	
	//ʵ�ֽ��
	/*�����߳̿�ʼ main5
�����߳��Ѿ����� main5
main5 () i:0��1��ִ��һ�Σ�
run 5i:0��5��ִ��һ�Σ�
main5 () i:1��1��ִ��һ�Σ�
main5 () i:2��1��ִ��һ�Σ�
main5 () i:3��1��ִ��һ�Σ�
main5 () i:4��1��ִ��һ�Σ�
main5 () i:5��1��ִ��һ�Σ�
run 5i:1��5��ִ��һ�Σ�
main5 () i:6��1��ִ��һ�Σ�
main5 () i:7��1��ִ��һ�Σ�
main5 () i:8��1��ִ��һ�Σ�
main5 () i:9��1��ִ��һ�Σ�
run 5i:2��5��ִ��һ�Σ�
run 5i:3��5��ִ��һ�Σ�
run 5i:4��5��ִ��һ�Σ�
run 5i:5��5��ִ��һ�Σ�
run 5i:6��5��ִ��һ�Σ�
run 5i:7��5��ִ��һ�Σ�
run 5i:8��5��ִ��һ�Σ�
run 5i:9��5��ִ��һ�Σ�
*/

}
