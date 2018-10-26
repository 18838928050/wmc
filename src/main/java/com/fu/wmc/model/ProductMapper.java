/**
 * 
 */
package com.fu.wmc.model;

/**
 @author： fu    @time：2018年10月25日 下午6:39:58 
 @说明： 一份耕耘，一份收获
**/

public interface ProductMapper {
 
	void addProduct(Product product);
	
	Product selectById(int id);
}

