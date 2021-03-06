package hrm.infrastructure;

import java.nio.charset.StandardCharsets;

public final class Constants {
    public static final class SQLConstants {
        public static final String ConnectionString = "jdbc:mysql://localhost:3306/human_resources";
        public static final String UserName = "root";
        public static final String Password = "Pass123$";
    }

    public static final class CookieConstants {
        public static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
    }

    public static final class ResourceStrings {
        public static final String ActiveStatus = "Активен";
        public static final String BlockedStatus = "Заблокирован";
    }
}

