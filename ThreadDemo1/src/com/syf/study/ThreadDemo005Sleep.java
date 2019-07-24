package com.syf.study;

class ThreadSleep extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("run 5i:"+i);
				//sleep作用让当前线程从运行状态变为休眠状态，如果时间到期会回到运行状态。
				//sleep不能释放当前线程的锁
				Thread.sleep(5000);
				
				
				//由于线程间互不影响，所以线程异常只能try catch不能 throw抛出异常
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


/**
 * Thread.sleep(毫秒数);
 * @author Administrator
 *
 */
public class ThreadDemo005Sleep {
	public static void main(String[] args) {
		System.out.println("创建线程开始 main5");
		ThreadSleep c=new ThreadSleep();
		//启动一个线程是调用start方法而不是run方法
		//1.run方法是在主线程进行执行的，没有启动多线程
		//2.start启动了多线程
		c.start();
		System.out.println("创建线程已经启动 main5");
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
	
	//实现结果
	/*创建线程开始 main5
创建线程已经启动 main5
main5 () i:0（1秒执行一次）
run 5i:0（5秒执行一次）
main5 () i:1（1秒执行一次）
main5 () i:2（1秒执行一次）
main5 () i:3（1秒执行一次）
main5 () i:4（1秒执行一次）
main5 () i:5（1秒执行一次）
run 5i:1（5秒执行一次）
main5 () i:6（1秒执行一次）
main5 () i:7（1秒执行一次）
main5 () i:8（1秒执行一次）
main5 () i:9（1秒执行一次）
run 5i:2（5秒执行一次）
run 5i:3（5秒执行一次）
run 5i:4（5秒执行一次）
run 5i:5（5秒执行一次）
run 5i:6（5秒执行一次）
run 5i:7（5秒执行一次）
run 5i:8（5秒执行一次）
run 5i:9（5秒执行一次）
*/

}
