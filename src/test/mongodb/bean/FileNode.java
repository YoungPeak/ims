package test.mongodb.bean;

import java.util.Date;
import java.util.List;

public class FileNode {
	/**
	 * 数据库唯一标识
	 */
	private String id;
	/**
	 * 用户的id
	 */
	private String userId;
	/**
	 * 文件名，展示给用户的
	 */
	private String name;
	/**
	 * 是否为文件夹
	 */
	private boolean isDir;
	/**
	 * 如果是文档，则该参数标识文档类型
	 */
	private int type;
	/**
	 * 创建时间
	 */
	private Date time;
	/**
	 * 上级文件夹的id
	 */
	private String parentId;
	/**
	 * 如果为文档，则会有文件分片
	 */
	private List<BlockNode> blocks;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDir() {
		return isDir;
	}
	public void setDir(boolean isDir) {
		this.isDir = isDir;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<BlockNode> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<BlockNode> blocks) {
		this.blocks = blocks;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
