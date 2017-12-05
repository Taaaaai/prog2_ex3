package jp.ac.uryukyu.ie.ex3.pair11;

public class Dice{
	private int value; 
	public Dice(){
    	play();
  	}
  	
	
	public int getVal(){ return value; }
 	public void setVal(int value){ this.value= value; }
  	public void play(){
    	value= (int)(Math.random()*6) + 1;
 	 }
}


