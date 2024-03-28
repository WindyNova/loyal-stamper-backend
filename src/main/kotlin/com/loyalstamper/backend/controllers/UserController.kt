package com.loyalstamper.backend.controllers

import com.loyalstamper.backend.repositories.UserRepository
import com.loyalstamper.backend.tables.User
import com.loyalstamper.backend.utils.UserId
import org.springframework.web.bind.annotation.*

@RestController
class UserController(
    val userRepository: UserRepository
) {
    @GetMapping("/user/{username}")
    fun user(@PathVariable username: String): List<User> =
        userRepository.findByUsername(username)

    @PostMapping("/save")
    fun save(@RequestBody username: String, email: String, password: String): User =
        userRepository.save(User(username, email, password))

    @DeleteMapping("/delete")
    fun delete(@RequestBody userId: UserId) =
        userRepository.deleteById(userId)

    @DeleteMapping("/deleteall")
    fun deleteAll() =
        userRepository.deleteAll()

}
