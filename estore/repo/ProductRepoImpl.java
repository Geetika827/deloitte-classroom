package com.deloitte.estore.repo;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;
import com.deloitte.estore.model.Product;
public class ProductRepoImpl implements ProductRepo{

	Connection con=null;
	@Override
	public boolean addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into product_details values(?,?,?)");
		ps.setInt(1, product.getProductId());
		ps.setString(2, product.getProductName());
		ps.setFloat(3, product.getPrice());
		if(ps.executeUpdate()>0)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
   public Connection getDbConnection() throws Exception
   {
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
   return con;
   }
   
	
}
