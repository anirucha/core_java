package com.capgemini.lesson20.interthread.factory;

public class Factory {

	  private  int  data ;
	  private boolean flag=false ;
	  
	  public synchronized void  set(int data)
	  {
		     try {
				if(flag)
				{ 
					wait();
				}
			System.out.println(" SET :"+data);
				 this.data = data;
				 flag=true;
				 notifyAll();
			} catch (InterruptedException e) {
				throw  new RuntimeException(e.getMessage());
			}
	  }
	  public synchronized int   get()
	  {
		     try {
				if(flag==false)
				{ 
					wait();
				}
				System.out.println(" GET :"+data);		 
				 flag=false ;
				 notifyAll();
			} catch (InterruptedException e) {
				throw  new RuntimeException(e.getMessage());
			}
		     return(data);
	  }
	  
}
