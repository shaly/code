package com.syf.study;

class RunnableGetIdGetName implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//实现Runnable的类获取线程ID*****获取线程名称
			System.out.println("id="+Thread.currentThread().getId()+"*****name="+Thread.currentThread().getName()+"*****i="+i);
		}
	}
}


/**
 * getId()获取当前线程ID
 * @author Administrator
 *
 */
public class ThreadDemo007RunnableGetIdGetName {
	public static void main(String[] args) {
		new Thread(new RunnableGetIdGetName()).start();
		
		for (int i = 0; i < 20; i++) {
			//普通类获取线程ID*****获取线程名称
			System.out.println("id="+Thread.currentThread().getId()+"*****name="+Thread.currentThread().getName()+"*****i="+i+"main###");
		}
	}
	//执行结果
	/*id=1*****name=main*****i=0main###
	id=1*****name=main*****i=1main###
	id=11*****name=Thread-0*****i=0
	id=11*****name=Thread-0*****i=1
	id=11*****name=Thread-0*****i=2
	id=11*****name=Thread-0*****i=3
	id=11*****name=Thread-0*****i=4
	id=11*****name=Thread-0*****i=5
	id=1*****name=main*****i=2main###
	id=1*****name=main*****i=3main###
	id=11*****name=Thread-0*****i=6
	id=1*****name=main*****i=4main###
	id=1*****name=main*****i=5main###
	id=1*****name=main*****i=6main###
	id=1*****name=main*****i=7main###
	id=1*****name=main*****i=8main###
	id=1*****name=main*****i=9main###
	id=1*****name=main*****i=10main###
	id=1*****name=main*****i=11main###
	id=1*****name=main*****i=12main###
	id=1*****name=main*****i=13main###
	id=1*****name=main*****i=14main###
	id=1*****name=main*****i=15main###
	id=1*****name=main*****i=16main###
	id=1*****name=main*****i=17main###
	id=1*****name=main*****i=18main###
	id=11*****name=Thread-0*****i=7
	id=11*****name=Thread-0*****i=8
	id=11*****name=Thread-0*****i=9
	id=1*****name=main*****i=19main###
*/
	
	
}
