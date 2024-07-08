public class UserService {

     
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);

    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public void update(User user) {
        userRepository.update(user);
    }
}
