package org.example;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18nExample {

    public static void main(String[] args) {

        // 🔸 1. toUpperCase without locale
        String name = "çağrı";
        System.out.println(name.toUpperCase()); // ❌ SpotBugs: DM_CONVERT_CASE

        // 🔸 2. Hard-coded encoding
        byte[] data = "İstanbul".getBytes(); // ❌ SpotBugs: DM_DEFAULT_ENCODING

        // 🔸 3. Date format without locale
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); // ❌ SpotBugs: DATE_FORMAT_WITHOUT_LOCALE
        System.out.println(df.format(new Date()));
    }
}
