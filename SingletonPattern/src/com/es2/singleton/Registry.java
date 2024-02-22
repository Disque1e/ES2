package com.es2.singleton;

public class Registry {
    private String applicationPath;
    private String connectionString;

    public int x=10;
    private Registry() {
    }

    private static class RegistryHolder {
        private static final Registry INSTANCE = new Registry();
    }

    public static Registry getInstance() {
        return RegistryHolder.INSTANCE;
    }

    public String getPath() {
        return applicationPath;
    }

    public void setPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
