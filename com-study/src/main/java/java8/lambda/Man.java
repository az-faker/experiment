package java8.lambda;

/**
 * Man实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-22 08:53:47
 */
public class Man {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
