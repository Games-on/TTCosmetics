package vn.anpham.cosmetics.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Order.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Order_ {

	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#receiverAddress
	 **/
	public static volatile SingularAttribute<Order, String> receiverAddress;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#orderDetails
	 **/
	public static volatile ListAttribute<Order, OrderDetail> orderDetails;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#receiverPhone
	 **/
	public static volatile SingularAttribute<Order, String> receiverPhone;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#totalPrice
	 **/
	public static volatile SingularAttribute<Order, Double> totalPrice;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#receiverName
	 **/
	public static volatile SingularAttribute<Order, String> receiverName;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#id
	 **/
	public static volatile SingularAttribute<Order, Long> id;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order
	 **/
	public static volatile EntityType<Order> class_;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#user
	 **/
	public static volatile SingularAttribute<Order, User> user;
	
	/**
	 * @see vn.anpham.cosmetics.domain.Order#status
	 **/
	public static volatile SingularAttribute<Order, String> status;

	public static final String RECEIVER_ADDRESS = "receiverAddress";
	public static final String ORDER_DETAILS = "orderDetails";
	public static final String RECEIVER_PHONE = "receiverPhone";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String RECEIVER_NAME = "receiverName";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String STATUS = "status";

}

