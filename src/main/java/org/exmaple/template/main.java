package org.exmaple.template;

import org.exmaple.template.model.Amount;
import org.exmaple.template.model.Category;
import org.exmaple.template.model.Newsletter;
import org.exmaple.template.service.NewsletterService;

public class main {
    public static void main(String[] args) {
        NewsletterService newsletterService = new NewsletterService();
        Category category1 = new Category(1L, "SCIENCE");
        Category category2 = new Category(2L, "TECHNOLODY");
        Category category3 = new Category(3L, "FINANCE");
        newsletterService.addCategory(category1);
        newsletterService.addCategory(category2);
        newsletterService.addCategory(category3);
        Newsletter newsletter1 = new Newsletter(1L, 1L, "Shlok Science", new Amount(Amount.CurrencyType.INR, 10.0));
        Newsletter newsletter2 = new Newsletter(2L, 3L, "Shlok FINACE", new Amount(Amount.CurrencyType.INR, 10.0));
        Newsletter newsletter3 = new Newsletter(2L, 5L, "Shlok FUNNY", new Amount(Amount.CurrencyType.INR, 10.0));
        newsletterService.addNewsLetter(newsletter1);
        newsletterService.addNewsLetter(newsletter2);
        newsletterService.addNewsLetter(newsletter3);

        System.out.println(newsletterService.getNewsLetterByCategory(1L));

    }
}
