package dev.havlicektomas.chirp.infra.database.mappers

import dev.havlicektomas.chirp.domain.model.User
import dev.havlicektomas.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}