package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    private UserDto toDto(User u){
        return new UserDto(u.getId(), u.getName(), u.getEmail());
    }

    private void toEntity(User u, UserDto dto){
        u.setName(dto.name());
        u.setEmail(dto.email());
    }

    @Override
    public UserDto create(UserDto dto) {
        User u = new User();
        toEntity(u, dto);
        User saved = repo.save(u);
        return toDto(saved);
    }

    @Override
    public UserDto update(Long id, UserDto dto) {
        User u = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
        toEntity(u, dto);

        User saved = repo.save(u);

        return toDto(saved);
    }

    @Override
    public UserDto getById(Long id) {
        User u = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
        return toDto(u);
    }

    @Override
    public List<UserDto> getAll() {
        log.info("Getting all users");
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("User", "id", id);
        repo.deleteById(id);
    }
}