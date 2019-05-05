package test.mongodb.bean;

public class BlockNode {
	
	private String fs_id;
	/**
	 * 分片名称，暂时定为随机生成的32位字符串
	 */
	private String name;
	/**
	 * 分开大小
	 */
	private long size;
	/**
	 * 存放的网盘名称
	 */
	private String disk;
	/**
	 * 第几个分片
	 */
	private int seq;
	public String getFs_id() {
		return fs_id;
	}
	public void setFs_id(String fs_id) {
		this.fs_id = fs_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	
}
