package com.ysp.Entity;

import java.time.LocalDate;
import java.util.List;

public class Pnr {
	private int pnrNo;
	private int trainNo;
	private LocalDate travelDate;
	private List<Passenger> passenger;
	
	public Pnr() {
		super();
	}
	public Pnr(int pnrNo, int trainNo, LocalDate travelDate, List<Passenger> passenger) {
		super();
		this.pnrNo = pnrNo;
		this.trainNo = trainNo;
		this.travelDate = travelDate;
		this.passenger = passenger;
	}
	public int getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
}
