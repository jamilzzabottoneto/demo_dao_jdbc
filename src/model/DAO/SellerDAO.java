package model.DAO;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {

	public void insert(Seller obj);

	public void update(Seller obj);

	public void deleteById(Integer id);

	public Seller findById(Integer id);

	public List<Seller> findAll();

}
