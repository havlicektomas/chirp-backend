package dev.havlicektomas.chirp.api.mappers

import dev.havlicektomas.chirp.api.dto.AuthenticatedUserDto
import dev.havlicektomas.chirp.api.dto.UserDto
import dev.havlicektomas.chirp.domain.model.AuthenticatedUser
import dev.havlicektomas.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}