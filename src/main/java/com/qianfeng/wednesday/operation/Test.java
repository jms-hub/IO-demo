public class Test {
	 /*途中：  1.兔子跑到10米的时候,谦让乌龟一下，接着跑
     2.兔子跑到50米的时候，再让龟1毫秒,接着跑
     3.兔子跑到80米的时候，睡了50毫秒，接着跑
	分析： 兔子跑步的能力强，乌龟跑步的能力弱（优先级的设置）
     1.兔子跑到10米的时候,谦让乌龟一下，接着跑（yield方法）
     2.兔子跑到50米的时候，再让龟1毫秒,接着跑（sleep方法）
     3.兔子跑到80米的时候，睡了50毫秒，接着跑（sleep方法）
     4.乌龟全程没有停留
*/

    public static void main(String[] args) {
//表示乌龟这个线程
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                try {
                    //乌龟持续跑，跑一百米
                    for (int i=1;i<101;i++){
                        Thread.sleep(10);
                        System.out.println("乌龟跑了:"+i+"米");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
//表示兔子这个线程
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                try {
                    //兔子也是要跑完100米的，i表示当前跑的是第几米
                    for (int i=1;i<101;i++){
                        Thread.sleep(10);//每十毫米跑一米
                        System.out.println("兔子跑了:"+i+"米");
                        if(i==10){
                            Thread.yield();
                            System.out.println("兔子跑到10米的时候,谦让乌龟一下");
                        }
                        if(i==50){
                            Thread.sleep(1);
                            System.out.println("兔子跑到50米的时候，再让龟1毫秒");
                        }
                        if(i==80){
                            Thread.sleep(50);
                            System.out.println("兔子跑到80米的时候，睡了50毫秒");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.setPriority(1);
        thread1.start();
        thread2.setPriority(5);
        thread2.start();
    }
}