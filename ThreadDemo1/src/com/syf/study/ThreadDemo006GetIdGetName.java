package com.syf.study;

class ThreadGetIdGetName extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//getId() getName()��Thread�ڲ��ķ�������ֱ�ӵ��ã���ͨ�����ʵ��Runnable�����Ƕ�û�������������ģ�
			//��ȡ�߳�ID*****��ȡ�߳�����
			System.out.println("getId()="+getId()+"******getName()="+getName()+"******run 5i:"+i);	
		}
	}
}


/**
 * getId()��ȡ��ǰ�߳�ID
 * @author Administrator
 *
 */
public class ThreadDemo006GetIdGetName {
	public static void main(String[] args) {
		new ThreadGetIdGetName().start();
		new ThreadGetIdGetName().start();
		ThreadGetIdGetName t3=new ThreadGetIdGetName();
		//�Զ����߳�����
		t3.setName("�߳�3");
		t3.start();
	}
	//ִ�н��
	/*getId()=11******getName()=Thread-0******run 5i:0
	getId()=13******getName()=�߳�3******run 5i:0
	getId()=12******getName()=Thread-1******run 5i:0
	getId()=13******getName()=�߳�3******run 5i:1
	getId()=11******getName()=Thread-0******run 5i:1
	getId()=13******getName()=�߳�3******run 5i:2
	getId()=12******getName()=Thread-1******run 5i:1
	getId()=13******getName()=�߳�3******run 5i:3
	getId()=11******getName()=Thread-0******run 5i:2
	getId()=11******getName()=Thread-0******run 5i:3
	getId()=11******getName()=Thread-0******run 5i:4
	getId()=11******getName()=Thread-0******run 5i:5
	getId()=11******getName()=Thread-0******run 5i:6
	getId()=11******getName()=Thread-0******run 5i:7
	getId()=11******getName()=Thread-0******run 5i:8
	getId()=11******getName()=Thread-0******run 5i:9
	getId()=13******getName()=�߳�3******run 5i:4
	getId()=13******getName()=�߳�3******run 5i:5
	getId()=13******getName()=�߳�3******run 5i:6
	getId()=13******getName()=�߳�3******run 5i:7
	getId()=13******getName()=�߳�3******run 5i:8
	getId()=13******getName()=�߳�3******run 5i:9
	getId()=12******getName()=Thread-1******run 5i:2
	getId()=12******getName()=Thread-1******run 5i:3
	getId()=12******getName()=Thread-1******run 5i:4
	getId()=12******getName()=Thread-1******run 5i:5
	getId()=12******getName()=Thread-1******run 5i:6
	getId()=12******getName()=Thread-1******run 5i:7
	getId()=12******getName()=Thread-1******run 5i:8
	getId()=12******getName()=Thread-1******run 5i:9
*/
}
