package Seminar5.CW;

// UserRepository.java
public class UserRepository {
    public User getUserById(int userId) {
// Здесь должен быть код, который получает пользователя из базы данных по его ID
// В данном примере мы просто вернем заглушку
        return new User(userId, "John Doe");
    }
}
