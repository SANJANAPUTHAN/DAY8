package day8Revision2;

import java.util.Scanner;

public class ShoeFinal {
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("WELCOME............");
		System.out.println("Enter Shop Name.........");
		String shopName=sc.next();
		System.out.println("Enter Factory Name..........");
		String factoryName=sc.next();
		ShoeShop shop=container.getShopName(shopName,factoryName);
		Shoe shoe=shop.sellShoe(new ShoeCustomer("Sanjana...."));
		System.out.println(shoe);
	}
}
}
class container
{
	public static ShoeShop getShopName(String shopName,String factoryName) throws Exception{
		ShoeShop shop=(ShoeShop)Class.forName(shopName).newInstance();
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryName).newInstance();
		shop.setShoefactory(factory);
		return shop;
		
	}
}
abstract class Shoe
{
	
}
class LeatherShoe extends Shoe
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Leather shoe bought";
	}
}
class SportsShoe extends Shoe
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sports shoe bought";
	}
	
}
interface Manufacturer
{
	
}
interface ShoeManufacturer extends Manufacturer
{
	public Shoe makeShoe() throws Exception;
}
abstract class ShoeFactory implements ShoeManufacturer
{
	private Shoe shoe;
	public final Shoe getShoe() {
		return shoe;
	}
	ShoeFactory()
	{
		
	}
	public final void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
	ShoeFactory(ShoeBuilder builder)
	{
		this.shoe=builder.shoe;
	}
	public static class ShoeBuilder 
	{
		private Shoe shoe;

		public final Shoe getShoe() {
			return shoe;
		}

		public final Shoe setShoe(Shoe shoe) {
			this.shoe = shoe;
			return shoe;
		}
	}
}
class Bata extends ShoeFactory
{

	@Override
	public Shoe makeShoe() throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shoe name:  ");
		Shoe shoe=(Shoe)Class.forName(sc.next()).newInstance();
		return new ShoeFactory.ShoeBuilder().setShoe(shoe);
	}
	
}
class Lakhani extends ShoeFactory
{

	@Override
	public Shoe makeShoe() throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shoe name:  ");
		Shoe shoe=(Shoe)Class.forName(sc.next()).newInstance();
		return new ShoeFactory.ShoeBuilder().setShoe(shoe);
	}
	
}
abstract class Customer
{
	private String name;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	public Customer(String name)
	{
		this.name=name;
	}
}
class ShoeCustomer extends Customer
{

	public ShoeCustomer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
interface Seller
{
	
}
interface ShoeSeller extends Seller
{
	public Shoe sellShoe(Customer customer) throws Exception;
}
abstract class ShoeShop implements ShoeSeller
{
	private ShoeFactory shoefactory;

	public final ShoeFactory getShoefactory() {
		return shoefactory;
	}

	public final void setShoefactory(ShoeFactory shoefactory) {
		this.shoefactory = shoefactory;
	}
	
}
class Khadims extends ShoeShop
{

	@Override
	public Shoe sellShoe(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(customer.getName());
		return getShoefactory().makeShoe();
	}
	
}
 