package dev.havlicektomas.chirp.service.auth

import dev.havlicektomas.chirp.domain.exception.UserAlreadyExistsException
import dev.havlicektomas.chirp.domain.model.User
import dev.havlicektomas.chirp.infra.database.entities.UserEntity
import dev.havlicektomas.chirp.infra.database.mappers.toUser
import dev.havlicektomas.chirp.infra.database.repositories.UserRepository
import dev.havlicektomas.chirp.infra.security.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    fun register(
        email: String,
        username: String,
        password: String
    ): User {
        val user = userRepository.findByEmailOrUsername(
            email = email.trim(),
            username = username.trim()
        )
        if(user != null) {
            throw UserAlreadyExistsException()
        }

        val savedUser = userRepository.save(
            UserEntity(
                email = email.trim(),
                username = username.trim(),
                hashedPassword = requireNotNull(passwordEncoder.encode(password))
            )
        ).toUser()

        return savedUser
    }
}