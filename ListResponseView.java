package com.movie.view;

public class ListResponseView {
	private long total;
	private Object list;
	
	public ListResponseView(long total, Object list) {
		super();
		this.total = total;
		this.list = list;
	}
	public long getTotal() {
		return total;
	}
	public Object getList() {
		return list;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public void setList(Object list) {
		this.list = list;
	}
}
