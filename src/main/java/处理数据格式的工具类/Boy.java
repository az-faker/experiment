package 处理数据格式的工具类;

/**
 * Boy实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-02 18:17:41
 */
public class Boy {
    private Long id;
    private String name;
    private Integer age;
    private Integer grade;

    public Boy(Long id, String name, Integer age, Integer grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
