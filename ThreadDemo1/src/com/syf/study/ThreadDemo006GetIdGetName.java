package com.syf.study;

class ThreadGetIdGetName extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//getId() getName()是Thread内部的方法可以直接调用（普通的类和实现Runnable的类是都没有这两个方法的）
			//获取线程ID*****获取线程名称
			System.out.println("getId()="+getId()+"******getName()="+getName()+"******run 5i:"+i);	
		}
	}
}


/**
 * getId()获取当前线程ID
 * @author Administrator
 *
 */
public class ThreadDemo006GetIdGetName {
	public static void main(String[] args) {
		new ThreadGetIdGetName().start();
		new ThreadGetIdGetName().start();
		ThreadGetIdGetName t3=new ThreadGetIdGetName();
		//自定义线程名称
		t3.setName("线程3");
		t3.start();
	}
	//执行结果
	/*getId()=11******getName()=Thread-0******run 5i:0
	getId()=13******getName()=线程3******run 5i:0
	getId()=12******getName()=Thread-1******run 5i:0
	getId()=13******getName()=线程3******run 5i:1
	getId()=11******getName()=Thread-0******run 5i:1
	getId()=13******getName()=线程3******run 5i:2
	getId()=12******getName()=Thread-1******run 5i:1
	getId()=13******getName()=线程3******run 5i:3
	getId()=11******getName()=Thread-0******run 5i:2
	getId()=11******getName()=Thread-0******run 5i:3
	getId()=11******getName()=Thread-0******run 5i:4
	getId()=11******getName()=Thread-0******run 5i:5
	getId()=11******getName()=Thread-0******run 5i:6
	getId()=11******getName()=Thread-0******run 5i:7
	getId()=11******getName()=Thread-0******run 5i:8
	getId()=11******getName()=Thread-0******run 5i:9
	getId()=13******getName()=线程3******run 5i:4
	getId()=13******getName()=线程3******run 5i:5
	getId()=13******getName()=线程3******run 5i:6
	getId()=13******getName()=线程3******run 5i:7
	getId()=13******getName()=线程3******run 5i:8
	getId()=13******getName()=线程3******run 5i:9
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
