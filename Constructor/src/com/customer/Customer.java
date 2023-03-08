package com.customer;

public class Customer 
{
		private int cid;
		private String cname;
		private String itemname;
		private float price;
		private String status;
		private String phone;
		
		public Customer()
		{
			System.out.println("In default constructor");
			this.cid=9;
			this.cname="vaishnavi";
			this.itemname="TV";
			this.price=9825.0f;
			this.status="Installment";
			this.phone="895647";
			
		}
		public Customer(int cid,String cname,String phone)
		{
			System.out.println("In parameterize constructor1");
			this.cid=cid;
			this.cname=cname;
			this.itemname="Null";
			this.price=0.0f;
			this.status="Unknown";
			this.phone=phone;
		}
		
		
		public Customer(int cid, String cname,String itemname,float price,String status,String phone)
		{
			System.out.println("In parameterize constructor2");
			this.cid=cid;
			this.cname=cname;
			this.itemname=itemname;
			this.price=price;
			this.status=status;
			this.phone=phone;
		}
		public int getCid() 
		{
			return cid;
		}
		public void setCid(int cid) 
		{
			this.cid = cid;
		}
		public String getCname() 
		{
			return cname;
		}
		public void setCname(String cname) 
		{
			this.cname = cname;
		}
		public String getItemname() 
		{
			return itemname;
		}
		public void setItemname(String itemname) 
		{
			this.itemname = itemname;
		}
		public float getPrice() 
		{
			return price;
		}
		public void setPrice(float price) 
		{
			this.price = price;
		}
		public String getStatus() 
		{
			return status;
		}
		public void setStatus(String status) 
		{
			this.status = status;
		}
		public String getPhone() 
		{
			return phone;
		}
		public void setPhone(String phone) 
		{
			this.phone = phone;
			
		}
		public String toString()
		{
			return "Customer Details : "+cid+" "+cname+" "+itemname+" "+price+" "+status+" "+phone;
		}
	}

