package vn.anpham.cosmetics.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class User_ {

	
	/**
	 * @see vn.anpham.cosmetics.domain.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#address
	 **/
	public static volatile SingularAttribute<User, String> address;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#role
	 **/
	public static volatile SingularAttribute<User, Role> role;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#phone
	 **/
	public static volatile SingularAttribute<User, String> phone;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#fullName
	 **/
	public static volatile SingularAttribute<User, String> fullName;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#orders
	 **/
	public static volatile ListAttribute<User, Order> orders;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#id
	 **/
	public static volatile SingularAttribute<User, Long> id;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#avatar
	 **/
	public static volatile SingularAttribute<User, String> avatar;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;
	
	/**
	 * @see vn.anpham.cosmetics.domain.User#cart
	 **/
	public static volatile SingularAttribute<User, Cart> cart;

	public static final String PASSWORD = "password";
	public static final String ADDRESS = "address";
	public static final String ROLE = "role";
	public static final String PHONE = "phone";
	public static final String FULL_NAME = "fullName";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String AVATAR = "avatar";
	public static final String EMAIL = "email";
	public static final String CART = "cart";

}

