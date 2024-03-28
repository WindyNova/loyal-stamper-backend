package com.loyalstamper.backend.repositories

import com.loyalstamper.backend.tables.User
import com.loyalstamper.backend.utils.UserId
import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
interface UserRepository : CrudRepository<User, UserId> {
    fun findByUsername(username: String): List<User>
}
