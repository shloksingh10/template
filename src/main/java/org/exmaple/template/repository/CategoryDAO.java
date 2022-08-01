package org.exmaple.template.repository;

import org.exmaple.template.model.Category;

import java.util.HashMap;
import java.util.Map;

public class CategoryDAO {
    Map<Long, Category> categoryMap;

    private static CategoryDAO categoryDAO = null;

    private CategoryDAO() {
        categoryMap = new HashMap<>();
    }

    public static CategoryDAO getInstance() {
        if (categoryDAO == null) {
            categoryDAO = new CategoryDAO();
        }
        return categoryDAO;
    }

    public void addCategory(Category category) {
        categoryMap.put(category.getId(), category);
    }

    public Map<Long, Category> getCategoryMap() {
        return categoryMap;
    }

    public boolean checkIfCategoryExists(Category category) {
        return checkIfCategoryExists(category.getId());
    }

    public boolean checkIfCategoryExists(Long categoryId) {
        return categoryMap.containsKey(categoryId);
    }
}
