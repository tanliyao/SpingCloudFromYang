//package dao;
//
//import com.tly.springcloud.PaymentMain8001;
//import com.tly.springcloud.dao.PaymentDao;
//import com.tly.springcloud.entities.Payment;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
//@RunWith(SpringRunner.class)//这种写法是为了让测试在Spring容器环境下执行。
//@SpringBootTest(classes = {PaymentMain8001.class})
//public class PaymentDaoTest {
//    @Autowired
//    private PaymentDao paymentDao;
//
//    @Test
//    public void getPaymentById() {
//        Payment paymentById = paymentDao.getPaymentById(1L);
//        System.out.println(paymentById);
//    }
//}