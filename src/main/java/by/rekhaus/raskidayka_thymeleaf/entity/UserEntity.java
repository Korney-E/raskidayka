package by.rekhaus.raskidayka_thymeleaf.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/*Этот класс - это сущность (entity) пользователя.
    Каждое поле (переменная) соответствует столбцу в таблице БД.
    Подобная файловая структура by.rekhaus.entity используется в большинстве проектов
    Для того чтобы Spring сделал таблицу в БД из этого класса его нужно пометить аннотацией @Entity
    Внутри класса указываем поля (переменные) которые будут соответствовать столбцам в таблице

    Чтобы Spring понимал какая переменная является id в БД, ее необходимо пометить аннтацией @Id.
    Для генерации ID (т.к. каждый ID должен иметь уникальное значение) помечаем переменную id
анотацией  @GeneratedValue и указываем стратегию генерации strategy = GenerationType.IDENTITY. Она означает
что Id будет инкрементироваться (1, 2, 3 ...).
    Можно указавать различные стратегии генерации id.
    Далее необходимо создать конструктор по умолчанию:
     ( public UserEtnity() {
     }
    А также геттеры и сетторы

    По начальному условию к этому примеру необходимо чтобы у каждого пользователя был список задач. Эти задачи
могут обновлятся, помечаться как выполненые или не выполненные. Чтобы это реализовать создадим еще одну entity на основании
которой Spring создаст таблицу. Назовем новую entity  TodoEntity и перейдем в созданный класс..
    Для того чтобы связать таблицу (сущьность) UserEntity и TodoEntity необходимо создать еще одну переменную,
    список в котором будет хранится список задач пользователя. и пометить его анотацией @OneToMany один ко многим т.к. у одного
    пользователя может быть много задач и указать в параметрах анотации cascade = CascadeType.ALL это означает что при
    добавлении или удалении пользователя будут добавлятся или удалется его задачи.

    После создания связей между таблицами создадим контроллер TodoController


*/


@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String first_Name;
    private String last_Name;
    private String email;
    private String password;

    public UserEntity() {
    }

    public UserEntity(String username, String first_Name, String last_Name, String email, String password) {
        this.username = username;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}