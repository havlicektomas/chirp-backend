package dev.havlicektomas.chirp.infra.database.repositories

import dev.havlicektomas.chirp.domain.model.UserId
import dev.havlicektomas.chirp.infra.database.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}