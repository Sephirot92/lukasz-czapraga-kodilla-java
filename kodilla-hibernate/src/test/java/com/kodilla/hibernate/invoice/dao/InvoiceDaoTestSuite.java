package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDoSave() {
        //given
        Item item = new Item(new BigDecimal(20), 15);
        Invoice invoice = new Invoice("ONE");
        Product product = new Product("Toothbrush");

        item.setProduct(product);
        item.setInvoice(invoice);

        product.getItems().add(item);
        invoice.getItems().add(item);


        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);

        int idForInvoice = invoice.getId();
        int idForProduct = product.getId();
        int idForItem = item.getId();

        //Then
        Assert.assertNotEquals(0, idForInvoice);
        Assert.assertNotEquals(0, idForProduct);
        Assert.assertNotEquals(0, idForItem);

    }
}
