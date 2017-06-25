package com.fuhao.interperter.vimscript.function;

import java.util.List;

/**
 *
 */
public interface CommandInterface {

	//读取一行或多行
	String getline(String regx);

	String getline(Integer regx);

	String getline(Integer start,Integer end);

	// 设置一行或多行

	void setline(Integer locate,String... infos);


	// 插入一行或多行

	void append(Integer locate,String...infos);

	//获取指定行倩的空格数

	Integer indent(Integer num);

	// 根据正则查找制定行

	String search(String pattern);

	// 返回指定位置的列号 col({expr})

	Integer col(String rex);

	Integer col(Integer line,String rex);

	// 返回制定位置的行号

	List<Integer> getpos(String rex);// 返回[0,x,y,0]

	//返回当前光标所在的行号

	Integer line(String rexp);

	// 移动光标到指定位置

	void setpost(String rexp,List<Integer> pos);
}
