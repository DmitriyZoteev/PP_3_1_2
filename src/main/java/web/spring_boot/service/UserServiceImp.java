package web.spring_boot.service;

import org.springframework.stereotype.Service;
import web.spring_boot.dao.UserRepository;
import web.spring_boot.model.User;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private UserRepository userRepository;

   public UserServiceImp(UserRepository userDao) {
      this.userRepository = userDao;
   }

   @Override
   public void saveOrChangeUser(User user) {
      userRepository.save(user);
   }

   @Override
   public void deleteUser(Long id) {
      userRepository.deleteById(id);
   }

   @Override
   public List<User> getUsers() {
      return userRepository.findAll();
   }

   @Override
   public User getUserById(Long id) {
      return userRepository.findById(id).orElse(null);
   }
}
