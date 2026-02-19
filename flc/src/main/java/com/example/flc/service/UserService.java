package com.example.flc.service;

import com.example.flc.model.User;
import com.example.flc.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public static Scanner scanner;

    @PostConstruct
    public void start() {
        save();
        show_user();
    }

    public void save() {
        User user = new User("pppppppp@gmail.com", "Kostya");
//        System.out.println("Сохранение пользователя");
//        System.out.println("Введите имя пользователя:");
//        user.setName(scanner.nextLine());
//        System.out.println("Введите email пользователя:");
//        user.setEmail(scanner.nextLine());
        userRepository.save(user);
    }

    public void delete() {
        System.out.println("Удаление пользователя");
        System.out.println("Введите id пользователя:");
        Long id = scanner.nextLong();
        userRepository.deleteById(id);
    }

    public void show_user() {

        userRepository.findAll().forEach(System.out::println);
    }

//    public void edit() {
//        System.out.println("Редактирование пользователя:");
//        System.out.println("Введите id пользователя:");
//        Long id = scanner.nextLong();
//        User Optional<user> = userRepository.findById(id);
//        System.out.println("Введите новое имя пользователя:");
//        user.setName(scanner.nextLine());
//        System.out.println("Введите новый email пользователя:");
//        user.setEmail(scanner.nextLine());
//        userRepository.save(user);
//    }

//    commit
//    close
}
