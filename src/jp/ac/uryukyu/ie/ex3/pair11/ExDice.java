package jp.ac.uryukyu.ie.ex3.pair11;

public class ExDice extends Dice{
	private int minvalue;
	private int maxvalue; 
	public ExDice(int minvalue,int maxvalue){
		this.minvalue = minvalue;
		this.maxvalue = maxvalue;
	}
	@Override
	public void play(){
		setVal((int)(Math.random()*3 + 5));
	}
	public int getminvalue(){ return minvalue; }
	
	public void setminvalue(int minvalue){ this.minvalue = minvalue; }
	
	public int getmaxvalue(){ return maxvalue; }
	
	public void setmaxvalue(int maxvalue){ this.maxvalue = maxvalue; }
	
	
}	
