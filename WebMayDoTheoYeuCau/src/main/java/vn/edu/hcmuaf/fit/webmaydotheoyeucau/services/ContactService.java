package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ContactDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Contact;

import java.util.List;

public class ContactService {
    ContactDao contactDao;

    public ContactService() {
        contactDao = new ContactDao();
    }

    public List<Contact> getAllContacts() {
        return contactDao.getAllContacts();
    }

    public boolean addContact(Contact contact) {
        return contactDao.addContact(contact);
    }

    public boolean updateContact(Contact contact) {
        return contactDao.updateContact(contact);
    }

    public boolean deleteContact(int id) {
        return contactDao.deleteContact(id);
    }

    public Contact getContactById(int id) {
        return contactDao.getContactByID(id);
    }

    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        System.out.println(contactService.getContactById(1));
    }
}
