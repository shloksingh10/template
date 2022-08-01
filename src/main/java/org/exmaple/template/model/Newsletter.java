package org.exmaple.template.model;

public class Newsletter {
    private Long id;

    private Long categoryId;

    private String title;

    private Amount price;

    public Newsletter(Long id, Long categoryId, String title, Amount price) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public Amount getPrice() {
        return price;
    }
}
