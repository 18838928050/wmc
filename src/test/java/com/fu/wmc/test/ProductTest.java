/**
 * 
 */
package com.fu.wmc.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fu.wmc.model.Product;
import com.fu.wmc.model.ProductMapper;

 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProductTest {
 
	@Autowired
	private ProductMapper productMapper;
	
	@Test
	public void insertAndSelect() {
		Product product1 = new Product();
		product1.setName("tom");
		product1.setPrice(99.9f);
		productMapper.addProduct(product1);
		assertTrue(product1.getId() > 0);
		
		Product product2 = productMapper.selectById(product1.getId());
		assertTrue(product2.getId() == product1.getId());
		assertTrue(product2.getName().equals(product1.getName()));
	}
}