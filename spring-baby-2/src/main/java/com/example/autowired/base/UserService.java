package com.example.autowired.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class UserService {
    @Autowired(required = false)
    private UserRepository userRepository;

    // right, don't  forget baby steps...
    // required = false , makes this bean not mandatory as collaborator  in this bean,
    // this will signal to spring container that if it does not find the bean in the container it should not throw and exception
    // autowired annotation gives the spring container the control to instantiate the bean and provide it beans that are dependent to it
    // we are in turn trusting spring to obey this contract and that it will inject the bean where ever it is needed
    // this kind of sums up the Inversion of control principle, right we let go of the burden of managing beans and give it to "someone" (container) to handle it for us!
    public void save() {
        if(Objects.isNull(userRepository)) {
            System.out.println("no repository found!");
            return; // return to caller
        }
        this.userRepository.save();
    }

    /*

      @Autowired
       public void setUserRepository(UserRepository userRepository) {
            this.userRepository = userRepository;
        }
        we can do auto-wiring via setter-based dependency injection as well
        interesting stuff, man!
     */
}
