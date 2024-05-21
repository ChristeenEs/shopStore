package com.banquemisr.challenge05.technicalTask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.banquemisr.challenge05.shopStore.controller.ProductController;
import com.banquemisr.challenge05.shopStore.model.Product;
import com.banquemisr.challenge05.shopStore.repository.ProductRepository;

@SpringBootTest
class TechnicalTaskApplicationTests {

	@Test
	void contextLoads() {
	}

	 @InjectMocks
	    private ProductController productController;

	    @Mock
	    private ProductRepository productRepository;

	    @Before(value = "")
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }

	    @Test
	    public void testGetAllProducts() {
	        List<Product> productList = new ArrayList<>();
	        productList.add(new Product("Product 1", "Description 1", 10.0));
	        productList.add(new Product("Product 2", "Description 2", 20.0));

	        when(productRepository.findAll()).thenReturn(productList);

	        List<Product> products = productController.getAllProducts();

	        assertEquals(2, products.size());
	    }

}
