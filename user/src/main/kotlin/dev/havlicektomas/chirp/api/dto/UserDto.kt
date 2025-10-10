package dev.havlicektomas.chirp.api.dto

import dev.havlicektomas.chirp.domain.model.UserId

data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean,
)