package com.masai.model;

public class CoursePlan {
	private int planId;
    private int batchId;
    private String topic;
    private int daynumber;
    private String status;
	public CoursePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoursePlan(int planId, int batchId, String topic, int daynumber, String status) {
		super();
		this.planId = planId;
		this.batchId = batchId;
		this.topic = topic;
		this.daynumber = daynumber;
		this.status = status;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getDaynumber() {
		return daynumber;
	}
	public void setDaynumber(int daynumber) {
		this.daynumber = daynumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CoursePlan [planId=" + planId + ", batchId=" + batchId + ", topic=" + topic + ", daynumber=" + daynumber
				+ ", status=" + status + "]";
	}
    
    

}
