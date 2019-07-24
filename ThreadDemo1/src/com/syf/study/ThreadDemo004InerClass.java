package com.syf.study;
/**
 * 使用内部类创建多线程
 * @author Administrator
 *
 */
public class ThreadDemo004InerClass {
	public static void main(String[] args) {
		System.out.println("创建线程开始 main_3");
		//方式1
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("run_3 () i:"+i);
				}
			}
		}).start();
		//方式2
//		Thread t=new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0;i<20;i++) {
//					System.out.println("run_3 () i:"+i);
//				}
//			}
//		});
//		t.start();
		System.out.println("创建线程已经启动 main_3");
		for (int i = 0; i < 20; i++) {
			System.out.println("main_3 () i:"+i);
		}
	}
	
	//执行结果
	/*创建线程开始 main_3
	创建线程已经启动 main_3
	main_3 () i:0
	main_3 () i:1
	run_3 () i:0
	run_3 () i:1
	run_3 () i:2
	run_3 () i:3
	main_3 () i:2
	run_3 () i:4
	main_3 () i:3
	run_3 () i:5
	main_3 () i:4
	run_3 () i:6
	main_3 () i:5
	run_3 () i:7
	main_3 () i:6
	run_3 () i:8
	run_3 () i:9
	run_3 () i:10
	run_3 () i:11
	run_3 () i:12
	run_3 () i:13
	run_3 () i:14
	run_3 () i:15
	run_3 () i:16
	run_3 () i:17
	run_3 () i:18
	run_3 () i:19
	main_3 () i:7
	main_3 () i:8
	main_3 () i:9
	main_3 () i:10
	main_3 () i:11
	main_3 () i:12
	main_3 () i:13
	main_3 () i:14
	main_3 () i:15
	main_3 () i:16
	main_3 () i:17
	main_3 () i:18
	main_3 () i:19
*/
}
