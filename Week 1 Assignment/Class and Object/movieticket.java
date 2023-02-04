package dxc;

import java.util.Scanner;

class ticket
{
	private int movieid;
	private int noOfSeats;
	
	public ticket(int id,int seat)
	{
		movieid=id;
		noOfSeats=seat;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int id) {
		this.movieid = id;
	}

	public int getNo_ofseat() {
		return noOfSeats;
	}

	public void setNo_ofseat(int seat) {
		this.noOfSeats = seat;
	}
	public double getCost1()
	{
		
		return((double)noOfSeats*7);	
		
	}
	public double getCost2()
	{
		
		return((double)noOfSeats*8);	
		
	}
	public double getCost3()
	{
		
		return((double)noOfSeats*8.5);	
		
	}
	
}

public class movieticket {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int id,seat;
		System.out.println("Enter movie id:");
		id=s.nextInt();
		System.out.println("Enter no. of Seats:");
		seat=s.nextInt();
		ticket t=new ticket(id,seat);
		if(id==111)
		System.out.println("Total amount for booking:$"+t.getCost1());
		else if(id==112)
			System.out.println("Total amount for booking:$"+t.getCost2());
		else if(id==113)
			System.out.println("Total amount for booking:$"+t.getCost3());
		else
			System.out.println("sorry!please enter valid movie id and no of seats");
	}

}