package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    public void testInvoiceDoSave() {
        //given
        Item item = new Item(new BigDecimal(20), 20, new BigDecimal(400));
        itemDao.save(item);
        Item item1 = new Item(new BigDecimal(10), 20, new BigDecimal(200));
        itemDao.save(item1);


    }
}
