package com.syf.study;

class CreateThread extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("run () i:"+i);
		}
	}
}

/**
 * 
 * @author Administrator
 *
 */
public class ThreadDemo002Extends {
	public static void main(String[] args) {
		System.out.println("�����߳̿�ʼ main");
		CreateThread c=new CreateThread();
		//����һ���߳��ǵ���start����������run����
		//1.run�����������߳̽���ִ�еģ�û���������߳�
		//2.start�����˶��߳�
		c.start();
		System.out.println("�����߳��Ѿ����� main");
		for (int i = 0; i < 20; i++) {
			System.out.println("main () i:"+i);
			int a=1/0;
			
		}
		
		
		
		
		//1.runִ�н����������ִ�У����̴߳�������ִ�У�
		/*�����߳̿�ʼ main
		run () i:0
		run () i:1
		run () i:2
		run () i:3
		run () i:4
		run () i:5
		run () i:6
		run () i:7
		run () i:8
		run () i:9
		run () i:10
		run () i:11
		run () i:12
		run () i:13
		run () i:14
		run () i:15
		run () i:16
		run () i:17
		run () i:18
		run () i:19
		�����߳��Ѿ����� main
		main () i:0
		main () i:1
		main () i:2
		main () i:3
		main () i:4
		main () i:5
		main () i:6
		main () i:7
		main () i:8
		main () i:9
		main () i:10
		main () i:11
		main () i:12
		main () i:13
		main () i:14
		main () i:15
		main () i:16
		main () i:17
		main () i:18
		main () i:19
*/
		
		//2.startִ�н��������ִ��(���߳�״̬)
		/*�����߳̿�ʼ main
		�����߳��Ѿ����� main
		main () i:0
		main () i:1
		run () i:0
		main () i:2
		run () i:1
		main () i:3
		run () i:2
		main () i:4
		run () i:3
		main () i:5
		main () i:6
		main () i:7
		main () i:8
		main () i:9
		run () i:4
		main () i:10
		run () i:5
		run () i:6
		run () i:7
		run () i:8
		run () i:9
		run () i:10
		main () i:11
		main () i:12
		main () i:13
		main () i:14
		main () i:15
		main () i:16
		run () i:11
		main () i:17
		main () i:18
		main () i:19
		run () i:12
		run () i:13
		run () i:14
		run () i:15
		run () i:16
		run () i:17
		run () i:18
		run () i:19
*/
		
		
		
		
		//3.ע�⣺�����߳��л���Ӱ�죬���̱߳�����Ӱ�����߳�ִ��
		/*�����߳̿�ʼ main
		�����߳��Ѿ����� main
		main () i:0
		run () i:0
		run () i:1
		run () i:2
		run () i:3
		run () i:4
		run () i:5
		run () i:6
		run () i:7
		run () i:8
		run () i:9
		run () i:10
		run () i:11
		Exception in thread "main" run () i:12java.lang.ArithmeticException: / by zero

		run () i:13
		run () i:14
		run () i:15
		run () i:16
		run () i:17
		run () i:18
		run () i:19
			at com.syf.study.ThreadDemo002Extends.main(ThreadDemo002Extends.java:27)
*/
	}
}
