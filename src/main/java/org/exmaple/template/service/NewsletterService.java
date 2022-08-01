package org.exmaple.template.service;

import org.exmaple.template.model.Category;
import org.exmaple.template.model.Newsletter;
import org.exmaple.template.repository.CategoryDAO;
import org.exmaple.template.repository.NewsletterDAO;
import org.exmaple.template.repository.SubscriptionDAO;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NewsletterService {

    private NewsletterDAO newsletterDAO;
    private CategoryDAO categoryDAO;
    private SubscriptionDAO subscriptionDAO;

    public NewsletterService() {
        newsletterDAO = NewsletterDAO.getInstance();
        categoryDAO = CategoryDAO.getInstance();
        subscriptionDAO = SubscriptionDAO.getInstance();
    }

    public List<Newsletter> getNewsLetterByCategory(Category category) {
        return getNewsLetterByCategory(category.getId());
    }

    public List<Newsletter> getNewsLetterByCategory(Long categoryId) {
        if (!categoryDAO.checkIfCategoryExists(categoryId)) {
            throw new IllegalArgumentException("Category doesn't exist");
        }
        List<Newsletter> newsletterList = newsletterDAO.getNewsletterList();
        return newsletterList.stream()
                .filter(newsletter -> Objects.equals(newsletter.getCategoryId(), categoryId))
                .collect(Collectors.toList());
    }

    public void addCategory(Category category) {
        if (categoryDAO.checkIfCategoryExists(category)) {
            throw new IllegalArgumentException("Category id already exists");
        }
        categoryDAO.addCategory(category);
    }

    public void addNewsLetter(Newsletter newsletter) {
        if (!categoryDAO.checkIfCategoryExists(newsletter.getCategoryId())) {
            throw new IllegalArgumentException("Category doesn't exist");
        }
        newsletterDAO.addNewsLetter(newsletter);
    }
}
