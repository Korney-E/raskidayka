//package by.rekhaus.raskidayka_thymeleaf.repository;
//
//
////...Данный интерфейс является репозиторием. С помощью репозиториев можно получать каки либо
////данные из БД, изменять и и удолять их. Репозитории являются интерфейсами - обязательно
////Все репозитории должны наследоваться от CrudRepository.
////Crud расшифровывается как Create, Read, Update, Delete т.е. основные действия над объектами.
////Перейдем в репозиторий CrudRepository...
////В треугольных скобках <UserEntity, Long> первым параметром указываем сущность с которой этот
////репозиторий будет работать а вторым тип его индификатора т.е. id
////данный репозиторий необходимо исполдьзовать внури контроллера, в этом случае в контроллере UserController
////... Создадим функцию для поиска по нужному столбцу. Для этого содаем функцию (метод) которая будет возвращать
////etitiy пользователя UserEtnity и назовем ее findByUsername. Название нужно указывать в соответствии с тем параметром
////(названием столбца) по которому будет производится поиск в этом случае ищем по username. Если бы искали по паролю то
////функцию нужно было назвать findByPassword.
////В качестве параметра функция (метод) findByUsername будет принимать (что логично) String username. Далее переходим
////в контроллер UserController и вызываем эту функцию у объекта userRepo...
//
//
//import by.rekhaus.raskidayka_thymeleaf.entity.UserEntity;
//import org.springframework.data.repository.CrudRepository;
//
//public interface UserRepositoryV1 extends CrudRepository<UserEntity, Long> {
//    UserEntity findByUsername(String username);
//
//    UserEntity deleteByUsername(String username);
//
//}

