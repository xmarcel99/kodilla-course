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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("10/24/2019");
        Item laptop = new Item(new BigDecimal(2400),1,new BigDecimal(1400));
        Product screen = new Product("screen");
        screen.getItems().add(laptop);
        laptop.setProduct(screen);
        invoice.getItems().add(laptop);
        //When
        invoiceDao.save(invoice);
        int resultId = invoice.getId();
        //Then
        Assert.assertNotEquals(0,resultId);
    }
}