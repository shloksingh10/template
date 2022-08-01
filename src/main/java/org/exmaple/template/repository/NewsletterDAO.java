package org.exmaple.template.repository;

import org.exmaple.template.model.Newsletter;

import java.util.ArrayList;
import java.util.List;

public class NewsletterDAO {
    private List<Newsletter> newsletterList;

    private static NewsletterDAO newsletterDAO = null;

    private NewsletterDAO() {
        newsletterList = new ArrayList<>();
    }
    public static NewsletterDAO getInstance() {
        if (newsletterDAO == null) {
            newsletterDAO = new NewsletterDAO();
        }
        return newsletterDAO;
    }

    public void addNewsLetter(Newsletter newsletter) {
        newsletterList.add(newsletter);
    }

    public List<Newsletter> getNewsletterList() {
        return newsletterList;
    }
}
