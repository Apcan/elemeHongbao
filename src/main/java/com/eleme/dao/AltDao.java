package com.eleme.dao;

import org.apache.ibatis.annotations.Param;
import com.eleme.entity.Alt;

public interface AltDao {
	/*
	 * 根据ID查找实体
	 */
	public Alt findById(@Param("id") Integer id);
	
	/*
	 * 使用次数+1
	 */
	public void addUseNum(Integer id);
	
	/*
	 * 修改手机号
	 */
	public void changePhoneNum(@Param("id")Integer id, @Param("phoneNum")String phoneNum);
	
	/**
	 * 查找最大id
	 */
	public Integer findMaxId();
	
	/**
	 * 添加Cookie
	 */
	public void insertCookie(@Param("avatar") String avatar,@Param("elemeKey") String elemeKey,@Param("phoneNum") String phoneNum);
	
	/**
	 * 检查Cookie是否重复
	 * @param avatar
	 * @return
	 */
	public Integer checkCookieRepeat(String elemeKey);

}
