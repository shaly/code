package com.syf.study;

class CreateThread1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("run_2 () i:"+i);
		}
	}
}

/**
 * 
 * @author Administrator
 *
 */
public class ThreadDemo003ImpRunable {
	public static void main(String[] args) {
		
		System.out.println("创建线程开始 main_2");
		CreateThread1 c=new CreateThread1();
		Thread t=new Thread(c);
		t.start();
		System.out.println("创建线程已经启动 main_2");
		for (int i = 0; i < 20; i++) {
			System.out.println("main_2 () i:"+i);
		}
	}
	
	
	//执行结果
	/*创建线程开始 main_2
	创建线程已经启动 main_2
	main_2 () i:0
	main_2 () i:1
	main_2 () i:2
	main_2 () i:3
	main_2 () i:4
	run_2 () i:0
	main_2 () i:5
	run_2 () i:1
	main_2 () i:6
	main_2 () i:7
	main_2 () i:8
	main_2 () i:9
	run_2 () i:2
	main_2 () i:10
	run_2 () i:3
	main_2 () i:11
	run_2 () i:4
	main_2 () i:12
	run_2 () i:5
	main_2 () i:13
	run_2 () i:6
	main_2 () i:14
	run_2 () i:7
	main_2 () i:15
	run_2 () i:8
	main_2 () i:16
	run_2 () i:9
	main_2 () i:17
	run_2 () i:10
	main_2 () i:18
	run_2 () i:11
	main_2 () i:19
	run_2 () i:12
	run_2 () i:13
	run_2 () i:14
	run_2 () i:15
	run_2 () i:16
	run_2 () i:17
	run_2 () i:18
	run_2 () i:19
*/
}
