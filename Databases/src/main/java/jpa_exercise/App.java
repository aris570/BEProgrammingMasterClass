package jpa_exercise;

import f_jpa_example.model.Group;
import jpa_exercise.model.Address;
import jpa_exercise.model.Order;
import jpa_exercise.model.Product;
import jpa_exercise.utils.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Util.createTablesForExercise();

        //TODO create entityManagerFactory from the Exercise Persistence Unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercise");
        //TODO create entityManage
        EntityManager entityManager = emf.createEntityManager();

        Address address = new Address();
        address.setStreet("ethnikis antistasews");
        address.setNumber(22);

        //TODO Save the address
        entityManager.getTransaction().begin();
        entityManager.persist(address);

        Product pen = new Product();
        pen.setName("pen");
        pen.setDescription("a beautiful pen");
        entityManager.persist(pen);

        Product book = new Product();
        book.setName("book");
        book.setDescription("a beautiful book");
        //TODO save the book
        entityManager.persist(book);
        entityManager.getTransaction().commit();

        //TODO create a new order with the address and the products
        entityManager.getTransaction().begin();
        Order order = new Order();
        order.setAddress(address);
        order.setProducts(Arrays.asList(pen, book));
        order.setPrice(13.00);
        order.setOrderDate(LocalDate.now());

        entityManager.persist(order);
        entityManager.getTransaction().commit();

        List<Order> orderList = entityManager.createQuery("select o from Order o").getResultList();
        //orderList.forEach(System.out::println);
        orderList.forEach(o -> System.out.println(o));

        /*System.out.println("********Printing products of order*******");
        for( Order o : orderList ){
            List<Product> pList = o.getProducts();
            System.out.println("order price:" + o.getPrice()+ " |List of Products:");
            for (Product p: pList) {
                System.out.println(p.getName());
            }
        }
*/
        entityManager.close();

        System.out.println("****** Done *******");
    }
}
