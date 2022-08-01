package org.exmaple.template.repository;

import org.exmaple.template.model.Newsletter;
import org.exmaple.template.model.User;

import java.util.*;

public class SubscriptionDAO {
    private Map<User, List<Newsletter> > subscriptionMap;

    private static SubscriptionDAO subscriptionDAO = null;

    private SubscriptionDAO() {
        subscriptionMap = new HashMap<>();
    }

    public static SubscriptionDAO getInstance() {
        if (subscriptionDAO == null) {
            subscriptionDAO = new SubscriptionDAO();
        }
        return subscriptionDAO;
    }

    public void addSubscriptionForUser(User user, Newsletter newsletter) {
        List<Newsletter> updatedNewsLetters = new ArrayList<>();
        if (subscriptionMap.containsKey(user)) {
            updatedNewsLetters = subscriptionMap.get(user);

        }
        updatedNewsLetters.add(newsletter);
        subscriptionMap.put(user, updatedNewsLetters);
    }

    public Map<User, List<Newsletter>> getSubscriptionMap() {
        return subscriptionMap;
    }
}
