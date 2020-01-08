package com.deloitte.estore.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;
import com.deloitte.estore.service.ProductServiceImpl;
public class ProductServiceImpl implements ProductService {
	ProductRepo repo;
	public ProductServiceImpl()
	{
		repo=new ProductRepoImpl();
	}

	@Override
	public boolean addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return repo.addProduct(product);
	}

	@Override
	public boolean deleteProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return repo.deleteProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return repo.updateProduct(product);
	}

	@Override
	public Product getProductById(int productId) throws Exception {
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps= con.prepareStatement("select * from product where product_id=1011");
		ps.setInt(1, productId);
		ResultSet rs= ps.executeQuery();
		List<Product> products= new ArrayList<>();
		if(rs.next()) {
       Product product= new Product();
        product.setProductId(productId);
        product.setProductName(rs.getString("productName"));
        product.setPrice(rs.getFloat("price"));
		
		}		
		return (Product) products; 
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		
				Connection con=getDbConnection();
				PreparedStatement ps= con.prepareStatement("select * from product");
			
				ResultSet rs= ps.executeQuery();
				List<Product> products= new ArrayList<>();
				while(rs.next()) {
		        Product product= new Product();
		        product.setProductId(rs.getInt("productId"));
		        product.setProductName(rs.getString("productName"));
		        product.setPrice(rs.getFloat("price"));
				products.add(product);
				}		
		return products;
	}

	@Override
	public Connection getDbConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
