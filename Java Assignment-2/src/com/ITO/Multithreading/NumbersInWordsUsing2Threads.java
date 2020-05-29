package com.ITO.Multithreading;

public class NumbersInWordsUsing2Threads 
{
	boolean odd=true;
	int count = 1;
	int MAX = 100;
	int place=0;
	int place2=0;
	private static final String[] onesNames = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
	private static final String[] tensNames = {""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
	String HunNam=" Hundred";
	public void printOdd()
	{
		synchronized (this) 
		{
			while (count < MAX)
			{
				while (!odd)
				{
					try
					{						
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(count<20)
				{
					System.out.println( onesNames[count]);

					count++;
					odd = false;
					notify();
				}

				else if(count < MAX)
				{
					System.out.println(tensNames[count/10]+" "+onesNames[count%10]);	
					count++;
					odd = false;
					notify();
				}
				else if(count==100)
				{
					System.out.println(HunNam);
				}


			}
		}
	}

	public void printEven() 
	{
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e1)
		{
			e1.printStackTrace();
		}
		synchronized (this)
		{
			while (count < MAX)
			{
				while (odd) 
				{
					try 
					{
						wait();						
					} catch (InterruptedException e) 
					{
					}
				}
				if(count<20)
				{
					System.out.println(onesNames[count]);
					count++;
					odd = true;
					notify();
				}

				else if(count < MAX)
				{
					System.out.println(tensNames[count/10]+" "+onesNames[count%10]);
					count++;
					odd = true;
					notify();
				}
				else if(count==100)
				{
					System.out.println(HunNam);
					return;
				}


			}
		}
	}

	public static void main(String[] args) 
	{

		NumbersInWordsUsing2Threads obj = new NumbersInWordsUsing2Threads();
		
		Thread t1 = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				obj.printEven();
			}
		});

		Thread t2 = new Thread(new Runnable()
		{
			@Override
			public void run() {
				obj.printOdd();
			}
		});

		t1.start();
		t2.start();




	}
}
