package com.example.library;

import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

public class StringService {
    public String formatMessage(String firstName, String lastName) {
        String fullName = String.join(" ", StringUtils.trimToEmpty(firstName), StringUtils.trimToEmpty(lastName));
        return Joiner.on(" - ").join("Hello", fullName.trim());
    }
}
