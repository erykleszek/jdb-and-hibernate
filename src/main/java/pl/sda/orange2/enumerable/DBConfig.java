package pl.sda.orange2.enumerable;

public enum DBConfig {
    DB_URL ("jdbc:h2:~/test"),
    USER ("sa"),
    PASSWORD ("sa");

    private String value;

    DBConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

        }
    }

