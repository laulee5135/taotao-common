package com.taotao.common.pojo;

import java.util.List;

/**
 * 前端页面所需json数据封装的pojo [数据格式：{total:”2”,rows:[{“id”:”1”,”name”,”张三”},{“id”:”2”,”name”,”李四”}]}]
 * @author LauLee
 *
 * 2017年7月9日
 */
public class EasyUIDataGridResult {
	
	private long total;
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	

}
